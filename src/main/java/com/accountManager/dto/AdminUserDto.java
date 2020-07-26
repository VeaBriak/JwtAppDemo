package com.accountManager.dto;

import com.accountManager.model.Status;
import com.accountManager.model.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdminUserDto {
    private Long id;
    private String username;
    private String login;
    private String gender;
    private int age;
    private String status;

    public User toUser() {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setLogin(login);
        user.setGender(gender);
        user.setAge(age);
        user.setStatus(Status.valueOf(status));
        return user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static AdminUserDto fromUser(User user) {
        AdminUserDto adminUserDto = new AdminUserDto();
        adminUserDto.setId(user.getId());
        adminUserDto.setUsername(user.getUsername());
        adminUserDto.setLogin(user.getLogin());
        adminUserDto.setGender(user.getGender());
        adminUserDto.setAge(user.getAge());
        adminUserDto.setStatus(user.getStatus().name());
        return adminUserDto;
    }
}
