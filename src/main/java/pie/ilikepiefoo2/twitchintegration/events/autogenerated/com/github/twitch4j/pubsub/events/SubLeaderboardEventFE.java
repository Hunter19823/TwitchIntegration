package pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.pubsub.events;


public class SubLeaderboardEventFE extends net.minecraftforge.eventbus.api.Event {
    private final com.github.twitch4j.pubsub.events.SubLeaderboardEvent event;

    public SubLeaderboardEventFE( com.github.twitch4j.pubsub.events.SubLeaderboardEvent event )
    {
        this.event = event;
    }

    public boolean equals( java.lang.Object arg0 ) // Declaring Class: com.github.twitch4j.pubsub.events.SubLeaderboardEvent
    {
        return this.event.equals( arg0 );

    }
    public java.lang.String toString( ) // Declaring Class: com.github.twitch4j.pubsub.events.SubLeaderboardEvent
    {
        return this.event.toString(  );

    }
    public int hashCode( ) // Declaring Class: com.github.twitch4j.pubsub.events.SubLeaderboardEvent
    {
        return this.event.hashCode(  );

    }
    public com.github.twitch4j.pubsub.domain.Leaderboard getData( ) // Declaring Class: com.github.twitch4j.pubsub.events.LeaderboardEvent
    {
        return this.event.getData(  );

    }
    public java.lang.String getChannelId( ) // Declaring Class: com.github.twitch4j.pubsub.events.LeaderboardEvent
    {
        return this.event.getChannelId(  );

    }
    public void setFiredAtInstant( java.time.Instant arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setFiredAtInstant( arg0 );

    }
    public void setFiredAt( java.util.Calendar arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setFiredAt( arg0 );

    }
    public com.github.philippheuer.events4j.api.service.IServiceMediator getServiceMediator( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getServiceMediator(  );

    }
    public java.lang.String getEventId( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getEventId(  );

    }
    public void setEventId( java.lang.String arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setEventId( arg0 );

    }
    public java.util.Calendar getFiredAt( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getFiredAt(  );

    }
    public java.time.Instant getFiredAtInstant( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getFiredAtInstant(  );

    }
    public void setServiceMediator( com.github.philippheuer.events4j.api.service.IServiceMediator arg0 ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        this.event.setServiceMediator( arg0 );

    }

}
