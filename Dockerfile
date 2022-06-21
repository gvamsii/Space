FROM openjdk:11
ADD target/DockDemo-0.0.1-SNAPSHOT.jar dockdemo.jar
ENTRYPOINT ["java","-jar","/dockdemo.jar"]
