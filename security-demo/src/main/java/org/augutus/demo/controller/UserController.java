package org.augutus.demo.controller;

import com.fasterxml.jackson.annotation.JsonView;
import org.augutus.demo.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author LinYongJin
 * @date 2020/7/23 14:38
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    @JsonView(UserDto.SimpleUserView.class)
    public List<UserDto> findAll() {
        return Stream.of(new UserDto("Jack", "123456"),
                new UserDto("Sam", "123456"),
                new UserDto("Rose", "123456")).collect(Collectors.toList());
    }

    @GetMapping("/{userId:\\d+}")
    @JsonView(UserDto.DetailUserView.class)
    public UserDto findById(@PathVariable Long userId) {
        return new UserDto("Sam", "123456");
    }
}
