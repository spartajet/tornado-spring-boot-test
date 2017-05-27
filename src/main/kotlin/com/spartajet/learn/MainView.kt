package com.spartajet.learn

import tornadofx.*

/**
 * @description
 * @create 2017-05-27 下午5:28
 * @email spartajet.guo@gmail.com
 */
//@Component
class MainView : View("My View") {
    val helloBean: HelloBean by di("helloBean")

    override val root = borderpane {
        center {
            button("fadfadsf") {
                setOnAction {
                    helloBean.callPrint()
                }
            }
        }
    }
}
