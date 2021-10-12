#### Create discovery-service

```
http https://start.spring.io/starter.zip  javaVersion==11 artifactId==eureka-service name==eureka-service baseDir==eureka-service bootVersion==2.3.10.RELEASE dependencies==cloud-eureka-server | tar -xzvf -
```

#### Create cars-service

```
http https://start.spring.io/starter.zip javaVersion==11 artifactId==car-service name==car-service baseDir==car-service bootVersion==2.3.10.RELEASE dependencies==actuator,cloud-eureka,data-jpa,cloud-feign,data-rest,web,devtools,lombok | tar -xzvf -
```

#### Create api-service
```
http https://start.spring.io/starter.zip javaVersion==11 artifactId==api-gateway name==api-gateway baseDir==api-gateway bootVersion==2.3.10.RELEASE dependencies==actuator,cloud-eureka,cloud-resilience4j,cloud-feign,data-rest,web,devtools,lombok | tar -xzvf -
```


#### database 

```
create database dev;
create user 'springuser'@'%' identified by 'ThePassword';
grant all on dev.* to 'springuser'@'%';

create table car(
   id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(100) NOT NULL,
   created_timestamp TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   update_timestamp TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   is_deleted BIT,
   PRIMARY KEY ( id )
);

```

