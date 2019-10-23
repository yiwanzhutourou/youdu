## Youdu - 基于一堆东西的小玩具

youdu 是一个基于 `Docker`、`Nginx`、`spring-boot`、`MySQL`、`Vue` 的前后端分离的小玩具。百分百参考这个项目搭建：[Fame](https://github.com/zzzzbw/Fame)。目前项目还比较小巧幼稚，后端只有一张数据表，提供了两三个 funny 的接口给前端。你可以在这里查看效果：[youdu admin](https://youdushufang.com/admin)。

#### 项目结构

- youdu-dev

  基于 `Docker` 部署的本地开发工具，目前包括一个运行在 `Docker` 容器里的 `MySQL` 服务和 `phpMyAdmin`，`docker-compose up` 起来就好了

- youdu-docker

  各种 `Docker` 配置

- youdu-fe

  基于`Vue` 的前端

- youdu-fe-admin

  基于 `Vue`、`element-ui` 的管理后台前端

- youdu-server

  基于 `spring-boot` 的后端

#### 如何开发？

后端 `youdu-server` 以及两个前端 `youdu-fe`、`youdu-fe-admin` 都可以作为独立的前后端项目开发。`youdu-dev` 目录下有一个基于 `docker compose` 的 `MySQL` 数据库。

#### 如何部署？

随便找一台云服务器，安装好 `Docker CE`、`docker compose`，跑一下 `docker-compose up -d` 即可。

#### 一个怎样的玩具？

1. `Nginx`、数据库、后端、前端基于 `Docker` 部署在一个虚拟环境里，运行在一台物理机上。
2. 通过 `Nginx` 反向代理将请求转发到 `youdu-fe`、`youdu-fe-admin`、`youdu-server` 处理。最终处理请求的 `youdu-fe`、`youdu-fe-admin`、`youdu-server` 这 3 层对 `nginx` 层暴露了各自的接口。参见 `youdu-docker/youdu-nginx` 下的配置文件以及根目录下的 `docker-compose.yml` 就很清楚了。
3. 数据库账号密码直接暴露在代码仓库里了，整个容器对外还暴露了 `phpMyAdmin` 供各位朋友们访问数据库，这是什么意思呢？我也不想说啊！
4. 全家桶都在一台机器的一个虚拟容器里了，你问我服务怎么平滑上线？这个怎么说呢……
5. 这个玩具可以干嘛呢？嗯，可以用来练手啊！写写 `Java`，写写 `Vue` 啥的，给自己做一个技术博客发布到阿里云什么的。如果你接了一个指明要 `Spring` 后端、`Vue` 前端的小破外包，用这个玩具起步是不是已经感觉很富足了？

#### 可以玩到的点

1. `nginx` 怎么玩？

   仔细读一读官方的文档，搞清楚每一条配置的意义

2. `Docker` 怎么玩？

   仔细读一读官方的文档，搞清楚每一条命令的意义

3. `Vue` 怎么玩？

   仔细读一读官方的文档，搞清楚代码为什么这么写

4. `Spring` 怎么玩？

   仔细读一读官方的文档，搞清楚代码为什么这么写

#### 后续计划

1. 实现一个基于 `Spring Security` 的登陆模块
2. 实现一个门店、店员管理的权限系统
3. 实现一个图书借阅管理系统

#### 长远计划

咱也要微服务化，总之什么注册中心、`K8s`、`RPC` 框架、网关都整进来玩玩呗。