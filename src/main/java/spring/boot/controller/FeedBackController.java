package spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import spring.boot.dto.FeedBackDTO;
import spring.boot.dto.MovieDTO;
import spring.boot.service.FeedBackService;
import spring.boot.service.MovieService;

import java.util.List;

@Controller
public class FeedBackController {

    @Autowired
    FeedBackService feedBackService;
    @Autowired
    MovieService movieService;


    @GetMapping("/movie-details/{id}")
    public String movieDetailsPage(@PathVariable(name = "id") Long id, Model model) {
        MovieDTO movie = movieService.getMovie(id);
        List<FeedBackDTO> feedBack = feedBackService.getAllFeedBackByMovie(id);
        model.addAttribute("movie",movie);
        model.addAttribute("feedBack",feedBack);

        return "movie-details";
    }
}
