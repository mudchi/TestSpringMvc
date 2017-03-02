/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jesydev.ex02.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Administrator
 */

@Controller
public class MyFirstController {
    @RequestMapping("test.htm")
    public  ModelAndView myAction(){
    
    return new ModelAndView("index","myModel","เทสโว้ยกุลอง");
    }
    
     @RequestMapping("test1.php")
    public String index(){
    return "test1";
    }
}
