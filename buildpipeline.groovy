pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                git 'https://github.com/sharadrathod/studentapp-ui.git'
            }
        } 
        stage('Build') {
            steps {
                sh '/opt/maven/bin/mvn clean package'
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
