package dev.chrismc.todoapi.models;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "songs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SongModel {

    @Id
    private String _id;

    @NotNull (message = "Song track ID is compulsory")
    private String spotifyID;

    private String title;
    private String artist;


}
