package pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events;


public class UserUnbanRequestUpdateEventFE extends net.minecraftforge.eventbus.api.Event {
    public final com.github.twitch4j.pubsub.events.UserUnbanRequestUpdateEvent event;

    public UserUnbanRequestUpdateEventFE( com.github.twitch4j.pubsub.events.UserUnbanRequestUpdateEvent event )
    {
        this.event = event;
    }

    public boolean equals( java.lang.Object arg0 ) // Declaring Class: com.github.twitch4j.pubsub.events.UserUnbanRequestUpdateEvent
    {
        return this.event.equals( arg0 );
    }
    public java.lang.String getChannelId( ) // Declaring Class: com.github.twitch4j.pubsub.events.UnbanRequestEvent
    {
        return this.event.getChannelId(  );
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
    public com.github.philippheuer.events4j.api.service.IServiceMediator getServiceMediator( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getServiceMediator(  );
    }
    public com.github.twitch4j.pubsub.domain.UpdatedUnbanRequest getUnbanRequest( ) // Declaring Class: com.github.twitch4j.pubsub.events.UserUnbanRequestUpdateEvent
    {
        return this.event.getUnbanRequest(  );
    }
    public java.lang.String getUserId( ) // Declaring Class: com.github.twitch4j.pubsub.events.UnbanRequestEvent
    {
        return this.event.getUserId(  );
    }
    public int hashCode( ) // Declaring Class: com.github.twitch4j.pubsub.events.UserUnbanRequestUpdateEvent
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
    public java.lang.String toString( ) // Declaring Class: com.github.twitch4j.pubsub.events.UserUnbanRequestUpdateEvent
    {
        return this.event.toString(  );
    }

}
