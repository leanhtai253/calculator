pipeline {
     agent any
     stages {
          stage("Compile") {
               steps {
                    sh "./gradlew compileJava"
               }
          }
          stage("Unit test") {
               steps {
                    sh "./gradlew test"
               }
          }
          stage("Code coverage") {
               steps {
                    sh "./gradlew jacocoTestReport"
                    sh "./gradlew jacocoTestCoverageVerification"
               }
          }
          stage("Static code analysis") {
                steps {
                    sh "./gradlew checkStyleMain"
                    publishHTML (target: [
                         reportDir: 'build/reports/checkstyle/',
                         reportFiles: 'main.html',
                         reportName: "Checkstyle Report"
                    ])
                }
          }
          stage("Package") {
                steps {
                    sh "./gradlew build"
                }
          }
          stage("Docker build") {
                steps {
                    sh "docker build -t leanhtai253/calculator ."
                }
          }
          stage("Docker push") {
                steps {
                    sh "docker push leanhtai253/calculator"
                }
          }
          stage("Deploy to staging") {
                steps {
                    sh "docker run -d --rm -p 8765:8081 --name calculator leanhtai253/calculator"
                }
          }
     }
}