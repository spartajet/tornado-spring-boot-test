package com.spartajet.learn

import javafx.application.Application
import org.springframework.stereotype.Component
import tornadofx.*
import javax.annotation.PostConstruct

/**
 * @description
 * @create 2017-05-27 下午5:47
 * @email spartajet.guo@gmail.com
 */
@Component class MyApp : App(MainView::class) {
    @PostConstruct fun load() {
        Application.launch(MyApp::class.java)
    }
}
