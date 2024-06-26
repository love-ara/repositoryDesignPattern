package africa.semicolon.blogApp.models.repository;

import africa.semicolon.blogApp.models.data.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {

}
