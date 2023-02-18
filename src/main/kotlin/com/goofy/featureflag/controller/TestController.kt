package com.goofy.featureflag.controller

import com.azure.spring.cloud.feature.manager.FeatureGate
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/feature-flag")
class TestController {
    @GetMapping("/a")
    @FeatureGate(feature = "feature-a")
    fun executeA() = ResponseEntity.ok("Feature A Execute")

    @GetMapping("/b")
    @FeatureGate(feature = "feature-b")
    fun executeB() = ResponseEntity.ok("Feature B Execute")
}
