package evolvability.thesis.data_collector_template.domain.entity;

import java.time.LocalDateTime;

public record Metadata(LocalDateTime collectedAt, String source, String transformationType) {
}
