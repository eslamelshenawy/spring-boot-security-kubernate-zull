#!/bin/bash

# set -e
set -x

. ./set-env.sh

cd ../k8s

kubectl config use-context $CLUSTER1_NAME

kubectl apply -n $NAMESPACE_MONGO -f mongodb-configmap.yaml
kubectl apply -n $NAMESPACE_MONGO -f mongodb-secret.yaml
kubectl apply -n $NAMESPACE_MONGO -f mongodb-deployment.yaml

kubectl apply  -f mysql-configmap.yaml
kubectl apply  -f mysql-secret.yaml
kubectl apply  -f mysql-deployment.yaml

cd ../scripts