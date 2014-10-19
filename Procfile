#web:    java $JAVA_OPTS -cp target/classes:target/dependency/* wishListDiary
#web: sh target/bin/webapp
web: java $JAVA_OPTS -jar target/dependency/jetty-runner.jar --port $PORT target/*.war
