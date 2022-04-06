package com.github.dengshidang.ideapluginstemplate.services

import com.intellij.openapi.project.Project
import com.github.dengshidang.ideapluginstemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
