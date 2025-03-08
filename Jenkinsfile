pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/M4skirosk4/Frontend_selenium_Test.git'
                echo 'Running tests...'
                sh 'mvn test -e'
            }
        }
        stage('Build') {
                steps {
                    script {
                         echo 'Building the project...'
                        sh 'mvn clean package -DskipTests=true -f pom.xml'
                            }
                        }
                }
        stage('Resolve Dependencies') {
            steps {
                script {
                    echo 'Resolving dependencies...'
                    sh 'mvn dependency:resolve'
                }
            }
        }
        stage('Test') {
                steps {
                    script {
                        echo 'Running tests...'
                        sh 'mvn test -e'
                            }
                    }
                }
        }
}