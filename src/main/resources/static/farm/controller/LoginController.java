package com.example.farm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/Layout/loginPage")
    public String loginPage() {
        return "Layout/loginPage";  // templates/Layout/loginPage.html
    }

    @GetMapping({"/Layout/findId", "/Layout/FindId"})
    public String findIdPage() {
        return "Layout/findId";
    }

    @GetMapping({"/Layout/findPw", "/Layout/FindPw"})
    public String findPwPage() {
        return "Layout/findPw";
    }

    @GetMapping("/Layout/findIdResult")
    public String findIdResultPage(@RequestParam String userId, Model model) {
        model.addAttribute("userId", userId);
        return "Layout/findIdResult";
    }

    @GetMapping("/Layout/resetPw")
    public String resetPwPage() {
        return "Layout/resetPw";  // templates/Layout/resetPw.html
    }

    @GetMapping("/Layout/register")
    public String registerPage() {
        return "Layout/register";
    }

    @GetMapping("/Layout/mainpageLayout")
    public String mainpageLayout() {
        return "Layout/MainpageLayout"; // 파일명과 대소문자 정확히 맞추기
    }
}
