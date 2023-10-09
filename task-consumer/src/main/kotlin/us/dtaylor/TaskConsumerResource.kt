package us.dtaylor

import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
class TaskConsumerResource {

    @Inject
    lateinit var repository: TaskRepository

    @GET
    fun getAll(): List<Task> = repository.listAll()
}
