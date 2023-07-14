package spring.boot.service;

import spring.boot.dto.MovieDTO;
import spring.boot.mapper.MovieMapper;
import spring.boot.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private MovieMapper movieMapper;

    public List<MovieDTO> getAllMovies(){
        return movieMapper.toDTOlList(movieRepository.findAll());
    }

    public MovieDTO addMovie(MovieDTO movie){
        return movieMapper.toDto(movieRepository.save(movieMapper.toModel(movie)));
    }

    public MovieDTO getMovie(Long id){
        return movieMapper.toDto(movieRepository.findById(id).orElse(null));
    }

    public MovieDTO updateMovie(MovieDTO movie){
        return movieMapper.toDto(movieRepository.save(movieMapper.toModel(movie)));
    }

    public void deleteMovie(Long id){
         movieRepository.deleteById(id);
    }

}
