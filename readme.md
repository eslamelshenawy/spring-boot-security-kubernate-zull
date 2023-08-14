
### Clone repository

```bash
git clone git@github.com:eslamelshenawy/spring-boot-security-kubernate-zuul.git
```
## minikube start 
```bash
minikube start
```
### Start Kubernetes cluster

```bash
cd ./scripts/
./start-cluster.sh
```

### Configure Kubernetes cluster

```bash
cd ./scripts/
./setup-cluster.sh
```

### Deploy application to Kubernetes cluster

```bash
cd ./scripts/
./install-all.sh
```

### Polulate test data

```bash
cd ./scripts/
./populate-data.sh
```
## minikube dashboard
```bash
minikube dashboard
```
### Observe service logs

```bash
cd ./scripts/
./user-log.sh
```

### Open Swagger UI web interface

```bash
cd ./scripts/
./gateway-open.sh
```

### Undeploy application from Kubernetes cluster

```bash
cd ./scripts/
./delete-all.sh
```

### Delete Application specific Kubernetes cluster configuration (namespaces, clusterRole, etc.)

```bash
cd ./scripts/
./destroy-cluster.sh
```

### Stop Kubernetes cluster

```bash
cd ./scripts/
./stop-cluster.sh
```
```bash
 sudo chmod 777 -R  scripts
```

#### link swagger

http://127.0.0.1:8080/swagger-ui.html

###  user
http://127.0.0.1:8080/user

```bash
kubectl get pods
```
```bash
kubectl logs mysql-76c6bf8f88-fvtpb
```
```bash
kubectl describe pod mysql-76c6bf8f88-2w9b7
```
```bash
kubectl exec -it mysql-76c6bf8f88-5kwhc /bin/bash
```
```bash
mysql -h mysql -u root -p  # username root #password root
```
```bash
show databases ;  # use javatechie // show tables;
```

```bash
kubectl --namespace=kube-system get pods
```
```bash
kubectl exec --namespace=kube-system <name> -it -- sh
```
```bash
kubectl get pods --all-namespaces
```
```bash
kubectl delete pods --all
```
```bash
kubectl delete all --all --all-namespaces
```
```bash
kubectl delete deployment --all
```
```bash
kubectl create namespace
```
```bash to collect the logs from the pod
kubectl logs <pod_name> -n <namespace_name>
```
```bash output the logs to a file
kubectl logs <pod_name> -n <namespace_name> > broken-pod.log
```

