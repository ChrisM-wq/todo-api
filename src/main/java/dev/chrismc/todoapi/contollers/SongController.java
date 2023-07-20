package dev.chrismc.todoapi.contollers;

import dev.chrismc.todoapi.models.SongModel;
import dev.chrismc.todoapi.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/songs")
public class SongController {

    @Autowired
    private SongService songService;
    @GetMapping
    public ResponseEntity<List<SongModel>> getAllTasks(){
        return new ResponseEntity<List<SongModel>>(songService.allSongs(), HttpStatus.OK);
    }

}
