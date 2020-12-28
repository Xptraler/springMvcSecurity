package web.config;

import dao.UserDao;
import dao.UserDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.UserService;
import service.UserServiceImpl;
import web.controllers.UserController;

@Configuration
@ComponentScan(value = "java")
public class SpringConfig {

    @Bean
    public UserService userServiceBean() {
        return new UserServiceImpl();
    }



}
