package git.io.axon.DataRest;

import jakarta.persistence.*;
import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@RestResource(rel = "sampleEntities", path = "sampleEntities")
public class SampleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

}
