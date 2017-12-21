$(document).ready(function(){
    console.log("true-update js加载");
    $("#confirm").click(function(){
        $.ajax({
        type: "GET",
        data:{"id":getUrlParam('id'),"time":$("#monthly").val(),"roomId":$("#dormid").val(),"studentId":$("#sid").val(),"name":$("#sname").val(),"waterCost":$("#water").val(),"eCost":$("#power").val(),"waterMoney":$("#water-account").val(),"emoney":$("#power-account").val()},
        url: "/Shuidian/account/update",
        success: function(data){
            
            console.log(data);
            window.location.href="/Shuidian/upadte-page.html";
        },
        error: function(){
            // $("#logininfo").text("请求超时");
            console.log("fail");
            alert("删除失败");
        },
    });
    });
    
});
function getUrlParam(name) {
      var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
      var r = window.location.search.substr(1).match(reg); //匹配目标参数
      if (r != null) return unescape(r[2]); return null; //返回参数值
    }