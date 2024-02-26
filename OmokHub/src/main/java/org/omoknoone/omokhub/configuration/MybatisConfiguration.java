package org.omoknoone.omokhub.configuration;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "org.omoknoone.omokhub.joinwaitingmember.query.repository", annotationClass = Mapper.class)
public class MybatisConfiguration {
}
