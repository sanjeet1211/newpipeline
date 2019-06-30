pipeline {
    agent any
    stages {
         stage('Build') { 
            steps { sh 'mvn clean install'}
        }
        stage('test'){}
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}