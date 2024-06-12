pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                echo 'pull success'
            }
        } 
        stage('Build') {
            steps {
                echo 'build success'
            }
        }
        stage('Test') {
            steps {
                echo 'test success'
            }
        }
        stage('Deploy') {
            steps {
                echo 'deploy success'
            }
        }
    }
}