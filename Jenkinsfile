
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

        stage('Publish to Nexus') {
            environment {
                NEXUS_CRED = credentials('nexus_admin')
            }
            steps {
                sh 'pwd;ls;cd multi_module;./gradlew publish'
            }
        }
    }
}