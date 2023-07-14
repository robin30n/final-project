package spring.boot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "t_feed_back")
@Getter
@Setter
public class FeedBack  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "comment")
    private String comment;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private User user;

}
