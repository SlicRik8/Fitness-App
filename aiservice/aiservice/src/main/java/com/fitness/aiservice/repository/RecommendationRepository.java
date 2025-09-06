package com.fitness.aiservice.repository;

import com.fitness.aiservice.model.Recommentation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecommendationRepository extends MongoRepository<Recommentation,String> {
    List<Recommentation> findByUserId(String userId);

    Optional<Recommentation> findByActivityId(String activityId);
}
