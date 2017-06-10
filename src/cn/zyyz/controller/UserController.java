package cn.zyyz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.zyyz.model.User;
import cn.zyyz.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService mUserService;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String list(Model model) {
        List<User> userList = mUserService.findAll();
        model.addAttribute("list", userList);
        return "list";
    }
}