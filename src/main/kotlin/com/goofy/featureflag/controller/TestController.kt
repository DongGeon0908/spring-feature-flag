package com.goofy.featureflag.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/test")
class TestController {
    @GetMapping("/health")
    fun getHealth() = ResponseEntity.ok("Health OK")

    @GetMapping("/status")
    fun getStatus() = ResponseEntity.ok("Good")
}
