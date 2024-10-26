pipeline {
    agent any
    stages {
       stage('stage1') {
            when {
                branch 'production'
                environment name: 'DEPLOY_TO', value: 'production'
            }
            steps {
                echo 'Deploying'
            }
        }
        stage('stage2') {
            steps {
                echo 'Deploying'
            }
        }
    }

}
