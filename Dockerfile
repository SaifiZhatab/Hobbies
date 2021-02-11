FROM    openjdk:11
ADD     build/libs/HobbiesGradle-1.0-SNAPSHOT.jar  HobbiesGradle.jar

EXPOSE 8085

ENTRYPOINT ["java", "-jar", "HobbiesGradle.jar"]