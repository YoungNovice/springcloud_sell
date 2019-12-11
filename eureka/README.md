### 
mvn clean package

###
java -jar eureka.jar

###
nohup java -jar target/eureka-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 &


ps -ef|grep eureka

kill -9 <port>


# Eureka高可用
让多个eureka相互注册
vm option 
    -Dserver.port=876x
让client向多个eureka注册 多配置一下地址就可以了

# idea启动多个服务器
复制启动配置 修改active profiles配置 跟配置文件-后缀抑制就好
