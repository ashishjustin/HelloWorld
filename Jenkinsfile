pipeline {
    agent any
    stages {
        stage('compile') {
            steps {
                sh 'mvn clean install'
                echo 'Compiled successfully'
            }
        }
        stage('review') {
            steps {
                sh 'mvn pmd:check'
                echo 'pmd test done'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
                echo 'Tested success'
            }
        }
        stage('run') {
            steps {
                sh 'mvn springboot:run'
                echo 'Tested success'
            }
        }
    }
}
