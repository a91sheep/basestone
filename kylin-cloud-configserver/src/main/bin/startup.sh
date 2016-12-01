#!/bin/bash

JAVA_OPTS="-server -Xms1024m -Xmx1024m -Xmn384m -XX:MaxPermSize=64m \
-Xss256k -XX:+UseConcMarkSweepGC \
-XX:+UseParNewGC -XX:CMSFullGCsBeforeCompaction=5 \
-XX:+UseCMSCompactAtFullCollection \
-XX:+PrintGC -Xloggc:/data/bi/kylin-cloud-configserver/logs/gc.log"

PHOME=$(dirname `readlink -f "$0"`)
PHOME=$(dirname $PHOME)

pid=`ps -eo pid,args | grep kylin-cloud-configserver| grep java | grep -v grep | awk '{print $1}'`
if [ -n "$pid" ]
then
    kill -3 ${pid}
    kill ${pid} && sleep 3
    if [  -n "`ps -eo pid | grep $pid`" ]
    then
        kill -9 ${pid}
    fi
    echo "kill pid: ${pid}"
fi

java $JAVA_OPTS -cp $PHOME/conf:$PHOME/lib/* com.store59.kylin.cloud.configserver.ConfigServerApplication $1 > /dev/null 2>&1 &
