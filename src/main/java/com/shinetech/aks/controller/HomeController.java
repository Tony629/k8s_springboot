package com.shinetech.aks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

/**
 * @author Tony Zhang
 **/
@RestController
public class HomeController {

    @GetMapping("/version")
    public String version() throws Exception {
        return "20240515[===" + InetAddress.getLocalHost().getHostName() + "===]";
    }
}
