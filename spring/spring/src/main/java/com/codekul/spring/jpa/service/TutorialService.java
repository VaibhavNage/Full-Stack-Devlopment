package com.codekul.spring.jpa.service;

import com.codekul.spring.jpa.dto.TutorialRequestDto;
import com.codekul.spring.jpa.entity.Tutorial;

import java.util.List;

public interface TutorialService {
    void saveTutorial(TutorialRequestDto requestDto);
    List<Tutorial> findAll();
    Tutorial getById(Long id);
    Tutorial getTutorialByTittle(String title);
    String updateTutorial(TutorialRequestDto requestDto,Long tutorialId);
    String updateTutorial(Tutorial tutorial);
    String deleteTutorial(Long tutorialId);
    void saveTutorialWithTags(Tutorial tutorial);
}
