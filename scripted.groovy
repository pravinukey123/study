node {  
    stage('git clone') { 
        git branch: 'main', url: 'https://github.com/pravinukey123/study.git' 
    }
    stage('echo') { 
        sh 'mkdir hello'
    }
}