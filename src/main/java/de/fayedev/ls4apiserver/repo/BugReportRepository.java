package de.fayedev.ls4apiserver.repo;

import de.fayedev.ls4apiserver.model.bugreport.BugReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BugReportRepository extends JpaRepository<BugReport, Long> {

    long countAllByUserName(String userName);
}
