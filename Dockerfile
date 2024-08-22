# Use Eclipse Temurin with Ubuntu Focal Fossa
FROM eclipse-temurin:11-jdk-focal

# Install required packages using apt
RUN apt-get update \
    && apt-get install -y unzip curl \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/* \
    && adduser --uid 1001 --home /home/sunbird --disabled-password --gecos "" sunbird \
    && mkdir -p /home/sunbird

# Add and unzip application package
ADD ./group-service-1.0.0-dist.zip /home/sunbird/
RUN unzip /home/sunbird/group-service-1.0.0-dist.zip -d /home/sunbird/
RUN chown -R sunbird:sunbird /home/sunbird

# Switch to non-root user
USER sunbird

# Expose the application port
EXPOSE 9000

# Set working directory
WORKDIR /home/sunbird/

# Command to run the application
CMD ["java", "-XX:+PrintFlagsFinal", "$JAVA_OPTIONS", "-Dlog4j2.formatMsgNoLookups=true", "-cp", "/home/sunbird/group-service-1.0.0/lib/*", "play.core.server.ProdServerStart", "/home/sunbird/group-service-1.0.0"]
