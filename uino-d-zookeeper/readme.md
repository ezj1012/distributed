# [zookeeper](https://zookeeper.apache.org/doc/r3.8.0/zookeeperProgrammers.html)
## 简介
Distributed Coordination services

### Data Model

#### Znode 
树状结构,
- Watches 
- Data Access
  - 每个node都有访问控制权限acl
  - 原子性读写
  - 数据一般要小于1M
 
- Ephemeral Nodes
 - 临时节点
 - 会话结束后自动消失
 - 不允许有子节点

- Sequence Nodes
 - 
 - 超过2147483647 会变为负数

- Container Nodes
 - 容器节点,当容器节点中没有子节点的时候,服务会自动移除该节点.
 - 创建容器节点的子节点,需要判断下改容器节点是否还在.

- TTL Nodes
 - 创建持久化节点和持久化带序列节点的时候可以用
 - 规定时间内该节点没有被修改并且没有子节点,服务会自动移除该节点
 - 单位为毫秒
 - 要使用它必须在配置文件中启用,否则抛出异常`KeeperException.UnimplementedException。`

### Sessions

### Watches

### Consistency Guarantees

## 环境

### 版本

- openjdk8
- zookeeper 3.8.0

### POM 依赖

```xml
<dependency>
    <groupId>org.apache.zookeeper</groupId>
    <artifactId>zookeeper</artifactId>
    <version>3.8.0</version>
</dependency>
```

## 例子

### 
本代码主要演示了如何连接zookeeper,并创建节点.