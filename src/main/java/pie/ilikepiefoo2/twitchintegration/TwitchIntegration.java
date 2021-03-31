package pie.ilikepiefoo2.twitchintegration;


import com.github.philippheuer.credentialmanager.domain.OAuth2Credential;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("twitchintegration")
public class TwitchIntegration {
    public static final String MOD_ID = "twitchintegration";
    public static final String MOD_NAME = "TwitchIntegration";
    public static final OAuth2Credential CREDENTIALS = new OAuth2Credential("twitch",TwitchConfigHandler.COMMON.oAuthToken.get());;
    public TwitchIntegration()
    {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, TwitchConfigHandler.COMMON_SPEC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener((ModConfig.Loading e) -> TwitchConfigHandler.onConfigLoad());
        FMLJavaModLoadingContext.get().getModEventBus().addListener((ModConfig.Reloading e) -> TwitchConfigHandler.onConfigLoad());
    }

}
