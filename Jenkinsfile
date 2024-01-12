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
                echo "Current Build No: ${env.BUILD_NUMBER}"
                sh 'mvn clean install package'
            }
        }
    }
}