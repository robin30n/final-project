package spring.boot.dto;

import lombok.Getter;
import lombok.Setter;
import spring.boot.enam.Genre;

import java.util.List;

@Getter
@Setter
public class MovieDTO {
    private Long id;
    private String name;
    private String description;
    private int budget;
    private int boxOffice;
    private String genre;
    private int duration;
    private List<ActorsDTO> actors;
    private List<NominationsDTO> nominations;
}
