package de.fayedev.ls4apiserver.repo;

import de.fayedev.ls4apiserver.model.news.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
}
