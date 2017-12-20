package com.shuidian.controller;

import com.shuidian.model.Admins;
import com.shuidian.service.AdminsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/admin")
public class AdminsController {
    @Autowired
    private AdminsService adminsService;

    @RequestMapping("/confirm")
    @ResponseBody
    public Admins adminConfirm(@RequestParam("username") String username, @RequestParam("password") String password){
        return adminsService.adminConfirm(username,password);
    }


}
