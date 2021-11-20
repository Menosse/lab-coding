#!/bin/bash
echo maven-project-imc > /tmp/.auth
echo $BUILD_TAG >> /tmp/.auth
echo $PASS >> /tmp/.auth

# scp -i ~/secrets/labsuser.pem /tmp/.auth ec2-user@10.0.1.34:/tmp/.auth
# scp -i ~/secrets/labsuser.pem ./jenkins/deploy/publish ec2-user@10.0.1.34:/tmp/publish
# ssh -i ~/secrets/labsuser.pem ec2-user@10.0.1.34 "bash /tmp/publish"

scp -i ~/secrets/labsuser.pem /tmp/.auth ec2-user@10.0.2.23:/tmp/.auth
scp -i ~/secrets/labsuser.pem ./jenkins/deploy/publish ec2-user@10.0.2.23:/tmp/publish
ssh -i ~/secrets/labsuser.pem ec2-user@10.0.2.23 "bash /tmp/publish"