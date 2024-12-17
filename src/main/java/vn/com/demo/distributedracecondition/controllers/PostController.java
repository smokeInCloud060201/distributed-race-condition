package vn.com.demo.distributedracecondition.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.demo.distributedracecondition.service.PostService;

@RestController
@RequestMapping("/api/v1/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PutMapping("/{postId}/like")
    public ResponseEntity<Object> likePost(@PathVariable("postId") Long postId) {
        postService.likePost(postId);
        return ResponseEntity.noContent().build();
    }
}
