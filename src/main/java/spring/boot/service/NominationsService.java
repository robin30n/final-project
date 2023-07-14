package spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.dto.ActorsDTO;
import spring.boot.dto.NominationsDTO;
import spring.boot.mapper.NominationsMapper;
import spring.boot.repository.NominationsRepository;

import java.util.List;

@Service
public class NominationsService {
    @Autowired
    private NominationsRepository nominationsRepository;
    @Autowired
    private NominationsMapper nomationsMapper;

    public List<NominationsDTO> getAllNominations(){
        return nomationsMapper.toDTOlList(nominationsRepository.findAll());
    }

    public NominationsDTO addNomination(NominationsDTO nominationsDTO){
        return nomationsMapper.toDto(nominationsRepository.save(nomationsMapper.toModel(nominationsDTO)));
    }

    public NominationsDTO getNominations(Long id){
        return nomationsMapper.toDto(nominationsRepository.findById(id).orElse(null));
    }

    public NominationsDTO updateNomination(NominationsDTO nominationsDTO){
        return nomationsMapper.toDto(nominationsRepository.save(nomationsMapper.toModel(nominationsDTO)));
    }

    public void deleteNominations(Long id){
         nominationsRepository.deleteById(id);
    }

    public List<NominationsDTO> getAllByMovie(Long id){
        return nomationsMapper.toDTOlList(nominationsRepository.findAllByMovie(id));
    }

}
