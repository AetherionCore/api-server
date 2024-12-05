package de.fayedev.ls4apiserver.model.user.dto;

import de.fayedev.ls4apiserver.model.collection.icon.dto.IconOut;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UserIconsOut {

    List<IconOut> owned = new ArrayList<>();

    List<IconOut> notOwned = new ArrayList<>();
}
