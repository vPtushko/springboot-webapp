pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main',
                url: 'https://github.com/vPtushko/springboot-webapp.git'
            }
        }

        stage('Build JAR') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Push to Nexus') {
            steps {
                sh './mvnw deploy'
            }
        }
    }
}
