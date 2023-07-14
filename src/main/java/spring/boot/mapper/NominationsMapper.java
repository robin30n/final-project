package spring.boot.mapper;

import org.mapstruct.Mapper;
import spring.boot.dto.NominationsDTO;
import spring.boot.model.Nominations;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NominationsMapper {

    NominationsDTO toDto(Nominations nominations);

    Nominations toModel(NominationsDTO nominationsDTO);

    List<Nominations> toModelList(List<NominationsDTO> nominationsDTOS);

    List<NominationsDTO> toDTOlList(List<Nominations> nominations);
}
