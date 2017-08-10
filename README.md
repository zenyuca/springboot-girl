# 初识 SpringBoot

## 启动 SpringBoot
```
    1. 在 IDE 中右键 run
    2. 在 shell 中使用 mvn spring-boot:run
    3. 在 shell 中使用 java -jar package.jar [--spring.profiles.active=dev]
```

## 常用注解
```
    @RestController 定义一个的基于 RESTful 的路由控制器。
    同时它是 @Controller 和 @ResponseBody 的组合注解。

    @RequestMapping 定义一个访问路由，类和方法上皆可使用。
    @PathVariable 获取 url 中的参数，定义在方法的参数上。url 参数使用 {} 扩起来。
    @RequestParam 获取请求参数，定义在方法的参数上。

    @Value 从配置文件中获取数据，在类属性上使用。使用 EL 表达式获取数据。
    @Component 将一个类注册为 bean。
    @ConfigurationProperties(prefix = "variable") 将配置文件一组数据注册到 bean 中。
    variable 是配置文件的节点变量，

    如下：

    url:
      protocol: "http"
      domain: "zenyuca.club"
      port: 80

    以上是 application.yml 的写法，具有鲜明的层次感（推荐）。
```

## 附录
```
    项目的每一次提交注释说明了应掌握的知识点。
```