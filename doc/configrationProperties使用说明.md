#  @ConfigurationProperties和@value的使用区别  

+ @ConfigurationPropertries  
  1. 支持从配置文件中的属性批量注入  
  2. 支持属性的松散绑定  
  3. 不支持SpEL语法
  4. 支持jsr303数据校验  
+ @Value  
  1. 必须一个一个指定  
  2. 不支持属性的松散绑定  
  3. 支持SpEL语法
  4. 不支持jsr303数据校验