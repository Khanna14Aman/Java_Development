package org.Spring2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name = {"first", "desktop1","beast"})
    @Scope("prototype")
    public Desktop desktop(Computer com){  // Inside parenthesis we can use @Qualifier("laptop") annotation to select the class object for Computer interface, this annotation have higher priority than @Primary annotation.
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

    @Bean
    @Scope("prototype")
    @Primary
    public Tablet tablet(){ return new Tablet();}
}
