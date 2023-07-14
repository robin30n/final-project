package spring.boot.mapper;

import org.mapstruct.Mapper;
import spring.boot.dto.AwardsDTO;
import spring.boot.model.Awards;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AwardsMapper {

    AwardsDTO toDto(Awards awards);

    Awards toModel(AwardsDTO awardsDTO);

    List<Awards> toModelList(List<AwardsDTO> awardsDTOS);

    List<AwardsDTO> toDTOlList(List<Awards> awards);
}
