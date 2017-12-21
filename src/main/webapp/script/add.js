$(document).ready(function(){
	console.log("add js加载");
    $("#add-button").click(function(){
        $.ajax({
        type: "GET",
        data:{"time":$("#monthly").val(),"roomId":$("#dormid").val(),"studentId":$("#sid").val(),"name":$("#sname").val(),"waterCost":$("#water").val(),"eCost":$("#power").val(),"waterMoney":$("#water-account").val(),"emoney":$("#power-account").val()},
        url: "/Shuidian/account/add",
        success: function(data){
            
            console.log(data);
            window.location.href="/Shuidian/upadte-page.html";
        },
        error: function(){
            // $("#logininfo").text("请求超时");
            console.log("fail");
            alert("添加失败");
        },
    });
    });
	
});