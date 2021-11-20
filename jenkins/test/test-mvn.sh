#!/bin/bash
echo "***************************"
echo "** Testing the code ***********"
echo "***************************"

WORKSPACE=/home/ec2-user/jenkins-data/jenkins_home/workspace/lab-coding

docker run --rm -v $WORKSPACE/Projects/fit/desafio-imc:/app -v /root/.m2/:/root/.m2/ -w /app maven:3.5.4-alpine "$@"