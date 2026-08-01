def call(String localImage, String dockerHubUser, String remoteImageName, String imageTag = 'latest') {
    echo "Pushing built image to DockerHub..."
    sh "sudo docker tag ${localImage} ${dockerHubUser}/${remoteImageName}:${imageTag}"
    sh "sudo docker push ${dockerHubUser}/${remoteImageName}:${imageTag}"
}
