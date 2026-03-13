package com.dhruba.cqrs.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "event_store")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private UUID aggregateId;

    @Column(nullable = false)
    private String eventType;

    /**
     * In Spring Boot 4, @JdbcTypeCode allows us to map 
     * a Java Object or Map directly to a Postgres JSONB column.
     */
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb", nullable = false)
    private Object jsonData; 

    @Column(nullable = false)
    private int version;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    // Helper constructor for new events
    public EventEntity(UUID aggregateId, String eventType, Object jsonData, int version) {
        this.aggregateId = aggregateId;
        this.eventType = eventType;
        this.jsonData = jsonData;
        this.version = version;
    }
}