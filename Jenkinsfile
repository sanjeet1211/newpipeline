pipeline {
    agent any
    stages {
         stage('Build') { 
            steps { 
               echo 'This is a minimal pipeline.' 
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}