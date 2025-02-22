package dev.abiel.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping
    public ResponseEntity<List<Movie>> getMovies() {
        return new ResponseEntity<List<Movie>>(service.findAllMovies(), HttpStatus.OK);
    }

        @GetMapping("/{mdbId}")
        public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
            return new ResponseEntity<Optional<Movie>>(service.findMovieByImdbId(imdbId), HttpStatus.OK);
        }
}
// was beofre 2/22/25 on 3:28 pm.              return new RepsonseEntity<Optional<Movie>>(serviceervice.singleMovie(imdbId), HttpStatus.OK);//