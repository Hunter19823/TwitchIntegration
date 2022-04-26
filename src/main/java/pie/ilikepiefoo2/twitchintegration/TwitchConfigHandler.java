package pie.ilikepiefoo2.twitchintegration;

import com.github.philippheuer.credentialmanager.domain.OAuth2Credential;
import com.github.philippheuer.credentialmanager.identityprovider.TwitchIdentityProvider;
import com.github.twitch4j.TwitchClient;
import com.github.twitch4j.TwitchClientBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.MinecraftForge;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pie.ilikepiefoo2.twitchintegration.events.TwitchClientInitEvent;

import java.util.Collections;
import java.util.List;

import static pie.ilikepiefoo2.twitchintegration.TwitchIntegration.CREDENTIALS;

public class TwitchConfigHandler {
    private static final Logger LOGGER = LogManager.getLogger(TwitchConfigHandler.class);
    public static class Common {
        public final ForgeConfigSpec.BooleanValue enabled;

        public final ForgeConfigSpec.ConfigValue<String> oAuthToken;
        public final ForgeConfigSpec.ConfigValue<String> chatAccountOAuthToken;
        public final ForgeConfigSpec.ConfigValue<String> clientId;
        public final ForgeConfigSpec.ConfigValue<String> clientSecret;
        public final ForgeConfigSpec.ConfigValue<List<? extends String>> botOwnerIds;
        public final ForgeConfigSpec.ConfigValue<String> chatServer;

        public final ForgeConfigSpec.BooleanValue twitchChat;
        public final ForgeConfigSpec.BooleanValue twitchHelix;
        public final ForgeConfigSpec.BooleanValue twitchKraken;
        public final ForgeConfigSpec.BooleanValue twitchPubSub;
        public final ForgeConfigSpec.BooleanValue graphQL;
        public final ForgeConfigSpec.BooleanValue extensions;
        public final ForgeConfigSpec.BooleanValue tmi;

        public final ForgeConfigSpec.BooleanValue forgeEvents;

        public Common(ForgeConfigSpec.Builder builder)
        {
            builder.push("enable");
            enabled = builder
                    .comment("Enable Twitch integration")
                    .define("enabled", false);
            builder.push("authorizations");
            oAuthToken  = builder
                    .comment("Twitch O Auth token. Used for many features of the twitch API.")
                    .define("oAuthToken","");
            chatAccountOAuthToken  = builder
                    .comment("Twitch O Auth token for the chat user. Will default to normal OAuth if none provided.")
                    .define("chatAccountOAuthToken","");
            clientId  = builder
                    .comment("Twitch Client ID.")
                    .define("clientId","");
            clientSecret  = builder
                    .comment("Twitch Client Secret.")
                    .define("clientSecret","");
            botOwnerIds = builder
                    .comment("List of bot owner ids to be used with the twitch client.")
                    .defineList("botOwnerIds",
                            Collections.emptyList(),
                            s -> s instanceof String && ResourceLocation.tryParse((String) s) != null
                    );
            chatServer  = builder
                    .comment("Chat Server.")
                    .define("chatServer","");
            builder.pop();
            builder.push("twitchFeatures");
            twitchChat  = builder
                    .comment("Enable/Disable Twitch chat API")
                    .define("twitchChat",false);
            twitchHelix  = builder
                    .comment("Enable/Disable Twitch Helix API")
                    .define("twitchHelix",false);
            twitchKraken  = builder
                    .comment("Enable/Disable Twitch Kraken API. (Deprecated)")
                    .define("twitchKraken",false);
            twitchPubSub  = builder
                    .comment("Enable/Disable Twitch PubSub API")
                    .define("twitchPubSub",false);
            graphQL  = builder
                    .comment("Enable/Disable graphQL API")
                    .define("graphQL",false);
            extensions  = builder
                    .comment("Enable/Disable extensions API")
                    .define("extensions",false);
            tmi  = builder
                    .comment("Enable/Disable tmi API")
                    .define("tmi",false);
            builder.pop();
            builder.push("libraryFeatures");
            forgeEvents = builder
                    .comment("Enable/Disable Auto-Generated Forge Event Handlers")
                    .define("forgeEvents",true);
        }
    }

