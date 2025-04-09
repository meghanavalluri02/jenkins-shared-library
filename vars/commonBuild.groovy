def call() {
    stage('Checkout') {
        checkout scm
    }

    stage('Unit Tests') {
        echo 'Running unit tests...'
        sh './test.sh'
    }

    stage('Deploy') {
        echo "Deploying to environment..."
        sh './deploy.sh'
    }
}
