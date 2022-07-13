// read file from workspace
job('example-2') {
    steps {
        sh 'pwd  >> pwd.txt'
    }
}