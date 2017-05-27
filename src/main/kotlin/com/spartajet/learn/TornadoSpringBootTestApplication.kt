package com.spartajet.learn

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication class TornadoSpringBootTestApplication


fun main(args: Array<String>) {
    SpringApplication.run(TornadoSpringBootTestApplication::class.java, *args)
//    TornadoSpringBootTestApplication.launchApp(args)
//    Application.launch(MyApp::class.java)
}
