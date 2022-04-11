package com.deenn.springmvc.controllers;

import com.deenn.springmvc.dtos.LoginDto;
import com.deenn.springmvc.entity.Member;
import com.deenn.springmvc.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    private final MemberService memberService;

    @Autowired
    public LoginController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("loginDto", new LoginDto());
        return "login";
    }

    @PostMapping("/login")
    public String login (@ModelAttribute("loginDto") LoginDto loginDto, HttpSession session) {
        Member member = memberService.login(loginDto);
        if (member != null) {
            session.setAttribute("member",member);
            return "redirect:/home";
        }
        return "redirect:/";
    }


}
