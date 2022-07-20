pipeline {
    agent any

    parameters {
      booleanParam(name: 'promover', defaultValue: true, description: 'Si se pasa el QualityGate se promueve a la rama productiva.')
    }
  
    tools {
        gradle "5.5"
    }
    stages {
        stage('Construcción') {
          when {
            expression { params.promover == true}
          }
            steps {
                echo "Construcción iniciada"
            }
        }
      stage('Construcción 2') {
        when { 
          expression { params.promover == false }
        }
          steps {
            echo "Cons 2"
          }
      }
    }
}
