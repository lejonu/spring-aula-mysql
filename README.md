# Springboot

Arquivo [pom.xml](./pom.xml) com:

- JPA
- MySQL

Arquivo de configuração application.properties

```txt
spring.datasource.url= jdbc:mysql://localhost:3306/spring_mysql

spring.datasource.username=leonardo
spring.datasource.password=leonardo

# mapeamento de entidade e colunas automaticamente na base de dados
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
```
