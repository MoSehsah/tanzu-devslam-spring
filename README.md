
# Build and Run The Demo App
## Build Application and Push Image 
1. [Fork](https://github.com/MoSehsah/tanzu-devslam-spring/fork) this repo to your personal account
2. Follow instructions [here](app/README.md) to build your application
3. Commit and Push this change to Github
4. Check Github Actions to check the status of the build and push

---

## Deploy Application to Tanzu Community Edition
1. Update **GH_USER** and *image tag* in file `k8s/app.yaml` ***line 39*** with your github username and the lastest workflow run number
2. Run the following commands
    ```
    kubectl apply -f yaml/deploy/demo-app.yaml
    kubectl  port-forward svc/app 8080:8800 -n tanzu-devslam-spring
    ```
3. Check your application http://localhost:8080

---

## References
1. Install Docker Desktop [link](https://www.docker.com/products/docker-desktop/)
2. Install Tanzu Community Edition Extenstion [instructions](https://tanzucommunityedition.io/docs/v0.12/getting-started-docker/#install-the-extension)
3. Make sure you have JAVA 17 installed (here)[https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html]