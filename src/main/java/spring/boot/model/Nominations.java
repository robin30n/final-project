package spring.boot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_nominations")
@Getter
@Setter
public class Nominations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    private Awards awards;

}


/*
CREATE TABLE t_nominations (
    id bigint(20) NOT NULL auto_increment,
    name varchar(255) DEFAULT NULL,
    awards_id bigint(20) DEFAULT NULL,
    movie_id bigint(20) DEFAULT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (awards_id) REFERENCES t_awards (id),
    FOREIGN KEY (movie_id) REFERENCES t_movies (id)
);
 */
