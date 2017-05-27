package com.spartajet.learn

import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.stereotype.Component
import tornadofx.*
import kotlin.reflect.KClass

/**
 * @description
 * @create 2017-05-27 下午5:59
 * @email spartajet.guo@gmail.com
 */
@Component
class ApplicationContextProvider: ApplicationContextAware {
    private var applicationContext: ApplicationContext? = null
    /**
     * Set the ApplicationContext that this object runs in.
     * Normally this call will be used to initialize the object.
     *
     * Invoked after population of normal bean properties but before an init callback such
     * as [org.springframework.beans.factory.InitializingBean.afterPropertiesSet]
     * or a custom init-method. Invoked after [ResourceLoaderAware.setResourceLoader],
     * [ApplicationEventPublisherAware.setApplicationEventPublisher] and
     * [MessageSourceAware], if applicable.
     * @param applicationContext the ApplicationContext object to be used by this object
     * *
     * @throws ApplicationContextException in case of context initialization errors
     * *
     * @throws BeansException if thrown by application context methods
     * *
     * @see org.springframework.beans.factory.BeanInitializationException
     */
    override fun setApplicationContext(applicationContext: ApplicationContext?) {
        this.applicationContext = applicationContext
        FX.dicontainer = object : DIContainer {
            override fun <T : Any> getInstance(type: KClass<T>): T = applicationContext!!.getBean(type.java)
            override fun <T : Any> getInstance(type: KClass<T>, name: String): T = applicationContext!!.getBean(type.java, name)
        }
    }

    fun getContext(): ApplicationContext? {
        return applicationContext
    }
}