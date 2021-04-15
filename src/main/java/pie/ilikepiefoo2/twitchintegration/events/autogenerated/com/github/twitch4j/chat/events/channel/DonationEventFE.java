package pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events.channel;


public class DonationEventFE extends net.minecraftforge.eventbus.api.Event {
    public final com.github.twitch4j.chat.events.channel.DonationEvent event;

    public DonationEventFE( com.github.twitch4j.chat.events.channel.DonationEvent event )
    {
        this.event = event;
    }

    public boolean equals( java.lang.Object arg0 ) // Declaring Class: com.github.twitch4j.chat.events.channel.DonationEvent
    {
        return this.event.equals( arg0 );
    }
    public java.lang.String toString( ) // Declaring Class: com.github.twitch4j.chat.events.channel.DonationEvent
    {
        return this.event.toString(  );
    }
    public int hashCode( ) // Declaring Class: com.github.twitch4j.chat.events.channel.DonationEvent
    {
        return this.event.hashCode(  );
    }
    public java.lang.String getMessage( ) // Declaring Class: com.github.twitch4j.chat.events.channel.DonationEvent
    {
        return this.event.getMessage(  );
    }
    public java.lang.String getSource( ) // Declaring Class: com.github.twitch4j.chat.events.channel.DonationEvent
    {
        return this.event.getSource(  );
    }
    public java.util.Currency getCurrency( ) // Declaring Class: com.github.twitch4j.chat.events.channel.DonationEvent
    {
        return this.event.getCurrency(  );
    }
    public com.github.twitch4j.common.events.domain.EventUser getUser( ) // Declaring Class: com.github.twitch4j.chat.events.channel.DonationEvent
    {
        return this.event.getUser(  );
    }
    public java.lang.Double getAmount( ) // Declaring Class: com.github.twitch4j.chat.events.channel.DonationEvent
    {
        return this.event.getAmount(  );
    }
    public void timeout( java.lang.String arg0, java.time.Duration arg1, java.lang.String arg2 ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelEvent
    {
        this.event.timeout( arg0,arg1,arg2 );
    }
    public com.github.twitch4j.common.events.domain.EventChannel getChannel( ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelEvent
    {
        return this.event.getChannel(  );
    }
    public void unban( java.lang.String arg0 ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelEvent
    {
        this.event.unban( arg0 );
    }
    public void ban( java.lang.String arg0, java.lang.String arg1 ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelEvent
    {
        this.event.ban( arg0,arg1 );
    }
    public com.github.twitch4j.chat.TwitchChat getTwitchChat( ) // Declaring Class: com.github.twitch4j.chat.events.TwitchEvent
    {
        return this.event.getTwitchChat(  );
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
