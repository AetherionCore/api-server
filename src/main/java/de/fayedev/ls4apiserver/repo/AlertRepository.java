package de.fayedev.ls4apiserver.repo;

import de.fayedev.ls4apiserver.model.alert.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Long> {
}
