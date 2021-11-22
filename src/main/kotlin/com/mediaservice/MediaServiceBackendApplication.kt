package com.mediaservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MediaServiceBackendApplication

fun main(args: Array<String>) {
    runApplication<MediaServiceBackendApplication>(*args)
}
