;;location at D:\target case 
;; target
;;   - jdk
;;   - jetty7
;;   - ectest
;;   - local_startup.bat   
;;
;; etc copy into jetty7 

for /F "delims=" %%s in ('cd') do @set PWD=%%s
echo %PWD%
set JAVA_HOME=%PWD%/jdk
set JAVA_OPTS=-server -XX:+TieredCompilation
set JAVA_OPTS=%JAVA_OPTS% -Xmx1024m -Xms1024m -XX:MaxPermSize=256m
set JAVA_OPTS=%JAVA_OPTS% -Dgroovy.source.encoding=UTF-8 -Dfile.encoding=UTF-8

echo %JAVA_OPTS%

cd jetty7

%JAVA_HOME%/bin/java %JAVA_OPTS% -jar start.jar
