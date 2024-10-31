package com.thucphamxanh.GreenFood.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePageClientController {

    @GetMapping("/client")
    public String getMethodName() {
        return "client/homepage/index";
    }

}
