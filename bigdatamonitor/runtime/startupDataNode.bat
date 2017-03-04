title Data Node
java -Xms2048m -Xmx2048m -Xmn1024m -XX:PermSize=128M -XX:MaxPermSize=256M -Djava.net.preferIPv4Stack=true  -DadminNode=false -jar bboss-rt-${bboss_version}.jar 