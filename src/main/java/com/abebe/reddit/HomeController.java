package com.abebe.reddit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    RedditRepository redditRepository;
    @RequestMapping("")
    public  String showForm(Model model){
        model.addAttribute("reddit",redditRepository.findAll());

        return "view";
    }
    @GetMapping("/post")
    public  String postProcess(Model model){
        model.addAttribute("reddit",new Reddit());
        return "postform";
    }
    @PostMapping("/post")
    public  String processForm(Reddit reddit, BindingResult result){
        redditRepository.save(reddit);
        return "redirect:/";
}}

