package org.augustus.browser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinYongJin
 * @date 2020/7/31 15:22
 */
@RestController
public class SecurityController {

    @GetMapping("/security")
    public String security() {
        return "success";
    }
}
