$(function() {

    $(document).on("click", "#bt-login", function () {
        var content = $.trim($('#content').val());
        var password = $.trim($('#password').val());

        var jsona = {};
        jsona["username"] = content;
        jsona["password"] = password;
            $.ajax({
                url: './lock/loginverify',
                type: 'POST',
                dataType: 'json',
                data: jsona,
                async: true,
                success:function(data){
                    console.log(data);
                    if(data["code"]!=10)
                    {
                        console.log("登录失败")
                        var tet=data["msg"]
                        $("#err_m").empty();
                        $("#err_m").append(tet);
                    }else
                    {
                        window.location.replace("./lock/index");
                    }
                },
                function(){
                    console.log("错误");
                }
            });
     })

})