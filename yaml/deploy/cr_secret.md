# How to generate K8s Secret for Github container registry

1. Open this [link](https://github.com/settings/tokens) 
2. Generate new token with *read:packages* permission
3. Copy the generated token in a safe place
4. Use the following command and replace **USERNAME** with your github username and **GENERATED_TOKEN** with the token generated in step 2 above
    ```console
    echo -n "USERNAME:GENERATED_TOKEN" | base64
    ```
5. Replcae **B64_CREDS** in the following command with the result you got from the command above. 
    ```console
    echo -n  '{"auths":{"ghcr.io":{"auth":"B64_CREDS"}}}' | base64
    ```
6. Replace **DOCKERCONFIGJSON** in the file *dockerconfigjson.yaml* with the output from the previous step
7. Run the following command on your K8s cluster
    ```console
    kubectl apply -f dockerconfigjson.yaml
    ```

### You use this [website](https://www.base64encode.org/) if you don't have base64 or if you are using windows 