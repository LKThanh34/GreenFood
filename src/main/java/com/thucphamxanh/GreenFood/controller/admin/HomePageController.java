package com.thucphamxanh.GreenFood.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
    @GetMapping("/admin")
    public String admin() {
        return "admin/dashboard/index";
    }
}
