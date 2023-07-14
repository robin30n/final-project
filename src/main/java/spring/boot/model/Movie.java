package spring.boot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "t_movies")
@Getter
@Setter
public class Movie  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(name = "budget")
    private int budget;
    @Column(name = "box_office")
    private int boxOffice;
    @Column(name = "genre")
    private String genre;
    @Column(name = "duration")
    private int duration;
    @ManyToMany
    private List<Actors> actors;
    @OneToMany
    private List<Nominations> nominations;

}
