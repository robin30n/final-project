package spring.boot.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class NominationsDTO {
    private Long id;
    private String name;
    private AwardsDTO awards;
}
