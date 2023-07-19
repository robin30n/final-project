package spring.boot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import spring.boot.dto.ActorsDTO;
import spring.boot.dto.AwardsDTO;
import spring.boot.mapper.AwardsMapper;
import spring.boot.model.Awards;
import spring.boot.repository.AwardsRepository;
import spring.boot.service.ActorsService;

import java.util.List;

@RestController
@RequestMapping(value = "/awards")
public class AwardsRestController {

    @Autowired
    AwardsRepository awardsRepository;
    @Autowired
    AwardsMapper awardsMapper;

    @GetMapping
    public List<AwardsDTO> getAwards() {
        return awardsMapper.toDTOlList(awardsRepository.findAll());
    }

}
