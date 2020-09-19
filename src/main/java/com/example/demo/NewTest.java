package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class NewTest {

    public static void main(String[] args) {

//        Boolean testInt = new Boolean(false);
//        Boolean re = changeInt(testInt);
//        System.out.println(testInt);
//
//        UserInfo info = new UserInfo();
//        info.setUsername("123");
//        info.setPassword("123456");
//        changeUser(info);
//        System.out.println(info);

        long startTime = System.currentTimeMillis();
        long startNum = 0;
        long endNum = 1000000000000l;
//        for (int j = 0; j < 10000;j++){
//            for (int k = 0; k < 10000;k++){
//                for (int l = 0; l < 10000;l++){
//                    startNum++;
//                }
//            }
//        }
//        while (startNum < endNum) {
//            startNum++;
//        }
//
//        long stopTime = System.currentTimeMillis();
//        System.out.println(startNum);
//        System.out.println(stopTime + "-" + startTime);
//        System.out.println(stopTime - startTime);

        List<String> names = Arrays.asList("1", "2", "3");
        List<String> keys = Arrays.asList("2", "3");
        boolean result = names.stream().anyMatch(name -> keys.contains(name));
        System.out.println(result);

        List<String> list = Arrays.asList(names.toString().replace("[", "")
                .replace("]", "").split(","));
        System.out.println(list.size());


    }

//    static Boolean changeInt(Boolean input) {
//        input = true;
//        return input;
//    }
//
//    static UserInfo changeUser(UserInfo userInfo) {
//        userInfo.setUsername("ygq");
//        userInfo.setPassword("ygq123");
//        return userInfo;
//    }


}


class UserInfo {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}