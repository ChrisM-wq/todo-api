package dev.chrismc.todoapi.services;

import dev.chrismc.todoapi.models.SongModel;
import dev.chrismc.todoapi.repository.SongData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SongService {

    @Autowired
    private SongData songRepository;
    public List<SongModel> allSongs() {
        return songRepository.findAll();
    }

}
