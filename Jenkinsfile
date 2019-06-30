pipeline {
    agent any
    stages {
         stage('Build') { 
            steps { 
              mvn test 
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}