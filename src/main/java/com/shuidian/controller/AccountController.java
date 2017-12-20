package com.shuidian.controller;

import com.shuidian.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/getbyuserid")
    @ResponseBody
    public List getByUserId(@RequestParam("userid") Integer userId){
        return accountService.getAccountsByUserId(userId);
    }


    @RequestMapping("/getbyuseridandtime")
    @ResponseBody
    public List getByUserId(@RequestParam("userid") Integer userId,@RequestParam("time") String time){
        return accountService.getAccountsByUserIdTime(userId,time);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(@RequestParam("id") Integer id){
        try{
            accountService.delete(id);
            return "success";
        }catch (Exception e){
            return "fail";
        }
    }

}
