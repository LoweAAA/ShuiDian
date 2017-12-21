package com.shuidian.controller;

import com.shuidian.model.Account;
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

    @RequestMapping("/getall")
    @ResponseBody
    public List getByUserId(){
        return accountService.getAccounts();
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

    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestParam("time") String time,@RequestParam("roomId") String roomId,@RequestParam("studentId") Integer studentId,@RequestParam("name") String name,@RequestParam("waterCost") String waterCost,@RequestParam("eCost") String eCost,@RequestParam("waterMoney") Double waterMoney,@RequestParam("emoney") Double emoney){
        Account account=new Account();

            account.setTime(time);
            account.setRoomId(roomId);
            account.setStudentId(studentId);
            account.setName(name);
            account.setWaterCost(waterCost);
            account.seteCost(eCost);
            account.setWaterMoney(waterMoney);
            account.setEmoney(emoney);
            accountService.add(account);
            return "add success";

    }
    @RequestMapping("/getbytandr")
    @ResponseBody
    public List getByTandR(@RequestParam("time") String time,@RequestParam("roomId") String roomId){
        return accountService.getByTimeAndRoomId(time,roomId);
    }

    @RequestMapping("/getbytands")
    @ResponseBody
    public List getByTandS(@RequestParam("time") String time,@RequestParam("studentId") Integer studentId){
        return accountService.getByTimeAndStudentId(time,studentId);
    }



    @RequestMapping("/update")
    @ResponseBody
    public String update(@RequestParam("id") Integer id,@RequestParam("time") String time,@RequestParam("roomId") String roomId,@RequestParam("studentId") Integer studentId,@RequestParam("name") String name,@RequestParam("waterCost") String waterCost,@RequestParam("eCost") String eCost,@RequestParam("waterMoney") Double waterMoney,@RequestParam("emoney") Double emoney){
        Account account=new Account();
        account.setId(id);
        account.setTime(time);
        account.setRoomId(roomId);
        account.setStudentId(studentId);
        account.setName(name);
        account.setWaterCost(waterCost);
        account.seteCost(eCost);
        account.setWaterMoney(waterMoney);
        account.setEmoney(emoney);
        accountService.update(account);
        return "add success";

    }
}
