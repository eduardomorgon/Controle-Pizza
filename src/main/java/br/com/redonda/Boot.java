/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.redonda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author eduardo
 */
@SpringBootApplication
@Controller
public class Boot {
    
    public static void main(String[] args) {
        SpringApplication.run(Boot.class, args);
    }
    
    @RequestMapping("/")
//    @ResponseBody
    public String teste () {
        return "home";
    }
            
}
