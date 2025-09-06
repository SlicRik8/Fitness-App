package com.fitness.aiservice.service;


import com.fitness.aiservice.model.Recommentation;
import com.fitness.aiservice.repository.RecommendationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecommendationService {
    private final RecommendationRepository recommendationRepository;

    public List<Recommentation> getUserRecommendation(String userId) {
        return recommendationRepository.findByUserId(userId);

    }

    public Recommentation getActivityRecommendation(String activityId) {
        return recommendationRepository.findByActivityId(activityId)
                .orElseThrow(() -> new RuntimeException("No Recommendation Found for this activity: "+ activityId));
    }
}
