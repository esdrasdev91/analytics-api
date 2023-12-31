package com.analytics.analyticsapi.service;

import com.analytics.analyticsapi.dto.CarPostDTO;
import org.springframework.stereotype.Service;

@Service
public interface PostAnalyticsService {

    void saveDataAnalytics(CarPostDTO carPostDTO);
}
