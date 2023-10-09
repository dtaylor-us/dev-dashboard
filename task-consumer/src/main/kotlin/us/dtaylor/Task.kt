package us.dtaylor

import io.quarkus.mongodb.panache.kotlin.PanacheMongoEntity

class Task : PanacheMongoEntity() {
    var title: String? = null
    var description: String? = null
}
