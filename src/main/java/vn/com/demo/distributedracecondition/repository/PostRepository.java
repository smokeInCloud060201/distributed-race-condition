package vn.com.demo.distributedracecondition.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.com.demo.distributedracecondition.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
