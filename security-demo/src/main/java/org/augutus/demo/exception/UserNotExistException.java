package org.augutus.demo.exception;

/**
 * @author LinYongJin
 * @date 2020/7/28 10:05
 */
public class UserNotExistException extends RuntimeException {

    private Long id;

    public UserNotExistException(Long id) {
        super("编号为: " + id + "的用户不存在");
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
