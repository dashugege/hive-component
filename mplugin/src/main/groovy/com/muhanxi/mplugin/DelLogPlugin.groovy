package com.muhanxi.mplugin;

import org.gradle.api.Plugin
import org.gradle.api.Project


/**
 * 参考 : https://www.jianshu.com/p/af2b0a43133f
 *
 */
class DelLogPlugin implements Plugin<Project>{


    @Override
    void apply(Project project) {

        project.extensions.create("delLogExtension",DelLogExtension.class)

//      afterEvaluate  gradle构建完后自动执行
        project.afterEvaluate {

            project.logger.error("delLogExtension "+ project.delLogExtension.sourceDir)
            def rootDir = project.projectDir.toString().plus(project.delLogExtension.sourceDir);
            project.logger.error(rootDir)
            DelLogUtil.delLog(new File(rootDir));
        }

        // 当前task 需要手动执行 gradle -q dellog
        project.task("dellog",{
            project.logger.error("task dellog delLogExtension "+ project.delLogExtension.sourceDir)
            def rootDir = project.projectDir.toString().plus(project.delLogExtension.sourceDir);
            project.logger.error(rootDir);
            DelLogUtil.delLog(new File(rootDir));
        })


    }
}