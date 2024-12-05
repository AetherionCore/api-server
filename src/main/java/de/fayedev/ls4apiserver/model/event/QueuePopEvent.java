package de.fayedev.ls4apiserver.model.event;

import de.fayedev.ls4apiserver.model.champselect.PreGameLobby;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class QueuePopEvent extends ApplicationEvent {

    private final transient PreGameLobby preGameLobby;

    public QueuePopEvent(Object source, PreGameLobby preGameLobby) {
        super(source);
        this.preGameLobby = preGameLobby;
    }
}
