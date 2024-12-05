package de.fayedev.ls4apiserver.model.event;

import de.fayedev.ls4apiserver.model.lobby.Lobby;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class LobbyRemoveEvent extends ApplicationEvent {

    private final transient Lobby lobby;

    public LobbyRemoveEvent(Object source, Lobby lobby) {
        super(source);
        this.lobby = lobby;
    }
}
