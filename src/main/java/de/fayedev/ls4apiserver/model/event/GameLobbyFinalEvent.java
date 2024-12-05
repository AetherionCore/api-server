package de.fayedev.ls4apiserver.model.event;

import de.fayedev.ls4apiserver.model.champselect.GameLobby;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class GameLobbyFinalEvent extends ApplicationEvent {

    private final boolean kill;
    private final transient GameLobby gameLobby;

    public GameLobbyFinalEvent(Object source, GameLobby gameLobby, boolean kill) {
        super(source);
        this.gameLobby = gameLobby;
        this.kill = kill;
    }
}
