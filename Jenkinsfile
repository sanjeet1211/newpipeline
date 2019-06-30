pipeline {
    agent any
    stages {
        stage('Example') {
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