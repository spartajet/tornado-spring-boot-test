package com.spartajet.learn

import org.springframework.stereotype.Component

/**
 * @description
 * @create 2017-05-27 下午5:36
 * @email spartajet.guo@gmail.com
 */
@Component class HelloBean {

    fun buttonName(): String = "fadfa"

    fun callPrint() {
        println("call print My Bean: ${1 + 2}")

    }
}