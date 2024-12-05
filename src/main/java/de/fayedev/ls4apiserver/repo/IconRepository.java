package de.fayedev.ls4apiserver.repo;

import de.fayedev.ls4apiserver.model.collection.Availability;
import de.fayedev.ls4apiserver.model.collection.icon.Icon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IconRepository extends JpaRepository<Icon, Integer> {

    List<Icon> findAllByAvailabilityNot(Availability availability);
}
