def call(String url, String branch) {
    echo "Cloning repository..."
    git url: "${url}", branch: "${branch}"
    echo "Code cloned successfully"
}
