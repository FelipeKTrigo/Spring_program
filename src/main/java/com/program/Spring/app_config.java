package com.program.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class app_config {

    @Bean
    public Livro getLivro(){
        return new Livro();
    }

    @Bean
    public AutorLivro getAutorLivro(){
        return new autor();
    }
}
