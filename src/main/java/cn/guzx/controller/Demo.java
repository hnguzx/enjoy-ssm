package cn.guzx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test_demo")
public class Demo {

    @RequestMapping("/first")
    public @ResponseBody
    main.java.cn.guzx.model.TestDemo first(){
        System.out.println("进入该方法");
        return null;
    }
}
