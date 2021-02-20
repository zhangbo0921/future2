## 概要

基于Spring Cloud Alibaba方案的微服务框架。主要实现：

1. 授权中心
2. 用户中心
3. 消息中心（包括：内部消息、短信、邮件等）
4. 支付中心
5. 新闻中心
6. 订单中心
7. 广告中心

## 技术栈

该框架主要使用：

- Spring Cloud
- Spring Cloud Alibaba
- Spring Cloud Security OAuth2.0
- Nacos
- RocketMQ
- Sentinel
- Spring Cloud OpenFeign
- Spring Cloud Gateway
- MySQL
- MongoDB
- Redis
- Elasticsearch
- ……

后续有的话，继续加

## 模块列表

- docs
- future-api-gateway
- future-auth-center
- future-commons
- future-order-center
- future-user-center
- future-msg-center
- future-pay-center

## 用户登录

### OAuht2认证四种方式

#### 授权码模式

1. 申请授权码

   `授权码接口`:http://localhost/oauth/authorize

   浏览器访问授权码接口，认证服务器重定向到`redirection_uri`并以？的方式，返回授权码。

   参数列表：

   

   | 参数            | 是否必须 | 说明                                             |
   | --------------- | -------- | ------------------------------------------------ |
   | client_id       | 是       | test为测试账号，具体账号需要申请                 |
   | response_type   | 是       | code                                             |
   | redirection_uri | 是       | 如：http://www.baidu.com，根据自己的情况自己实现 |

2. 申请token

3. 访问受限资源

#### implicit

#### password

#### client_credentials

#### refresh_token