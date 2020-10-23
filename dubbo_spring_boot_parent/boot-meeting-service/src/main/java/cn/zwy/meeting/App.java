package cn.zwy.meeting;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author mrzhaowy
 * @create 2020-10-20 下午7:16
 **/
@SpringBootApplication(scanBasePackages = "cn.zwy.meeting")
@MapperScan("cn.zwy.meeting.mapper")
@EnableDubbo(scanBasePackages = "cn.zwy.meeting")
public class App implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
