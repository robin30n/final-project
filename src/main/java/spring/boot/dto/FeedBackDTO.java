package spring.boot.dto;

import lombok.Getter;
import lombok.Setter;
import spring.boot.model.User;

@Getter
@Setter
public class FeedBackDTO {
    private Long id;
    private String comment;
    private MovieDTO movie;
    private User user;
}
