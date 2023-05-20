package com.codekul.spring.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tutorial_details")
public class TutorialDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Published_on")
    private LocalDate publishedOn;
    @Column(name = "Created_by")
    private String author;

    @NotNull(message = "Email can bot be null")
    @NotBlank(message = "Email can bot be blank")
    @Email(message = "Email is not valid")
    private String email;

    @Size(min = 10,max = 13)
    private String mobile;

    @OneToOne
    @JoinColumn(name = "tutorial_id")
    private Tutorial tutorial;
}
