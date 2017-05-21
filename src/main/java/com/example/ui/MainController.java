package com.example.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/5/21 0021.
 */
@RestController
public class MainController {

    //处理外部交互
    @RequestMapping(value = "/transfer",method = RequestMethod.POST)
    public String test1(@RequestParam(value = "from") String from, @RequestParam String to, @RequestParam int amount) {
        return "transfer from " + from + " to " + to + " " + amount + "!";
    }
}
