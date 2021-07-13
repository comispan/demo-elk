# ELK demo

This project uses Spring Boot and Log4j2 to perform logging to the ELK stack.

# Getting Started

1. Start the ELK stack on Docker using `docke-compose up -d'`
2. Run the application in production environment.
   
   There is a run configuration in the folder `./idea/runConfigurations/`
3. Do a GET post to `localhost:8080/elk` and see the logs in Kibana

### Reference Documentation

* [Sprinkle Some ELK on Your Spring Boot Logs](https://dzone.com/articles/sprinkle-some-elk-on-your-spring-boot-logs)
* [[Spring] Enable logging to ELK with Log4J2 and Sprint cloud sleuth](https://www.chunho-ling.com/2021/02/10/spring-enable-logging-to-elk-with-log4j2-and-sprint-cloud-sleuth/)

