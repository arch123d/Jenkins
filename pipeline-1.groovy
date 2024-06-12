pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
               git branch: 'main', url: 'https://github.com/Shantanu20000/MyGitHubRepo.git' 
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
