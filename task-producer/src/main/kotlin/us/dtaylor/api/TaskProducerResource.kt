package us.dtaylor.api

import us.dtaylor.Task
import jakarta.inject.Inject
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import org.eclipse.microprofile.reactive.messaging.Channel
import org.eclipse.microprofile.reactive.messaging.Emitter

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class TaskProducerResource {

    @Inject
    @Channel("tasks")
    lateinit var taskEmitter: Emitter<String>

    @POST
    fun create(task: Task): Task {
        taskEmitter.send(task.title)  // Example: sending title to Kafka
        return task
    }
}

