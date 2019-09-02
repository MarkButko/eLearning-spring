package butko.marko;


import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@EnableWebMvc
@ComponentScan
//@Configuration
public class ApplicationConfiguration {
    
    @Bean
    public FreeMarkerViewResolver freemarkerViewResolver() {
        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
        resolver.setCache(true);
        resolver.setPrefix("/view/");
        resolver.setSuffix(".ftl");
        return resolver;
    }

    @Bean
    public FreeMarkerConfigurer freemarkerConfig(Properties freemarkerProperties) throws TemplateException {
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        Configuration configuration = new Configuration();
        configuration.setSettings(freemarkerProperties);
        return freeMarkerConfigurer;
    }
    
    @Bean 
    public Properties freemarkerProperties() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("/properties/freemarker.properties"));
        return properties;
    }
}
