package com.codekul.spring.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tutorials")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Title can not be null")
    private String title;
    @Column(name = "tutorial_description")
    private String description;
    private String subject;

    @OneToMany(mappedBy = "tutorial", fetch = FetchType.EAGER)
    private List<Comment> comments;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tutorial_tags",
            joinColumns = {@JoinColumn(name = "tutorial_id")},
            inverseJoinColumns={@JoinColumn(name = "tag_id")})
    private Set<Tag> tags;
}
