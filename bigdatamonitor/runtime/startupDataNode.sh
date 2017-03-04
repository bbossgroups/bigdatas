#!/bin/sh
java -Xms2048m -Xmx2048m -Xmn1024m -XX:PermSize=256M -XX:MaxPermSize=512M -Djava.net.preferIPv4Stack=true  -DadminNode=false -jar bboss-rt-${bboss_version}.jar

 
