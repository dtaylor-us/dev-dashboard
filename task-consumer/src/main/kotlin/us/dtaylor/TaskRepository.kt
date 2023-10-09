package us.dtaylor

import io.quarkus.mongodb.panache.kotlin.PanacheMongoRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class TaskRepository: PanacheMongoRepository<Task>
