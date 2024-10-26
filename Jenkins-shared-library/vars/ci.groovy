def call() {
pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                script {
                    echo 'Compiling the code...'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    echo 'Running tests...'
                }
            }
        }
        stage('Package') {
            steps {
                script {
                    echo 'Packaging the application...'
                }
            }
        }
        stage('Release') {
            steps {
                script {
                    echo 'Releasing the application...'
                }
            }
        }
    }
}

}
