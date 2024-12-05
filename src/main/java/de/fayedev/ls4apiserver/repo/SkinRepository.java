package de.fayedev.ls4apiserver.repo;

import de.fayedev.ls4apiserver.model.collection.Availability;
import de.fayedev.ls4apiserver.model.collection.skin.Skin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkinRepository extends JpaRepository<Skin, Long> {

    List<Skin> findAllByAvailabilityNot(Availability availability);
}
