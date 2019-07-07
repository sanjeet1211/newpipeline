    node
    	{
             stage('SCM Checkout')
            {
             tool name: 'Maven', type: 'maven'
             git 'https://github.com/sanjeet1211/newpipeline.git'
            }
            stage('Test') {
                script {
                    if (params.platform == 'iOS') {
                        echo 'I only execute on the master branch' 
                       
                        configFileProvider([configFile('C:\DevOps\apache-maven-3.5.3-bin\apache-maven-3.5.3\conf')]) {
                        sh 'mvn -s $MAVEN_SETTINGS test -Pprod'
    // some block}
                       } 
                    if (params.platform == 'Android'){
                        echo 'I execute elsewhere'
                        bat 'mvn test -Pdev'
                      }
                      
                    if (params.platform == 'Both') {
                        echo 'I only execute on the master branch' 
                        bat 'mvn test -Pboth'
                       } 
            }
             }
          }