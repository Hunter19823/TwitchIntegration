package pie.ilikepiefoo2.twitchintegration.events.autogenerated.com.github.twitch4j.chat.events;


public class AbstractChannelMessageEventFE extends net.minecraftforge.eventbus.api.Event {
    public final com.github.twitch4j.chat.events.AbstractChannelMessageEvent event;

    public AbstractChannelMessageEventFE( com.github.twitch4j.chat.events.AbstractChannelMessageEvent event )
    {
        this.event = event;
    }

    public void ban( java.lang.String arg0, java.lang.String arg1 ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelEvent
    {
        this.event.ban( arg0,arg1 );
    }
    public boolean equals( java.lang.Object arg0 ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelMessageEvent
    {
        return this.event.equals( arg0 );
    }
    public com.github.twitch4j.common.events.domain.EventChannel getChannel( ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelEvent
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
    public java.util.List getFlags( ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelMessageEvent
    {
        return this.event.getFlags(  );
    }
    public java.lang.String getMessage( ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelMessageEvent
    {
        return this.event.getMessage(  );
    }
    public com.github.twitch4j.chat.events.channel.IRCMessageEvent getMessageEvent( ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelMessageEvent
    {
        return this.event.getMessageEvent(  );
    }
    public java.lang.String getNonce( ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelMessageEvent
    {
        return this.event.getNonce(  );
    }
    public java.util.Set getPermissions( ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelMessageEvent
    {
        return this.event.getPermissions(  );
    }
    public com.github.philippheuer.events4j.api.service.IServiceMediator getServiceMediator( ) // Declaring Class: com.github.philippheuer.events4j.core.domain.Event
    {
        return this.event.getServiceMediator(  );
    }
    public int getSubscriberMonths( ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelMessageEvent
    {
        return this.event.getSubscriberMonths(  );
    }
    public int getSubscriptionTier( ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelMessageEvent
    {
        return this.event.getSubscriptionTier(  );
    }
    public com.github.twitch4j.chat.TwitchChat getTwitchChat( ) // Declaring Class: com.github.twitch4j.chat.events.TwitchEvent
    {
        return this.event.getTwitchChat(  );
    }
    public com.github.twitch4j.common.events.domain.EventUser getUser( ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelMessageEvent
    {
        return this.event.getUser(  );
    }
    public int hashCode( ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelMessageEvent
    {
        return this.event.hashCode(  );
    }
    public void reply( com.github.twitch4j.chat.ITwitchChat arg0, java.lang.String arg1 ) // Declaring Class: com.github.twitch4j.chat.events.channel.ReplyableEvent
    {
        this.event.reply( arg0,arg1 );
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
    public void timeout( java.lang.String arg0, java.time.Duration arg1, java.lang.String arg2 ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelEvent
    {
        this.event.timeout( arg0,arg1,arg2 );
    }
    public java.lang.String toString( ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelMessageEvent
    {
        return this.event.toString(  );
    }
    public void unban( java.lang.String arg0 ) // Declaring Class: com.github.twitch4j.chat.events.AbstractChannelEvent
    {
        this.event.unban( arg0 );
    }

}
