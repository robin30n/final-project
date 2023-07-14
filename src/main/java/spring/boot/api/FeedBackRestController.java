package spring.boot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import spring.boot.dto.FeedBackDTO;
import spring.boot.dto.MovieDTO;
import spring.boot.model.User;
import spring.boot.service.FeedBackService;
import spring.boot.service.MovieService;
import spring.boot.service.UserService;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping(value = "/feed-back")
public class FeedBackRestController {

    @Autowired
    FeedBackService feedBackService;
    @Autowired
    MovieService movieService;
    @Autowired
    UserService userService;

    @GetMapping
    public List<FeedBackDTO> getFeedBack() {
        return feedBackService.getAllFeedBack();
    }

    @GetMapping(value = "{id}")
    public List<FeedBackDTO> getFeedBack(@PathVariable(name = "id") Long id) {
        return feedBackService.getAllFeedBackByMovie(id);
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public FeedBackDTO addFeedBack(@RequestBody FeedBackDTO feedBackDTO,
                                   Principal principal) {
        MovieDTO movieDTO = movieService.getMovie(feedBackDTO.getMovie().getId());

        User user = (User) ((Authentication) principal).getPrincipal();

        feedBackDTO.setUser(user);
        feedBackDTO.setMovie(movieDTO);

        return feedBackService.addFeedBack(feedBackDTO);
    }
}
