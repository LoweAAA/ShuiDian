$(document).ready(function(){
	console.log("update js加载");
	$.ajax({
		type: "GET",
		url: "/Shuidian/account/getall",
		dataType: "json",
		success: function(data){
            
            console.log(data);
            clearTable();
            setToTable(data);
        },
        error: function(){
            // $("#logininfo").text("请求超时");
            console.log("fail");
            $("#loding").text("数据获取失败。");
        },
    });
});
function setToTable(data){
    $.each(data,function(ji,jn){
            /*if(jn["zserver"].indexOf($(zn).text())>=0&&$(zn).text()!=""){

                if(jn["state"]==0){
                    ss="维护";
                    $(".state:eq("+zi+")").css("color","red");
                }else{
                    ss="正常";
                    $(".state:eq("+zi+")").css("color","green");
                }   
                $(".state:eq("+zi+")").text(ss);
            }*/
            $("#tb").append("<tr class=\"content-white\">\n" +
                "            <td>"+jn["time"]+"</td>\n" +
                "            <td>"+jn["roomId"]+"</td>\n" +
                "            <td>"+jn["studentId"]+"</td>\n" +
                "            <td>"+jn["name"]+"</td>\n" +
                "            <td>"+jn["waterCost"]+"</td>\n" +
                "            <td>"+jn["eCost"]+"</td>\n" +
                "            <td>"+jn["waterMoney"]+"</td>\n" +
                "            <td>"+jn["emoney"]+"</td>\n" +
                "            <td>\n" +
                "                <a class=\"up\" style=\"color: darkred\">修改<div style=\"display: none;\">"+jn["id"]+"</div></a>\n" +
                "            </td>\n" +
                "        </tr>");
            console.log(jn["roomId"]);
            /*$(".state:eq("+i+")").text("2523");*/
        });
}
function clearTable(){
    $("#loding").remove();
    $("#tb").empty();
    $("#tb").append("<tr class=\"content\" >\n" +
        "            <th>时间</th>\n" +
        "            <th>寝室号</th>\n" +
        "            <th>学号</th>\n" +
        "            <th>姓名</th>\n" +
        "            <th>用水量</th>\n" +
        "            <th>用电量</th>\n" +
        "            <th>水费</th>\n" +
        "            <th>电费</th>\n" +
        "            <th>修改</th>\n" +
        "        </tr>");
}
$("table").delegate(".up","click",function(){
  dId=$(this).children("div").text();
  console.log(dId);
  window.location.href="true-update.html"+"?id="+dId;
  // $.ajax({
  //       type: "GET",
  //       data:{"id":dId},
  //       url: "/Shuidian/account/delete",
  //       success: function(data){
  //           console.log(data);
  //           window.location.href="/Shuidian/delete-page.html";
  //       },
  //       error: function(){
  //           // $("#logininfo").text("请求超时");
  //           console.log("fail");
  //           alert("fail");
  //       },
  //   });
});