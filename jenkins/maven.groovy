freeStyleJob('Maven-Dsl') {
    description("first maven project")
    scm {
        github('https://github.com/Mubarak17/jenkins.git',master)
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean pacakage', 'jenkins/pom.xml')
    }
    publishers {
        archiveArtifacts '**/*.jar'
    }
}