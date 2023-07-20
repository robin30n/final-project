package spring.boot.api;

import lombok.RequiredArgsConstructor;
import spring.boot.dto.MovieDTO;
import spring.boot.model.Movie;
import spring.boot.service.ActorsService;
import spring.boot.service.FeedBackService;
import spring.boot.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import spring.boot.service.NominationsService;

import java.util.List;

@RestController
@RequestMapping(value = "/movie")
@RequiredArgsConstructor
public class MovieRestController {

    private final MovieService movieService;
    private final FeedBackService feedBackService;
    private final ActorsService actorsService;
    private final NominationsService nominationsService;

    @GetMapping
    public List<MovieDTO> getMovies() {
        return movieService.getAllMovies();
    }
    @GetMapping(value = "{id}")
    public MovieDTO getMovieById(@PathVariable(name = "id") Long id) {
        return movieService.getMovie(id);
    }
    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public MovieDTO addMovie(@RequestBody MovieDTO movie) {
        return movieService.addMovie(movie);
    }
    @PutMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public MovieDTO updateMovie(@RequestBody MovieDTO movie){
        return movieService.updateMovie(movie);
    }
    @DeleteMapping(value = "{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public void deleteMovie(@PathVariable(name = "id") Long id){
        feedBackService.deleteFeedBackByMovieId(id);
         movieService.deleteMovie(id);
    }

}
