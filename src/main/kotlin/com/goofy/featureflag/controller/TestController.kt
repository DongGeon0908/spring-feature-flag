package com.goofy.featureflag.controller

import com.azure.spring.cloud.feature.manager.FeatureGate
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/test")
class TestController {
    @GetMapping("/health")
    @FeatureGate(feature = "feature-a")
    fun getHealth() = ResponseEntity.ok("Health OK")

    @GetMapping("/status")
    @FeatureGate(feature = "feature-b")
    fun getStatus() = ResponseEntity.ok("Good")
}
