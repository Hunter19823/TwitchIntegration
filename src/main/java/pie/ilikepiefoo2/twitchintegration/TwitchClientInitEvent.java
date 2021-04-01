package pie.ilikepiefoo2.twitchintegration;

import com.github.twitch4j.TwitchClient;
import net.minecraftforge.eventbus.api.Event;

public class TwitchClientInitEvent extends Event {
    public final TwitchClient twitchClient;

    public TwitchClientInitEvent( TwitchClient twitchClient )
    {
        this.twitchClient = twitchClient;
    }
}
