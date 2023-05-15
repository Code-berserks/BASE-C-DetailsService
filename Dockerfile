FROM openjdk:17
EXPOSE 8080
ADD target/detailsService.jar detailsService.jar
ENTRYPOINT [ "java","-jar","/detailsService.jar" ]
