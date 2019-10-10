package hello;

import io.undertow.UndertowOptions;
import org.springframework.boot.web.embedded.undertow.UndertowBuilderCustomizer;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UndertowConfiguration {

    @Bean
    public UndertowServletWebServerFactory undertowServletWebServerFactory() {
        UndertowServletWebServerFactory factory = new UndertowServletWebServerFactory(9090);

        factory.addBuilderCustomizers((UndertowBuilderCustomizer) builder -> {
            builder.setServerOption(UndertowOptions.MAX_ENTITY_SIZE, 100L);
        });

        return factory;
    }
}
