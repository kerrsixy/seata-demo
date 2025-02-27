# Seata 分布式事务演示项目

## 项目简介

本项目是一个基于 Spring Boot 和 Seata 实现的分布式事务管理示例。项目包含三个微服务模块：`account-service`、`order-service` 和 `storage-service`，分别负责账户管理、订单管理和库存管理。通过 Seata 的全局事务管理，确保在分布式环境下多个服务之间的事务一致性。

## 目录结构

    seata-demo 
    │ 
    ├── account-service # 账户服务 
    ├── order-service # 订单服务 
    └── storage-service # 库存服务

## 模块介绍

### account-service (账户服务)

- **功能**：负责用户账户余额的管理，包括扣款操作。
- **主要接口**：
    - `AccountController`：提供 RESTful API 接口 `/account/{userId}/{money}` 用于扣减用户余额。
- **依赖**：
    - MyBatis Plus：用于数据库操作。
    - Seata：用于分布式事务管理。

### order-service (订单服务)

- **功能**：负责订单的创建和管理，协调其他服务完成订单流程。
- **主要接口**：
    - `OrderController`：提供 RESTful API 接口 `/order` 用于创建订单。
- **依赖**：
    - MyBatis Plus：用于数据库操作。
    - Seata：用于分布式事务管理。
    - Feign：用于调用其他服务的接口（如 `account-service` 和 `storage-service`）。

### storage-service (库存服务)

- **功能**：负责商品库存的管理，包括库存扣减操作。
- **主要接口**：
    - `StorageController`：提供 RESTful API 接口 `/storage/{id}/{count}` 用于扣减库存。
- **依赖**：
    - MyBatis Plus：用于数据库操作。
    - Seata：用于分布式事务管理。

## 运行环境

- Java 8+
- Maven 3.5+
- MySQL 5.7+
- Seata Server

## 快速启动

1. **启动 Seata Server**

   下载并启动 Seata Server，参考 [Seata 官方文档](https://seata.io/zh-cn/docs/operations/start-server.html)。

2. **配置数据库**

   根据各模块的 `application.yml` 文件配置对应的数据库连接信息，并创建相应的数据库表结构。

3. **启动服务**

   使用 Maven 或 IDE 启动各个服务模块：
   ```cmd
   mvn spring-boot:run
   ```
4. **测试接口**

   使用 Postman 或 curl 测试各模块提供的 RESTful API 接口。

## 注意事项

- 确保 Seata Server 正常运行，并且各服务模块能够正确连接到 Seata Server。
- 数据库表结构需要提前创建好，确保各服务模块能够正常访问数据库。
- 在开发和调试过程中，注意日志输出，以便及时发现和解决问题。

## 作者

zjp

## 版本

1.0

## 参考资料

- [Seata 官方文档](https://seata.io/zh-cn/docs/)
- [Spring Boot 官方文档](https://spring.io/projects/spring-boot)
- [MyBatis Plus 官方文档](https://mybatis.plus/)

---

希望这个 README.md 对你理解项目有所帮助。如果有任何问题或建议，请随时联系我。
