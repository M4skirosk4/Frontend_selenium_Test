pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/M4skirosk4/Frontend_selenium_Test.git'
            }
        }
        stage('Build') {
                steps {
                    script {
                         echo 'Building the project...'
                         sh 'mvn compile -f pom.xml'
                            }
                    }
                }
        stage('Run Test') {
            steps {
                 script {
                    echo 'Building the project...'
                    sh 'mvn test -Dbrowser=localchrome'
                    }
                 }
            }
        }
}