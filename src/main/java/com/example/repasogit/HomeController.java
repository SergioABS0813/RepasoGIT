package com.example.repasogit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/index"})
    public String index(){
        return "index";
    }

    @GetMapping(value = {"/agregarEmpleado"})
    public String agregarEmpleado(){
        return "agregarEmpleado";
    }


}
