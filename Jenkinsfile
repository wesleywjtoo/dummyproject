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
                def bNumber = env.BUILD_NUMBER
                echo "Current Build No: ${bNumber}"
                sh 'mvn clean install package'
            }
        }
    }
}