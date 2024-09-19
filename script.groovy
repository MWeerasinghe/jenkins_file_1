def buildApp() {
    echo "building the app"
}

def testApp() {
    echo "testing the app"
}

def deployApp() {
    echo "deploying version ${params.VERSION}" //fro parameters of jenkins
}

return this
