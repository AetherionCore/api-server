:: Make sure application-dev.properties is correct!
echo off
cls
cd target
java -jar -Dspring.profiles.active=dev ls4-api-server-0.0.1-SNAPSHOT.jar
pause
exit