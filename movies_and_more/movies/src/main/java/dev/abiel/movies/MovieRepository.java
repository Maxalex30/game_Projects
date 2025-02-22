package dev.abiel.movies;

/* missing a lot of imports which are supposed ot be here,  might be a dependency issue or maybe from the movie class*/
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{
 Optional<Movie> findMovieByImdbId(String imdbId);
}
