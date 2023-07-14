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
    private ActorsMapper movactorsMapperieMapper;

    public List<ActorsDTO> getAllActors(){
        return movactorsMapperieMapper.toDTOlList(actorsRepository.findAll());
    }

    public ActorsDTO addActor(ActorsDTO actorsDTO){
        return movactorsMapperieMapper.toDto(actorsRepository.save(movactorsMapperieMapper.toModel(actorsDTO)));
    }

    public ActorsDTO getActor(Long id){
        return movactorsMapperieMapper.toDto(actorsRepository.findById(id).orElse(null));
    }

    public ActorsDTO updateActor(ActorsDTO actorsDTO){
        return movactorsMapperieMapper.toDto(actorsRepository.save(movactorsMapperieMapper.toModel(actorsDTO)));
    }

    public void deleteActor(Long id){
         actorsRepository.deleteById(id);
    }

    public List<ActorsDTO> getAllByMovie(Long id){
        return movactorsMapperieMapper.toDTOlList(actorsRepository.findAllByMovie(id));
    }

}
