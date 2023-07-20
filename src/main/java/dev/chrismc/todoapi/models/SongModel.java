package dev.chrismc.todoapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "songs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SongModel {

    @Id
    private ObjectId _id;
    private String spotifyID;
    private String title;
    private String artist;

    public String getId() {
        return _id.toString();
    }

}
