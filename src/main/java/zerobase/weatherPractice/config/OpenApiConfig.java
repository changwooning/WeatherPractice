package zerobase.weatherPractice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("날씨 일기 프로젝트")
                        .description("날씨 일기를 CRUD 할 수 있는 벡엔드 API 입니다.")
                        .version("1.0") );
    }
}
