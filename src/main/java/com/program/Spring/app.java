package com.program.Spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
    public static void main(String []args){
        ApplicationContext factory = new AnnotationConfigApplicationContext(app_config.class);
        Livro livro = factory.getBean(Livro.class);
        autor a = factory.getBean(autor.class);
        a.setNome("robin hood");
        livro.setNome("as aventuras de pi");
        livro.setCodigo("Dkw");
        livro.exibir();
    }
}
