package spring.boot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import spring.boot.dto.ActorsDTO;
import spring.boot.service.ActorsService;

import java.util.List;

@RestController
@RequestMapping(value = "/actor")
public class ActorsRestController {

    @Autowired
    ActorsService actorsService;

    @GetMapping
    public List<ActorsDTO> getActors() {
        return actorsService.getAllActors();
    }

    @GetMapping(value = "{id}")
    public ActorsDTO getActorById(@PathVariable(name = "id") Long id) {
        return actorsService.getActor(id);
    }
    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public ActorsDTO addActor(@RequestBody ActorsDTO actorsDTO) {
        return actorsService.addActor(actorsDTO);
    }
    @PutMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public ActorsDTO updateActor(@RequestBody ActorsDTO actorsDTO){
        return actorsService.updateActor(actorsDTO);
    }
    @DeleteMapping(value = "{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public void deleteActor(@PathVariable(name = "id") Long id){
         actorsService.deleteActor(id);
    }

    @GetMapping(value = "/byMovie/{id}")
    public List<ActorsDTO> getActors(@PathVariable(name = "id") Long id) {
        return actorsService.getAllByMovie(id);
    }

}
