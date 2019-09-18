# SpringBoot集成RebbitMQ测试
&emsp;&emsp;初始摸索了一下rabbitMQ，此处尝试进行springboot与RabbitMQ的集成，实现消息的推送和接收，待完善其它模式的应用。

### 一、RabbitMq安装
&emsp;&emsp;网上安装教程很多，都可参考。如：[RabbitMQ安装教程](https://mp.weixin.qq.com/s?__biz=Mzg4ODAxMjc0NA==&mid=2247483715&idx=2&sn=a83b1c33746312ed1e15f2943183e5ff&chksm=cf80ebe4f8f762f2a6008a98a7cfe81d604b214b3302520bad6d1bb02fc08700b7639c5aa46c&scene=21#wechat_redirect)

### 二、springboot集成rabbitmq
&emsp;&emsp;搭建过程中遇到一个问题，网上找的资料标识的比较少：
我的springboot是2.1.8版本，添加依赖时需要包含以下两部分（网上给的基本只有amqp的启动器，我没有尝试低版本状态下是不是不需要spring-retry的依赖）
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.retry</groupId>
    <artifactId>spring-retry</artifactId>
</dependency>
```

