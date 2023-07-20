package dev.chrismc.todoapi.services;

import dev.chrismc.todoapi.models.SongModel;
import dev.chrismc.todoapi.repository.SongData;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    @Autowired
    private SongData songRepository;
    public List<SongModel> allSongs() {
        return songRepository.findAll();
    }

    public Optional<SongModel> findSong(ObjectId id) {
        return songRepository.findById(id);
    }


}