    public static final Common COMMON;
    public static final ForgeConfigSpec COMMON_SPEC;
    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();
    }
    private static TwitchClient CLIENT;

    public static TwitchClient getClient()
    {
        if(CLIENT == null)
            buildClient();
        return CLIENT;
    }

    public static void onConfigLoad()
    {
        buildClient();
    }

    private static void buildClient()
    {
        if(COMMON.enabled.get()) {
            LOGGER.info("Building Twitch Client...");

            LOGGER.info("Overriding Existing OauthToken...");
            if (CREDENTIALS != null) CREDENTIALS.setAccessToken(COMMON.oAuthToken.get());
            else CREDENTIALS = new OAuth2Credential("twitch", COMMON.oAuthToken.get());

            if (CLIENT != null) {
                LOGGER.info("Closing Existing Client...");
                CLIENT.close();
            }
            LOGGER.info("Building new client...");
            TwitchClientBuilder builder = TwitchClientBuilder.builder();
            if (COMMON.twitchChat.get()) {
                LOGGER.info("Building with TwitchChat Enabled...");
                builder = builder.withEnableChat(true);
            }
            if (COMMON.twitchHelix.get()) {
                LOGGER.info("Building with TwitchHelix Enabled...");
                builder = builder.withEnableHelix(true);
            }
            if (COMMON.twitchKraken.get()) {
                LOGGER.info("Building with TwitchKraken Enabled...");
                builder = builder.withEnableKraken(true);
            }
            if (COMMON.twitchPubSub.get()) {
                LOGGER.info("Building with TwitchPubSub Enabled...");
                builder = builder.withEnablePubSub(true);
            }
            if (COMMON.graphQL.get()) {
                LOGGER.info("Building with graphQL Enabled...");
                builder = builder.withEnableGraphQL(true);
            }
            if (COMMON.extensions.get()) {
                LOGGER.info("Building with Extensions Enabled...");
                builder = builder.withEnableExtensions(true);
            }
            if (COMMON.tmi.get()) {
                LOGGER.info("Building with TMI Enabled...");
                builder = builder.withEnableTMI(true);
            }
            if (COMMON.clientId.get().length() > 0) {
                LOGGER.info("Building Using Client Id...");
                builder = builder.withClientId(COMMON.clientId.get());
            }
            if (COMMON.clientSecret.get().length() > 0) {
                LOGGER.info("Building Using Client Secret...");
                builder = builder.withClientId(COMMON.clientSecret.get());
            }
            if (COMMON.chatAccountOAuthToken.get().length() > 0) {
                LOGGER.info("Building Using Chat Account using Chat OAuth token");
                builder = builder.withChatAccount(new com.github.philippheuer.credentialmanager.domain.OAuth2Credential("twitch", COMMON.chatAccountOAuthToken.get()));
            }
            else {
                LOGGER.info("Building Using Chat Account using Existing OAuth token");
                builder = builder.withChatAccount(CREDENTIALS);
            }
            if (COMMON.botOwnerIds.get().size() > 0) {
                LOGGER.info("Building using {} existing bot owner ids...", COMMON.botOwnerIds.get().size());
                for (String ownerId : COMMON.botOwnerIds.get())
                    builder = builder.withBotOwnerId(ownerId);
            }
            if (COMMON.chatServer.get().length() > 0) {
                LOGGER.info("Building using Chat Server...");
                builder = builder.withChatServer(COMMON.chatServer.get());
            }
            LOGGER.info("Building with default OAuthToken...");
            builder = builder.withDefaultAuthToken(CREDENTIALS);

            LOGGER.info("Building Client...");
            try {
                CLIENT = builder.build();
                LOGGER.debug("Posting new Twitch Client Init Event...");
                MinecraftForge.EVENT_BUS.post(new TwitchClientInitEvent(CLIENT));
                LOGGER.debug("Posting new Twitch Client Init Event Posted...");
            } catch (Exception e) {
                LOGGER.error("Twitch Client Failed to build...", e);
            }

            if (COMMON.forgeEvents.get()) {
                LOGGER.info("Attaching Auto-generated forge events...");
                TwitchEventHandler.attachForgeEventHandlers(CLIENT);
            }
        }else{
            if(CLIENT != null) {
                CLIENT.close();
            }
            LOGGER.info("Twitch Integration has been Disabled.");
            LOGGER.info("See Twitch Integration config to enable.");
        }
    }
}
