# SpringCloud-demo

完成maven结构设置，将使用nacos作为服务发现注册中心和配置中心。#2020-06-22

在provider模块中添加Druid 作为数据库连接池，并配置 `http://localhost:8070/druid/` 查看页面。添加Mybatis作为ORM框架。

添加整合Dubbo实现服务间的RPC接口调用，下一步抽出API（不经常变动）单独做一个module

将RPC的接口单独拿出来做一个module，使用nacos作为配置中心（未配置成功）