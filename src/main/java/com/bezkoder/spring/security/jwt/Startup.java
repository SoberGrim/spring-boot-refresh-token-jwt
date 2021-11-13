package com.bezkoder.spring.security.jwt;

import com.bezkoder.spring.security.jwt.repository.RoleRepository;
import com.bezkoder.spring.security.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class Startup {

    UserRepository service;
    RoleRepository roleService;


    @Autowired
    public void setService(UserRepository service, RoleRepository roleService) {
        this.service = service;
        this.roleService = roleService;
    }

    private static String randomLogin() {
        List<String> logins = new ArrayList<>(Arrays.asList
                ("sam", "cole", "wood", "brick", "car", "rock", "bed", "owl", "rain", "white", "black","sky","tree","cat","dog","bird"));
        int i = ThreadLocalRandom.current().nextInt(1, logins.size());
        int i2 = ThreadLocalRandom.current().nextInt(1, logins.size());
        return logins.get(i) + logins.get(i2) + i2 * i;
    }

    private static String randomPassword() {
        List<String> passwords = new ArrayList<>(Arrays.asList
                ("123", "456", "@", "!", "999", "777", "555", "qwe", "rty", "zxc", "asd", "#", "$","11","22"));
        int i = ThreadLocalRandom.current().nextInt(0, passwords.size());
        int i2 = ThreadLocalRandom.current().nextInt(0, passwords.size());
        int i3 = ThreadLocalRandom.current().nextInt(0, passwords.size());
        return passwords.get(i) + passwords.get(i2) + passwords.get(i3) + i2 * i;
    }

    private static String randomName() {
        List<String> names = new ArrayList<>(Arrays.asList
                ("Alexander", "Michael", "Lex", "Sandy", "Roderick", "Bob", "Rick", "Zak", "Robin", "Andy", "Stephen", "Stanley", "Dylan", "Fred", "Thomas","Alan","Александр","Михаил","Дмитрий","Владислав","Владмимр","Иван"));
        int i = ThreadLocalRandom.current().nextInt(0, names.size());
        return names.get(i);
    }

    private static String randomLastname() {
        List<String> names = new ArrayList<>(Arrays.asList
                ("Addison", "Black", "White", "Jonson", "Jenkins", "Meyers", "Winslet", "Shades", "Queens", "Abigale", "Dallas", "Rodgers","Stanley", "Cooper","Williams","Prescott","Иванов","Сидоров","Петров"));
        int i = ThreadLocalRandom.current().nextInt(0, names.size());
        return names.get(i);
    }

    private static String randomDomain() {
        List<String> names = new ArrayList<>(Arrays.asList
                ("bk.ru", "mail.ru", "gmail.com", "msn.com", "hotmail.com", "yandex.ru", "yahoo.com","email.com"));
        int i = ThreadLocalRandom.current().nextInt(1, names.size());
        return names.get(i);
    }

    private static int randomAge() {
        return ThreadLocalRandom.current().nextInt(18, 65);
    }

    @Bean
    public void init() {
        System.out.println("Startup initializing");



    }
}