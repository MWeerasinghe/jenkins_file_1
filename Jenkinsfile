pipeline{
    agent any

    environment {
        NEW_VERION = '1.0.0'
        SERVER_CREDENTIALS = credentials('mithun_admin') //id
    }

    stages{

        stage("build"){
            steps{
                echo "building the application ${NEW_VERSION}" //Nneed to be double quote
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
                echo "deploying the applicatoin"
                echo "deploy with ${SERVER_CREDENTIALS}"
                //sh - scripts
            }
        }
    }
}
