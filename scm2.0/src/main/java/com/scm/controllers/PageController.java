package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //A Java Controller is a component in a Java web application that receives requests from the user/browser, processes them, and decides what response should be returned.
public class PageController {

    @RequestMapping("/home")
    public String home(Model model)
    {
        System.out.println("Home page handler");
        //sendind data to view
        model.addAttribute("name", "Substring Technologies");// by adding the attributes here we can send data from controller to our templete
        model.addAttribute("YoutubeChannel", "Akku blogs");
        model.addAttribute("GithubRepo", "https://github.com/jenaakankshya72");
        return "home";
    }
}
