package git.io.axon.DataRest

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

@RepositoryRestResource
interface SampleRepository : JpaRepository<SampleEntity, Long> {
    @RestResource(path = "by-name")
    fun findByName(name: String): SampleEntity?
}