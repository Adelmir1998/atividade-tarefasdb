FROM openjdk:17
EXPOSE 8095
ADD target/tarefasdb.jar tarefasdb.jar
ENTRYPOINT [ "java","-jar","tarefasdb.jar" ]