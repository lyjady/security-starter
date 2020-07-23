package org.augutus.demo.dto;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.StringJoiner;

/**
 * @author LinYongJin
 * @date 2020/7/23 14:59
 */
public class UserDto {

    public interface SimpleUserView {};

    public interface DetailUserView extends SimpleUserView {};

    private String username;

    private String password;

    public UserDto() {
    }

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @JsonView(SimpleUserView.class)
    public String getUsername() {
        return username;
    }

    public UserDto setUsername(String username) {
        this.username = username;
        return this;
    }

    @JsonView(DetailUserView.class)
    public String getPassword() {
        return password;
    }

    public UserDto setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserDto.class.getSimpleName() + "[", "]")
                .add("username='" + username + "'")
                .add("password='" + password + "'")
                .toString();
    }
}
