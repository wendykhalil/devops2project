pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo "Pas de Git pour ce test"
            }
        }

        stage('Build') {
            steps {
                bat "mvn clean package"
            }
        }
    }
}
