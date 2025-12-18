package org.Spring2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name = {"first", "desktop1","beast"})
    @Scope("prototype")
    public Desktop desktop(Computer com){
        Desktop desktop = new Desktop();
        desktop.age = 12;
        desktop.com = com;
        return desktop;
    }
    @Bean
    @Scope("prototype")
    public Laptop laptop(){
        return new Laptop();
    }
}
