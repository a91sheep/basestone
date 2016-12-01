# store59/maven-git-tomcat8:latest
# kylin-cloud-discoveryserver

# extend
# FROM store59/maven-git-tomcat8:latest
FROM ewolff/docker-java

MAINTAINER shanren <chenyb@59store.com>

VOLUME /tmp
ADD kylin-cloud-discoveryserver.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 18761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
