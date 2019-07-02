    node
    	{
            stage('SCM Checkout')
            {
             tool name: 'Maven', type: 'maven'
             git 'https://github.com/sanjeet1211/newpipeline.git'
            }
            stage('Test') {
                script {
                    if (params.environment == 'Hello') {
                        echo 'I only execute on the master branch'
                         bat 'mvn test'
                    } else {
                        echo 'I execute elsewhere'
                    }
             }
             }
          }