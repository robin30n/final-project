package spring.boot.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class ActorsDTO {
    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private String country;
    private List<MovieDTO> movies;
    private List<NominationsDTO> nominations;
}
