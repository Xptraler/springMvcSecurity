package ru.javamentor.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.javamentor.dao.UserDao;
import ru.javamentor.dao.UserDaoImpl;
import ru.javamentor.service.UserService;
import ru.javamentor.service.UserServiceImpl;

@Configuration
@ComponentScan(value = "ru.javamentor")
public class SpringConfig {

    @Bean
    public UserService userServiceBean()
    {
        return new UserServiceImpl(new UserDaoImpl());
    }



}
