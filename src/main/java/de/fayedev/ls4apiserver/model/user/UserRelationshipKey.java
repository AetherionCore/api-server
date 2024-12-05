package de.fayedev.ls4apiserver.model.user;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserRelationshipKey implements Serializable {

    private String ownerUuid;

    private String friendUuid;
}
