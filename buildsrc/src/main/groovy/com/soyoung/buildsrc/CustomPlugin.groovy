//package com.soyoung.buildsrc
//
//import org.gradle.api.Plugin
//import org.gradle.api.Project
//
//
//class CustomPlugin implements Plugin<Project>{
//
//    @Override
//    void apply(Project project) {
//
//        AppExtension appExtension =  project.getProperties().get("android")
//        appExtension.registerTransform(new CustomTransform(), Collections.EMPTY_LIST);
//
//    }
//}