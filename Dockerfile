FROM openjdk:8-jdk
ARG JAR_FILE

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS JAVA_OPTS=""

# Add a impots user to run our application so that it doesn't need to run as root
RUN useradd -ms /bin/bash impots
WORKDIR /home/impots

USER impots

ADD ${JAR_FILE} impots-app.jar

ENTRYPOINT exec java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar "${HOME}/impots-app.jar" "$@"

EXPOSE 9099