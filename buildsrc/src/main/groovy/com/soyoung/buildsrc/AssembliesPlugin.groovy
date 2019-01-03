package com.soyoung.buildsrc

import org.gradle.api.Plugin
import org.gradle.api.Project


/**
 * 自定义一个本地引用插件
 * apply plugin: com.soyoung.buildsrc.AssembliesPlugin
 *https://blog.csdn.net/feiyu1947/article/details/84931252
 */

class AssembliesPlugin implements Plugin<Project> {

//groovy 基础语法
//    https://www.w3cschool.cn/groovy/groovy_overview.html
//    https://www.ibm.com/developerworks/cn/education/java/j-groovy/j-groovy.html
    @Override
    void apply(Project project) {
        println("=====================================")
        println("apply project : " + project.getName()+" start ")
        println("=====================================")


        

    }

}