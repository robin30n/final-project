package spring.boot.api;

import spring.boot.dto.MovieDTO;
import spring.boot.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movie")
public class MovieRestController {

    @Autowired
    MovieService movieService;

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
         movieService.deleteMovie(id);
    }

}
