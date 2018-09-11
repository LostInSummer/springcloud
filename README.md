# springcloud
learn spring cloud example

eureka代替zookeeper的使用案例

服务器启动顺序
eureka->eureka-producer->eureka-consumer

登陆eureka服务器
http://localhost:8761/

测试eureka-producer是否服务注册后能进行调用
http://localhost:2001/producer?name=chenjianlong

测试eureka-consumer是否能调用到producer
http://localhost:2101/consumer
