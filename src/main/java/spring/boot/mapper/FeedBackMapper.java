package spring.boot.mapper;

import org.mapstruct.Mapper;
import spring.boot.dto.FeedBackDTO;
import spring.boot.model.FeedBack;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FeedBackMapper {

    FeedBackDTO toDto(FeedBack feedBack);

    FeedBack toModel(FeedBackDTO feedBackDTO);

    List<FeedBack> toModelList(List<FeedBackDTO> feedBackDTOS);

    List<FeedBackDTO> toDTOlList(List<FeedBack> feedBacks);
}
