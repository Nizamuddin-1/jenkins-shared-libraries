def call(){
       echo "Deploying latest container..."
       sh "sudo docker compose up -d --build --force-recreate"
       echo "Image build successfully using groovy file"
}
