pipeline {
    agent any
    stages {
         stage('Build') { 
            steps { 
               sh 'mvn test' 
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}