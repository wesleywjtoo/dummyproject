pipeline{
    agent any

    tools {
        maven 'maven'
    }
    environment{
       ArtifactId = readMavenPom().getArtifactId()
       Version = readMavenPom().getVersion()
       Name = readMavenPom().getName()
       GroupId = readMavenPom().getGroupId()
    }
    stages{
        stage('Builds'){
            steps{
                sh 'mvn clean install package'
            }
        }
    }
}