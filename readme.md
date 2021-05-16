Import as maven project.
Using maven tasks clean and install download all the necessary dependencies.
If required, change active profile property in the application.properties file.

To run the application with a docker, use the Dockerfile configuration:
1. Building app's docker image
  >docker build -f Dockerfile -t docker-spring-boot .
2. Running the image inside of a docker container 
  >docker run -p 8080:8080 docker-spring-boot