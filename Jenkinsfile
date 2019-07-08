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
                       
              //           configFileProvider([configFile('401af218-ccdc-495b-92bd-fbbcd5d3d064')]) {
               //     sh 'mvn -gs $MAVEN_GLOBAL_SETTINGS test -Pprod'
                  bat 'mvn install'
               // }
                
               // configFileProvider([configFile(fileId: '401af218-ccdc-495b-92bd-fbbcd5d3d064', variable: 'MAVEN_GLOBAL_SETTINGS')]) {
                 //   bat 'mvn --settings=/DevOps/apache-maven-3.5.3-bin/apache-maven-3.5.3/conf/settings.xml test -Pprod'
              
                 //  bat 'mvn --settings=https://github.com/sanjeet1211/newpipeline/blob/master/settings.xml test -Pprod'
                    
                 //   }
                       
                        }
                       } 
                    if (params.platform == 'Android'){
                        echo 'I execute elsewhere'
                        bat 'mvn test -Pdev'
                      }
                      
                    if (params.platform == 'Both') {
                        echo 'I only execute on the mastera branch' 
                        bat 'mvn test -Pboth'
                       } 
            }
             }