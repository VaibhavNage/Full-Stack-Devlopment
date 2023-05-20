package com.codekul.spring.jpa.repository;

import com.codekul.spring.jpa.entity.TutorialDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialDetailsRepository extends JpaRepository<TutorialDetails,Long> {
}
