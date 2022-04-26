package pie.ilikepiefoo2.twitchintegration;


import com.github.philippheuer.credentialmanager.domain.OAuth2Credential;
import com.github.twitch4j.auth.providers.TwitchIdentityProvider;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("twitchintegration")
public class TwitchIntegration {
    public static final String MOD_ID = "twitchintegration";
    public static final String MOD_NAME = "TwitchIntegration";
    private static final Logger LOGGER = LogManager.getLogger(TwitchIntegration.class);
    public static OAuth2Credential CREDENTIALS = null;

    public TwitchIntegration()
    {
        LOGGER.info("Twitch Integration Initializing");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, TwitchConfigHandler.COMMON_SPEC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(( ModConfigEvent.Loading e ) -> TwitchConfigHandler.onConfigLoad());
        FMLJavaModLoadingContext.get().getModEventBus().addListener(( ModConfigEvent.Reloading e) -> TwitchConfigHandler.onConfigLoad());
    }
}
