package pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events;


public class PredictionUpdatedEventFE extends net.minecraftforge.eventbus.api.Event {
    public final com.github.twitch4j.pubsub.events.PredictionUpdatedEvent event;

    public PredictionUpdatedEventFE( com.github.twitch4j.pubsub.events.PredictionUpdatedEvent event )
    {
        this.event = event;
    }

    public boolean equals( java.lang.Object arg0 ) // Declaring Class: com.github.twitch4j.pubsub.events.PredictionUpdatedEvent
    {
        return this.event.equals( arg0 );
    }
    public java.lang.String toString( ) // Declaring Class: com.github.twitch4j.pubsub.events.PredictionUpdatedEvent
    {
        return this.event.toString(  );
    }
    public int hashCode( ) // Declaring Class: com.github.twitch4j.pubsub.events.PredictionUpdatedEvent
    {
        return this.event.hashCode(  );
    }
    public java.time.Instant getTimestamp( ) // Declaring Class: com.github.twitch4j.pubsub.events.PredictionUpdatedEvent
    {
        return this.event.getTimestamp(  );
    }
    public com.github.twitch4j.pubsub.domain.PredictionEvent getEvent( ) // Declaring Class: com.github.twitch4j.pubsub.events.PredictionUpdatedEvent
    {
        return this.event.getEvent(  );
    }
    public void setEventId( java.lang.String arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setEventId( arg0 );
    }
    public void setFiredAtInstant( java.time.Instant arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setFiredAtInstant( arg0 );
    }
    public java.time.Instant getFiredAtInstant( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getFiredAtInstant(  );
    }
    public void setFiredAt( java.util.Calendar arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setFiredAt( arg0 );
    }
    public java.lang.String getEventId( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getEventId(  );
    }
    public java.util.Calendar getFiredAt( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getFiredAt(  );
    }
    public com.github.philippheuer.events4j.api.service.IServiceMediator getServiceMediator( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getServiceMediator(  );
    }
    public void setServiceMediator( com.github.philippheuer.events4j.api.service.IServiceMediator arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setServiceMediator( arg0 );
    }

}
