package com.fans.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * boot工程格式如下
 *
 * http://${ip}:{port}/swagger-ui.html
 * 非boot工程加个自己项目名
 * http://${ip}:{port}/xxx/swagger-ui.html
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(new ApiInfoBuilder().build()).select()
                .apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
    }
}
