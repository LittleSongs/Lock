
//删除人员卡
function jian(id){
    console.log(id)
    console.log($('#'+id+'').text());
    var ke= $('#'+id+'').parent();
    console.log(ke.text());
    ke.remove();
}

$(function() {
    var idd=1;
    //增加人员卡
    $(document).on("click","#jia",function() {
        console.log("laile")
        console.log(idd)
        var tet="<div id=\"\" class=\"message31 ke\">\n" +
            "<div id=\"a"+idd+"\" onclick=\"jian(this.id)\" class=\"iconfont sc\">&#xe613;</div> " +
            "<label>姓名：</label><input  name=\"name1\" class=\"form-control\" type=\"text\" >\n" +
            "                                    <br/>\n" +
            "                                    <br/>\n" +
            "                                    <label>性别：</label><input id=\"sex"+idd+"\"  name=\"sex"+idd+"\" class=\"form-control\" type=\"text\" >\n" +
            "                                    <br/>\n" +
            "                                    <br/>\n" +
            "                                    <label>手机号：</label><input id=\"sex"+idd+"\"  name=\"phone"+idd+"\" class=\"form-control\" type=\"text\" >\n" +
            "                                    <br/><br/>\n" +
            "                                    <label>入住时间：</label><input id=\"sex"+idd+"\"  name=\"time"+idd+"\" class=\"form-control\" type=\"text\" >\n" +
            "                                    <br/>\n" +
            "                                    <br/>\n" +
            "                                    <label>身份证号：</label><input id=\"sex"+idd+"\"  name=\"sfz"+idd+"\" class=\"form-control\" type=\"text\">\n" +
            "\n" +
            "                                </div>";
        $("#order").before(tet);
        idd=idd+1;
    })

    // $(document).on("click", "#bt-login", function () {
    //     var content = $.trim($('#content').val());
    //     var password = $.trim($('#password').val());
    //
    //     var jsona = {};
    //     jsona["username"] = content;
    //     jsona["password"] = password;
    //         $.ajax({
    //             url: './cbec/loginverify',
    //             type: 'POST',
    //             dataType: 'json',
    //             data: jsona,
    //             async: true,
    //             success:function(data){
    //                 console.log(data);
    //                 if(data["code"]!=10)
    //                 {
    //                     console.log("登录失败")
    //                     var tet=data["msg"]
    //                     $("#err_m").empty();
    //                     $("#err_m").append(tet);
    //                 }else
    //                 {
    //                     window.location.replace("./cbec/index");
    //                 }
    //             },
    //             function(){
    //                 console.log("错误");
    //             }
    //         });
    //  })

})