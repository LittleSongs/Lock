
/*点击弹出按钮*/
function popBox() {
    var popBox = document.getElementById("popBox");
    var popLayer = document.getElementById("popLayer");
    popBox.style.display = "block";
    popLayer.style.display = "block";
    $("#timeX").hide();
    $("#numberX").hide();
};

/*点击关闭按钮*/
function closeBox() {
    var popBox = document.getElementById("popBox");
    var popLayer = document.getElementById("popLayer");
    popBox.style.display = "none";
    popLayer.style.display = "none";
}

function radio1(a){
    if(a==1)
    {
        $("#numberX").hide();
        $("#timeX").show();
    }else if(a==2)
    {
        $("#timeX").hide();
        $("#numberX").show();
    }
}


$(function() {
    console.log("hah");
    // 自定义类型：参数为数组，可多条数据
   // alignmentFns.createType([{"test": {"step" : 1, "min" : 10, "max" : 999, "digit" : 0}}]);
   //  var a={"step":1, "min": 0, "max" : 99, "digit" : 0};

    // 初始化
    alignmentFns.initialize();

    //新建密码
    $(document).on("click",".gb",function() {

        //ajax

        closeBox();
    })

})