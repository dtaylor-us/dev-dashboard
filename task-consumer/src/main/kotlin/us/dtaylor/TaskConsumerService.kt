package us.dtaylor

import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.transaction.Transactional
import org.eclipse.microprofile.reactive.messaging.Incoming

@ApplicationScoped
class TaskConsumerService {

    @Inject
    lateinit var repository: TaskRepository

    @Incoming("tasks")
//    @Transactional
    fun consume(title: String) {
        try {
            val task = Task()
            task.title = title
            task.description = "Consumed from Kafka"
            repository.persist(task)
        } catch (ex: Exception) {
            // Log or handle the exception here
            ex.printStackTrace()
        }
    }

}
