package spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.dto.ActorsDTO;
import spring.boot.mapper.ActorsMapper;
import spring.boot.repository.ActorsRepository;

import java.util.List;

@Service
public class ActorsService {
    @Autowired
    private ActorsRepository actorsRepository;
    @Autowired
    private ActorsMapper actorsMapper;

    public List<ActorsDTO> getAllActors(){
        return actorsMapper.toDTOlList(actorsRepository.findAll());
    }

    public ActorsDTO addActor(ActorsDTO actorsDTO){
        return actorsMapper.toDto(actorsRepository.save(actorsMapper.toModel(actorsDTO)));
    }

    public ActorsDTO getActor(Long id){
        return actorsMapper.toDto(actorsRepository.findById(id).orElse(null));
    }

    public ActorsDTO updateActor(ActorsDTO actorsDTO){
        return actorsMapper.toDto(actorsRepository.save(actorsMapper.toModel(actorsDTO)));
    }

    public void deleteActor(Long id){
         actorsRepository.deleteById(id);
    }

    public List<ActorsDTO> getAllByMovie(Long id){
        return actorsMapper.toDTOlList(actorsRepository.findAllByMovie(id));
    }

}
