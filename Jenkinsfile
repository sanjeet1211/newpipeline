    node
    	{
    	parameters {
        string(name: 'environment', defaultValue: 'Hello', description: 'How should I greet the world?')
  		  }
            stage('SCM Checkout')
            {
             tool name: 'Maven', type: 'maven'
             git 'https://github.com/sanjeet1211/newpipeline.git'
            }
            stage('Test') {
                bat 'mvn test'
                script {
                    if (params.environment == 'Hello') {
                        echo 'I only execute on the master branch'
                    } else {
                        echo 'I execute elsewhere'
                    }
             }
             }
          }