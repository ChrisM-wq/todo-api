package dev.chrismc.todoapi.repository;

import dev.chrismc.todoapi.models.SongModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongData extends MongoRepository<SongModel, ObjectId> { }