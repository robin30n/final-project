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
    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;
    @Column(name = "country")
    private String country;
    @ManyToMany(mappedBy = "actors")
    private List<Movie> movies;
    @OneToMany
    private List<Nominations> nominations;

//    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinTable(name = "movie_actor",
//            joinColumns = {@JoinColumn(name = "actor_id")},
//            inverseJoinColumns = {@JoinColumn(name = "movie_id")})
//    private Set<Movie> movieSet = new HashSet<>();
}


