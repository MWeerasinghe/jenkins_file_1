def gv  //to available globally

pipeline{
    agent any

    environment { //environmentel variables
        NEW_VERION = '1.0.0'
        SERVER_CREDENTIALS = credentials('mithun_admin') //id from Jenkins credential
    }

    tools{ //tools like only these maven or gradle,jdk
        maven "Maven"
    }

    parameters{
        //string(name:"VERSION", defaultValue:"", description:"version to deploy on prod")
        choice(name:"VERSION", choices: ['1.1.0','1.2.0','1.3.0'], description:"")
        booleanParam(name:"executeTests",defaultValue:true, description:"")
    }

    stages{

        stage("init"){
            steps{
                script {
                    gv = load "script.groovy"
                }
            }
        }

        stage("build"){
            when {
                expression{
                    params.executeTests==true  //check the parameter
                }
            }
            steps{
                echo "building the application ${NEW_VERSION}" //Need to be double quote
                script {
                    gv.buildApp()
                }
            }
        }

        stage("test"){
            // when{
            //     expression{
            //         BRANCH_NAME == 'dev' || BRANCH_NAME == 'master'
            //     }
            // }
            steps{
                echo "testing the application"
            }
        }

        stage("deploy"){
            steps{
                echo "deploying the applicatoin version ${params.VERSION}"
                echo "deploy with ${SERVER_CREDENTIALS}"
                //sh - shell scripts
            }
        }
    }
}
