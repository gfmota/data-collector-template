package evolvability.thesis.data_collector_template.domain.usecases;

import evolvability.thesis.data_collector_template.domain.entity.EnrichedData;
import evolvability.thesis.data_collector_template.domain.entity.Metadata;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;

public abstract class MetadataEnricherUsecase {
    @Value("${metadata.transformation-type}")
    private String transformationType;
    @Value("${metadata.source}")
    private String source;

    public Object enrichMetadata(Object data) {
        return new EnrichedData(createMetadata(), data);
    }

    private Metadata createMetadata() {
        return new Metadata(LocalDateTime.now(), source, transformationType);
    }
}
