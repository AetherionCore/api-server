package de.fayedev.ls4apiserver.model.event;

import de.fayedev.ls4apiserver.model.champselect.GameLobby;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class GameLobbyUpdateEvent extends ApplicationEvent {

    private final transient GameLobby gameLobby;

    public GameLobbyUpdateEvent(Object source, GameLobby gameLobby) {
        super(source);
        this.gameLobby = gameLobby;
    }
}
