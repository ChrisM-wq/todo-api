package dev.chrismc.todoapi.contollers;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.chrismc.todoapi.models.SongModel;
import dev.chrismc.todoapi.services.SongService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.DataInput;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/songs")
public class SongController {

    @Autowired
    private SongService songService;
    @GetMapping
    public ResponseEntity<List<SongModel>> getAllTasks(){
        return new ResponseEntity<List<SongModel>>(songService.allSongs(), HttpStatus.OK);
    }

    @GetMapping("/{songId}")
    public ResponseEntity<SongModel> getSongById(@PathVariable ObjectId songId) {
        Optional<SongModel> song = songService.findSong(songId);

        if (song.isPresent()) {
            SongModel songModel = song.get();
            System.out.println(songModel);
            return new ResponseEntity<SongModel>(song.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<SongModel>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity postBody(@RequestBody SongModel song) {
        songService.addSong(song);
        return new ResponseEntity(HttpStatus.OK);
    }

}
