**springboot官方文档如下所示：**  

[springboot 官方参考文档](https://docs.spring.io/spring-boot/docs/1.5.9.RELEASE/reference/htmlsingle/#using-boot-starter)
## @ConfigurationProperties和@value的使用区别  

+ @ConfigurationPropertries  
  1. 支持从配置文件中的属性批量注入  
  2. 支持属性的松散绑定  
  3. 不支持SpEL语法
  4. 支持jsr303数据校验  
  5. 支持复杂属性的绑定
+ @Value  
  1. 必须一个一个指定  
  2. 不支持属性的松散绑定  
  3. 支持SpEL语法
  4. 不支持jsr303数据校验
  5. 不支持复杂属性的绑定 
  
## @PropertySource和@ImportResource
  @PropertySource作用： 指定springboot应用指定的属性加载资源  
  @ImportResource作用： 导入spring的配置文件并使其生效  
  **springboot推荐的使用方式是使用配置类**
## springboot应用在开发时指定不同的开发环境   
  + properties文件的形式  
  分别创建application.properties,application-dev.properties,application-prod.properties,application-test.properties四个配置文件，在application.properties中指定spring.profiles.active=使用的环境名称,如生产环境，则指定为spring.profiles.active=dev  
  + yml语法形式  
  在application.yml方件中可以通过```--- ---```来分隔不同的环境变量，然后指定spring profiles active dev
  + jar运行时指定你要使用的环境  
  运行如下命令： java -jar xxx.jar --spring.profiles.active=你要使用的运行环境  
  + 在虚拟机运行时指定你要使用的参数格式   
  在vm options选项中指定： -Dspring.profiles.active=你要使用的运行环境  
 ## spring boot 配置文件的加载顺序  
  1. file:./config 意思是指的是项目根路径下的config文件夹下的配置文件,application.properties  
  2. file:./  意思是指的是项目根路径下的配置文件  
  3. classpath:/config/  意思是指的是classpath下的config文件夹下的配置文件  
  4. classpath:./ 意思是指的是classpath下的配置文件  
  springboot 会从这四个位置全部加载配置文件，互补配置。其中属性相同的配置文件会被高优先级的覆盖掉
  可以在项目打包的时候指定要加载的配置文件路径，运行如下命令：java -jar xx.jar --spring.config.location=xxx  
