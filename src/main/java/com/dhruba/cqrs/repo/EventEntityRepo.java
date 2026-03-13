package com.dhruba.cqrs.repo;

import com.dhruba.cqrs.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventEntityRepo extends JpaRepository<EventEntity, UUID> {
}
