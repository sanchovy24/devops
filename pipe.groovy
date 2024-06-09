pipeline {
    agent any

    stages {
        stage('Информация о дисках файловой системы:') {
            steps {
                  sh 'df -h'
            }
        }
    }
}
