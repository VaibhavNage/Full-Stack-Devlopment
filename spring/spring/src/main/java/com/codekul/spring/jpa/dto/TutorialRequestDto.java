package com.codekul.spring.jpa.dto;


import com.codekul.spring.jpa.entity.Tag;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class TutorialRequestDto {
    @NotNull(message = "Title can not be null")
    @NotBlank(message = "Title can not be blank")
    private String title;

    @NotNull(message = "Description can not be null")
    @NotBlank(message = "Description can not be blank")
    private String description;

    @NotNull(message = "Subject can not be null")
    @NotBlank(message = "Subject can not be blank")
    private String subject;

    private TutorialDetailsRequestDto tutorialDetails;

    private List<Tag> tags;
}
