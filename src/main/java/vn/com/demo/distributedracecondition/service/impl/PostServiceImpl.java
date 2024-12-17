package vn.com.demo.distributedracecondition.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.com.demo.distributedracecondition.repository.PostRepository;
import vn.com.demo.distributedracecondition.service.PostService;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public void likePost(Long postId) {
        postRepository.findById(postId).ifPresent(post1 -> {
            Long liked = post1.getLike() + 1;
            post1.setLike(liked);

            postRepository.save(post1);
        });
    }
}
