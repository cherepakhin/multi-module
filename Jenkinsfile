
pipeline {

    agent any
    options {
        durabilityHint 'MAX_SURVIVABILITY'
    }
    stages {
        stage('Checkout') {
            steps {
                sh 'rm -rf multi_module; git clone https://github.com/cherepakhin/multi_module'
            }
        }

        stage('Unit tests') {
            steps {
                sh 'pwd;cd multi_module;./gradlew clean test --tests *Test'
            }
        }

        stage('Build bootJar') {
            steps {
                sh 'pwd;cd multi_module;./gradlew bootJar'
            }
        }

        stage('Publish to Nexus') {
            environment {
                NEXUS_CRED = credentials('nexus_admin')
            }
            steps {
                sh 'cd multi_module;ls;./gradlew publish'
            }
        }
    }
}