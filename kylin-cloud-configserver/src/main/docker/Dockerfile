# store59/maven-git-tomcat8:latest
# kylin-cloud-config-server

# extend
# FROM store59/maven-git-tomcat8:latest
FROM 59store/ewolff-java

MAINTAINER shanren <chenyb@59store.com>

VOLUME /tmp
ADD kylin-cloud-configserver.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 18888
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
