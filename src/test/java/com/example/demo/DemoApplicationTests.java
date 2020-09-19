package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        String person = "me";
        useStr(person);
        System.out.println(person);
        System.out.println(useChStr(person));

        UserInfo userInfo = new UserInfo();
        userInfo.setName("ygq");
        changeUser(userInfo);
        System.out.println(userInfo.toString());
    }


    private void useStr(String demo) {
        demo = "ygq";
    }

    private String useChStr(String demo) {
        demo = "ygq";
        return demo;
    }

    private void changeUser(UserInfo userInfo) {
        userInfo.setName("999");
    }

    public class UserInfo {
        private int age;
        private String name;

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "UserInfo{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

}
