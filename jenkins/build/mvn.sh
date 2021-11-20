#!/bin/bash
echo "***************************"
echo "** Building jar ***********"
echo "***************************"

# WORKSPACE=/home/ec2-user/jenkins-data/jenkins_home/workspace/vorx-backend-app-pipeline
WORKSPACE=/home/ec2-user/jenkins-data/jenkins_home/workspace/lab-coding

docker run --rm -v $WORKSPACE/Projects/fit/desafio-imc:/app -v /root/.m2/:/root/.m2/ -w /app maven:3.5.4-alpine "$@"
