package pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events;


public class PubSubListenResponseEventFE extends net.minecraftforge.eventbus.api.Event {
    public final com.github.twitch4j.pubsub.events.PubSubListenResponseEvent event;

    public PubSubListenResponseEventFE( com.github.twitch4j.pubsub.events.PubSubListenResponseEvent event )
    {
        this.event = event;
    }

    public boolean equals( java.lang.Object arg0 ) // Declaring Class: com.github.twitch4j.pubsub.events.PubSubListenResponseEvent
    {
        return this.event.equals( arg0 );
    }
    public java.lang.String toString( ) // Declaring Class: com.github.twitch4j.pubsub.events.PubSubListenResponseEvent
    {
        return this.event.toString(  );
    }
    public int hashCode( ) // Declaring Class: com.github.twitch4j.pubsub.events.PubSubListenResponseEvent
    {
        return this.event.hashCode(  );
    }
    public java.lang.String getNonce( ) // Declaring Class: com.github.twitch4j.pubsub.events.PubSubListenResponseEvent
    {
        return this.event.getNonce(  );
    }
    public boolean hasError( ) // Declaring Class: com.github.twitch4j.pubsub.events.PubSubListenResponseEvent
    {
        return this.event.hasError(  );
    }
    public boolean isBadMessage( ) // Declaring Class: com.github.twitch4j.pubsub.events.PubSubListenResponseEvent
    {
        return this.event.isBadMessage(  );
    }
    public boolean isBadTopic( ) // Declaring Class: com.github.twitch4j.pubsub.events.PubSubListenResponseEvent
    {
        return this.event.isBadTopic(  );
    }
    public boolean isServerError( ) // Declaring Class: com.github.twitch4j.pubsub.events.PubSubListenResponseEvent
    {
        return this.event.isServerError(  );
    }
    public boolean isBadAuthentication( ) // Declaring Class: com.github.twitch4j.pubsub.events.PubSubListenResponseEvent
    {
        return this.event.isBadAuthentication(  );
    }
    public java.lang.String getError( ) // Declaring Class: com.github.twitch4j.pubsub.events.PubSubListenResponseEvent
    {
        return this.event.getError(  );
    }
    public java.time.Instant getFiredAtInstant( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getFiredAtInstant(  );
    }
    public void setFiredAtInstant( java.time.Instant arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setFiredAtInstant( arg0 );
    }
    public void setEventId( java.lang.String arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setEventId( arg0 );
    }
    public java.lang.String getEventId( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getEventId(  );
    }
    public com.github.philippheuer.events4j.api.service.IServiceMediator getServiceMediator( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getServiceMediator(  );
    }
    public void setServiceMediator( com.github.philippheuer.events4j.api.service.IServiceMediator arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setServiceMediator( arg0 );
    }
    public java.util.Calendar getFiredAt( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getFiredAt(  );
    }
    public void setFiredAt( java.util.Calendar arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setFiredAt( arg0 );
    }

}
