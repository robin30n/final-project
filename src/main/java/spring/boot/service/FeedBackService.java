package spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.dto.FeedBackDTO;
import spring.boot.mapper.FeedBackMapper;
import spring.boot.repository.FeedBackRepository;

import java.util.List;

@Service
public class FeedBackService {
    @Autowired
    private FeedBackRepository feedBackRepository;
    @Autowired
    private FeedBackMapper feedBackMapper;

    public List<FeedBackDTO> getAllFeedBackByMovie(Long id){
        return feedBackMapper.toDTOlList(feedBackRepository.findAllByMovieId(id));
    }

    public List<FeedBackDTO> getAllFeedBack(){
        return feedBackMapper.toDTOlList(feedBackRepository.findAll());
    }

    public FeedBackDTO addFeedBack(FeedBackDTO feedBackDTO){
        return feedBackMapper.toDto(feedBackRepository.save(feedBackMapper.toModel(feedBackDTO)));
    }

    public FeedBackDTO getFeedBack(Long id){
        return feedBackMapper.toDto(feedBackRepository.findById(id).orElse(null));
    }

    public FeedBackDTO updateFeedBack(FeedBackDTO feedBackDTO){
        return feedBackMapper.toDto(feedBackRepository.save(feedBackMapper.toModel(feedBackDTO)));
    }

    public void deleteFeedBack(Long id){
         feedBackRepository.deleteById(id);
    }

}
