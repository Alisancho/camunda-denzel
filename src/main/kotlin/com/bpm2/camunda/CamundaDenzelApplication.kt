package com.bpm2.camunda

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableProcessApplication
@SpringBootApplication
class CamundaDenzelApplication

fun main(args: Array<String>) {
	runApplication<CamundaDenzelApplication>(*args)
}
