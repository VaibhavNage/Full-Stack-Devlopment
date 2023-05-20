package com.codekul.spring.jpa.repository;

import com.codekul.spring.jpa.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TagRepository extends JpaRepository<Tag,Long> {
    Optional<Tag> findByTag(String tag);
}
