FROM openjdk:17-jdk-alpine

# set workdir
WORKDIR /app

# copy source code
COPY ./src /app/

# compile source code
RUN javac Main.java

# run top ( Main ) in batch mode
CMD ["top", "-b"]