package pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.common.events.channel;


@Deprecated
public class ChannelGoLiveEventFE extends net.minecraftforge.eventbus.api.Event {
    public final com.github.twitch4j.common.events.channel.ChannelGoLiveEvent event;

    public ChannelGoLiveEventFE( com.github.twitch4j.common.events.channel.ChannelGoLiveEvent event )
    {
        this.event = event;
    }

    public boolean equals( java.lang.Object arg0 ) // Declaring Class: com.github.twitch4j.common.events.channel.ChannelGoLiveEvent
    {
        return this.event.equals( arg0 );
    }
    public com.github.twitch4j.common.events.domain.EventChannel getChannel( ) // Declaring Class: com.github.twitch4j.common.events.channel.ChannelGoLiveEvent
    {
        return this.event.getChannel(  );
    }
    public java.lang.String getEventId( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getEventId(  );
    }
    public java.util.Calendar getFiredAt( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getFiredAt(  );
    }
    public java.time.Instant getFiredAtInstant( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getFiredAtInstant(  );
    }
    public java.lang.String getGameId( ) // Declaring Class: com.github.twitch4j.common.events.channel.ChannelGoLiveEvent
    {
        return this.event.getGameId(  );
    }
    public com.github.philippheuer.events4j.api.service.IServiceMediator getServiceMediator( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getServiceMediator(  );
    }
    public java.lang.String getTitle( ) // Declaring Class: com.github.twitch4j.common.events.channel.ChannelGoLiveEvent
    {
        return this.event.getTitle(  );
    }
    public int hashCode( ) // Declaring Class: com.github.twitch4j.common.events.channel.ChannelGoLiveEvent
    {
        return this.event.hashCode(  );
    }
    public void setEventId( java.lang.String arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setEventId( arg0 );
    }
    public void setFiredAt( java.util.Calendar arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setFiredAt( arg0 );
    }
    public void setFiredAtInstant( java.time.Instant arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setFiredAtInstant( arg0 );
    }
    public void setServiceMediator( com.github.philippheuer.events4j.api.service.IServiceMediator arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setServiceMediator( arg0 );
    }
    public java.lang.String toString( ) // Declaring Class: com.github.twitch4j.common.events.channel.ChannelGoLiveEvent
    {
        return this.event.toString(  );
    }

}
