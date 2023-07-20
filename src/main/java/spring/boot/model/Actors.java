package spring.boot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "t_actors")
@Getter
@Setter
public class Actors  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name = "country")
    private String country;
//    @ManyToMany(mappedBy = "actors")
//    private List<Movie> movies;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "t_movies_actors",
            joinColumns = {@JoinColumn(name = "actors_id")},
            inverseJoinColumns = {@JoinColumn(name = "movie_id")})
    private List<Movie> movies;
}
