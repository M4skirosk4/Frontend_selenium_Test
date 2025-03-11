pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                dir('selenium'){
                    git branch: 'main', url: 'https://github.com/M4skirosk4/Frontend_selenium_Test.git'
                }
            }
        }
        stage('Build') {
                  steps {
                     dir('selenium'){
                         script {
                               echo 'Building the project...'
                               sh 'mvn clean package -DskipTests=true'
                               echo 'Resolving dependencies...'
                               sh 'mvn dependency:resolve'
                               }
                           }
                       }
                  }
        stage('Test') {
                 steps {
                     dir('selenium'){
                           script {
                                  echo 'Running tests...'
                                  sh 'mvn test -e'
                                  }
                           }
                      }
                }

    }
}