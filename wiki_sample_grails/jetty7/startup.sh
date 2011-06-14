export JAVA_HOME=/opt/jdk
#JAVA_OPTS="-server -XX:+TieredCompilation"
JAVA_OPTS="-server"
JAVA_OPTS="$JAVA_OPTS -Xmx1024m -Xms1024m -XX:MaxPermSize=256m"
echo $JAVA_OPTS

$JAVA_HOME/bin/java $JAVA_OPTS -jar start.jar
