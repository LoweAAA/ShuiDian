$(document).ready(function(){
	console.log("search js加载");
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
            $("#tb").append("<tr>\n" +
                "            <td>"+jn["roomId"]+"</td>\n" +
                "            <td>"+jn["studentId"]+"</td>\n" +
                "            <td>"+jn["name"]+"</td>\n" +
                "            <td>"+jn["waterCost"]+"</td>\n" +
                "            <td>"+jn["eCost"]+"</td>\n" +
                "            <td>"+jn["waterMoney"]+"</td>\n" +
                "            <td>"+jn["emoney"]+"</td>\n" +
                "        </tr>");
            console.log(jn["roomId"]);
            /*$(".state:eq("+i+")").text("2523");*/
        });
}
function clearTable(){
    $("#loding").remove();
    $("#tb").empty();
    $("#tb").append("<thead>"+"<tr>\n" +
        "            <th>寝室号</th>\n" +
        "            <th>学号</th>\n" +
        "            <th>姓名</th>\n" +
        "            <th>用水量</th>\n" +
        "            <th>用电量</th>\n" +
        "            <th>水费</th>\n" +
        "            <th>电费</th>\n" +
        "        </tr>"+"</thead>");
}