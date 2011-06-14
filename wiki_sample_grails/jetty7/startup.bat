set JAVA_HOME=c:\opt\jdk
set JAVA_OPTS=-server -XX:+TieredCompilation
set JAVA_OPTS=%JAVA_OPTS% -Xmx1024m -Xms1024m -XX:MaxPermSize=256m
echo $JAVA_OPTS

%JAVA_HOME%/bin/java %JAVA_OPTS% -jar start.jar
