package spring.boot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "t_awards")
@Getter
@Setter
public class Awards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "year")
    private String year;
    @Column(name = "description",columnDefinition = "TEXT")
    private String description;

}
