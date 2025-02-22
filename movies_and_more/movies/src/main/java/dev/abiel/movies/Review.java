package dev.abiel.movies;

import org.springframework.data.mongodb.core.maping.Document;
import org.springframework.stereotype.Indexed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



    @Document(collection = "reviews")
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Review {
        
        @Id
        private ObjectID id;
        private String body; 

}