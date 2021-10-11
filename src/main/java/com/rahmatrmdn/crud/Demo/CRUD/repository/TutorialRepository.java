package com.rahmatrmdn.crud.Demo.CRUD.repository;

import java.util.List;
import com.rahmatrmdn.crud.Demo.CRUD.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}