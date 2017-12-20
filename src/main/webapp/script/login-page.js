/**
 * Created by wenhaoran1 on 17/9/9.
 */

 var userType;

 function checkLogin(){
    var name = document.getElementById("name").value;
    var pass = document.getElementById("pass").value;

    if(name==""||pass==""){
        alert("用户名或密码不能为空！");
    }
    else{
        if(name=='dtts' && pass == 'dtts123') {
            window.location.href='../delete-page.html';
            return false;       /*解决了之前无法跳转的问题*/
        }
        else{
            alert("用户名或密码错误！");
        }
    }
}
$(document).ready(function(){
    console.log("login js加载");
    $("#login-button").click(function(){
        console.log("login-button");
        confirm();
    });
    /*$(".zserver").each(function(i,n){
        $(".state:eq("+i+")").text("2523");
    });*/
});

function setUserType(){
    if($("#user-type").val()=='admin'){
        userType=0;
        console.log("管理员"+userType);
    }else{
        userType=1;
        console.log("用户"+userType);
    }
}

function confirm(){
    setUserType();
    if(userType==0){
        console.log("000");
        $.ajax({
            type: "GET",
            data:{"username":$("#inputNumber").val(),"password":$("#inputPassword").val()},
            url: "/Shuidian/admin/confirm",
            dataType: "json",
            success: function(data){
            // changeToTable(data);
            console.log(data);
            window.location.href="/Shuidian/upadte-page.html";
        },
        error: function(){
            // $("#logininfo").text("请求超时");
            console.log("fail");
            alert("fail");
        },
    });

    }else if(userType==1){
        console.log("111");
        $.ajax({
            type: "GET",
            data:{"username":$("#inputNumber").val(),"password":$("#inputPassword").val()},
            url: "/Shuidian/user/confirm",
            dataType: "json",
            success: function(data){
            // changeToTable(data);
            console.log(data);
            window.location.href="/Shuidian/user-dormid-search.html";
        },
        error: function(){
            // $("#logininfo").text("请求超时");
            console.log("fail");
            alert("fail");
        },
    });
    }
}
