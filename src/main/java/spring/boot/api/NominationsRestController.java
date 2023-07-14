package spring.boot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import spring.boot.dto.NominationsDTO;
import spring.boot.service.NominationsService;

import java.util.List;

@RestController
@RequestMapping(value = "/nomination")
public class NominationsRestController {

    @Autowired
    NominationsService nominationService;

    @GetMapping
    public List<NominationsDTO> getNominatios() {
        return nominationService.getAllNominations();
    }

    @GetMapping(value = "{id}")
    public NominationsDTO getNominationById(@PathVariable(name = "id") Long id) {
        return nominationService.getNominations(id);
    }
    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public NominationsDTO addNomination(@RequestBody NominationsDTO nominationsDTO) {
        return nominationService.addNomination(nominationsDTO);
    }
    @PutMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public NominationsDTO updateNomination(@RequestBody NominationsDTO nominationsDTO){
        return nominationService.updateNomination(nominationsDTO);
    }
    @DeleteMapping(value = "{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public void deleteActor(@PathVariable(name = "id") Long id){
         nominationService.deleteNominations(id);
    }

    @GetMapping(value = "/byMovie/{id}")
    public List<NominationsDTO> getNominationsNominations(@PathVariable(name = "id") Long id) {
        return nominationService.getAllByMovie(id);
    }

}
