package com.tienda.backend_tienda.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuth2LoginController {

    @GetMapping("/loginSuccess")
    public String getLoginInfo(Authentication authentication) {
        OAuth2User oauth2User = (OAuth2User) authentication.getPrincipal();
        return "Login successful: " + oauth2User.getAttributes();
    }

    @GetMapping("/loginFailure")
    public String loginFailure() {
        return "Login failed";
    }
}
