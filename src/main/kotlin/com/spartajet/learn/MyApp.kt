package com.spartajet.learn

import javafx.application.Application
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import tornadofx.*
import kotlin.reflect.KClass

/**
 * @description
 * @create 2017-05-27 下午5:47
 * @email spartajet.guo@gmail.com
 */
@SpringBootApplication class MyApp : App(MainView::class) {


    override fun init() {
        super.init()
        val applicationContext = SpringApplication.run(MyApp::class.java);
        FX.dicontainer = object : DIContainer {
            override fun <T : Any> getInstance(type: KClass<T>): T = applicationContext.getBean(type.java)
            override fun <T : Any> getInstance(type: KClass<T>, name: String): T = applicationContext.getBean(type.java, name)
        }
    }

//    @PostConstruct fun load() {
//        Application.launch(MyApp::class.java)
//    }
}

fun main(args: Array<String>) {
    Application.launch(MyApp::class.java)
}
