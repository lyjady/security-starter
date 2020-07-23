package org.augutus.demo.dto;

import com.fasterxml.jackson.annotation.JsonView;

import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.StringJoiner;

/**
 * @author LinYongJin
 * @date 2020/7/23 14:59
 */
public class UserDto {

    public interface SimpleUserView {};

    public interface DetailUserView extends SimpleUserView {};

    private Long id;

    @NotEmpty(message = "用户名不能为空")
    private String username;

    @NotEmpty(message = "用户密码不能为空")
    private String password;

    private Date createTime;

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

    public Long getId() {
        return id;
    }

    public UserDto setId(Long id) {
        this.id = id;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UserDto setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserDto.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("username='" + username + "'")
                .add("password='" + password + "'")
                .add("createTime=" + createTime)
                .toString();
    }
}
