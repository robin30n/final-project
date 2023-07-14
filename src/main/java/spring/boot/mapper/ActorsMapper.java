package spring.boot.mapper;

import org.mapstruct.Mapper;
import spring.boot.dto.ActorsDTO;
import spring.boot.model.Actors;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ActorsMapper {

    ActorsDTO toDto(Actors actors);

    Actors toModel(ActorsDTO actorsDTO);

    List<Actors> toModelList(List<ActorsDTO> actorsDTOS);

    List<ActorsDTO> toDTOlList(List<Actors> actors);
}
