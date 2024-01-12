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
                script{
                    def bNumber = env.BUILD_NUMBER
                    echo "Current Build No: ${bNumber}"
                }
                sh 'mvn clean install package'
            }
        }
        stage('Sonarqube Analysis'){
            steps{
                echo 'Send for sonarcube analysis'
                withSonarQubeEnv('sonarqube'){
                    sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
                }

            }
        }
    }
}