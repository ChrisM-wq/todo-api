package dev.chrismc.todoapi.repository;

import dev.chrismc.todoapi.models.Task;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskData extends MongoRepository<Task, ObjectId> {
}
