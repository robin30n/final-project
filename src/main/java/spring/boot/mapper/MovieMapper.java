package spring.boot.mapper;

import spring.boot.dto.MovieDTO;
import spring.boot.model.Movie;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    MovieDTO toDto(Movie movie);

    Movie toModel(MovieDTO movieDTO);

    List<Movie> toModelList(List<MovieDTO> movieDTOList);

    List<MovieDTO> toDTOlList(List<Movie> movieList);
}
