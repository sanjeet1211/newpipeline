    node
    	{
            stage('SCM Checkout')
            {
             tool name: 'Maven', type: 'maven'
             git 'https://github.com/sanjeet1211/newpipeline.git'
            }
            stage('Test') {
                script {
                    if (params.environment == 'Prod') {
                        echo 'I only execute on the master branch' 
                        params.environment= 'testng.xml'
                        echo "params.environment"
                         bat 'mvn test'
                    } 
                    if (params.environment == 'Test'){
                        echo 'I execute elsewhere'
                    }
                    
             }
             }
          }