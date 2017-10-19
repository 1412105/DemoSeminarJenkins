#!/usr/bin/env groovy

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'

                bat 'javac jk/*.java'
            }
        }
  		stage('Test') {
  			steps {
  				echo 'Testing..'
  				bat 'java jk.HelloWorld'
  				// junit '**/target/*.xml'
  			}
  		}
  		stage('Deploy') {
  			steps {
  				echo 'Create .jar file..'
  				bat 'jar -cef jk.HelloWorld HW.jar jk/*.class'
          bat 'java -jar HW.jar'
  			}
  		}
    }
}
