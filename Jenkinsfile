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
                        bat 'mvn test -Pprod'
                       } 
                    if (params.environment == 'Test'){
                        echo 'I execute elsewhere'
                        bat 'mvn test -Pdev'
                      }
                      
                    if (params.environment == 'Both') {
                        echo 'I only execute on the master branch' 
                        bat 'mvn test -Pboth'
                       } 
                   
                    
             }
             }
          }