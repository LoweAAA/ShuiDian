package com.shuidian.controller;


import com.shuidian.model.Admins;
import com.shuidian.model.Users;
import com.shuidian.service.AdminsService;
import com.shuidian.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/confirm")
    @ResponseBody
    public Users userConfirm(@RequestParam("username") String username, @RequestParam("password") String password){
        return usersService.userConfirm(username,password);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(@RequestParam("id") Integer id){
        try{
            usersService.deleteByid(id);
            return "success";
        }catch (Exception e){
            return "fail";
        }
    }

}
