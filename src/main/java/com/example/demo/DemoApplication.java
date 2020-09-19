package com.example.demo;

import com.mysql.cj.jdbc.ClientPreparedStatement;
import com.mysql.cj.jdbc.JdbcConnection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.PreparedStatement;

@EnableTransactionManagement
@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Transactional(rollbackFor = {Exception.class})
    public Model updateOneRecord(Model responseModel) {
        JdbcConnection connection = null;
        PreparedStatement statement = null;
        try (ClientPreparedStatement clientPreparedStatement = new ClientPreparedStatement(connection, "", "")) {
            int result = clientPreparedStatement.executeUpdate();
        } catch (Exception ex) {

        }

        return responseModel;
    }


    @RequestMapping(value = "/test",params = {"username=ygq"})
    public String test(@RequestParam(defaultValue = "余广清") String username,
                       @RequestParam(defaultValue = "18") Integer age) {


        return username + "-" + age;
    }
}


@Configuration
class  CloseSecuritySetting extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().permitAll().and().logout().permitAll();
    }
}
