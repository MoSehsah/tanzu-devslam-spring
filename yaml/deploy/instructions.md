
# Build and Run The Demo App
## Build Application and Push Image 
1. [Fork](https://github.com/MoSehsah/tanzu-devslam-spring/fork) this repo to your personal account
2. Update **GH_USER** in `.github/workflows/workflow.yaml` to your github username
3. Commit and Push this change to Github
4. Check [Github Actions ](https://github.com/MoSehsah/tanzu-devslam-spring/actions) to check the status of the build and push


---
If your forked github repository is private you need to follow the steps [here](cr_secret.md) 

## Deploy Application to Tanzu Community Edition
1. Run the following commands
    ```
    kubectl apply -f yaml/deploy/demo-app.yaml
    kubectl  port-forward svc/demo-app-service 8080:80
    ```
2. Check your application http://localhost:8080

---
---
## [Optional] Utilize Contour Ingress
1. Run the following command to install contour

    ```
    tanzu package install contour \
    --package-name contour.community.tanzu.vmware.com \
    --version 1.18.1 \
    --values-file yaml/deploy/contour-values.yaml
    ```

2. Apply ingress and do port forward
   ```
   kubectl apply -f yaml/deploy/demo-app-ingress.yaml
   kubectl --namespace projectcontour port-forward svc/envoy 8080:80
   ```

3. Run the following command in a different terminal window

    ```
    curl -s -H "Host: nginx-example.projectcontour.io" http://localhost:8080
    ```