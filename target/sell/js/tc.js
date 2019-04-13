/*点击弹出按钮*/
function glypopBox() {
    var popBox = document.getElementById("glygl");
    var popLayer1 = document.getElementById("popLayer1");
    popLayer1.style.display = "block";
    popBox.style.display = "block";


};

/*点击关闭按钮*/
function glycloseBox() {
    var popBox = document.getElementById("glygl");
    var popLayer1 = document.getElementById("popLayer1");
    popBox.style.display = "none";
    popLayer1.style.display = "none";
}


/*点击弹出增删房间*/
function zsfjpopBox() {
    var zsfjtc = document.getElementById("zsfjtc");
    var popLayer2 = document.getElementById("popLayer2");
    popLayer2.style.display = "block";
    zsfjtc.style.display = "block";


};

/*点击关闭增删房间*/
function zsfjcloseBox() {
    var zsfjtc = document.getElementById("zsfjtc");
    var popLayer2 = document.getElementById("popLayer2");
    zsfjtc.style.display = "none";
    popLayer2.style.display = "none";
}

/*点击弹出修改租金*/
function xgzjpopBox() {
    console.log("弹出")
    var popBox = document.getElementById("xgzjtc");
    var popLayer = document.getElementById("popLayer");
    popBox.style.display = "block";
    popLayer.style.display = "block";

};

/*点击关闭修改租金*/
function xgzjcloseBox() {
    zjzy()
    var popBox = document.getElementById("xgzjtc");
    var popLayer = document.getElementById("popLayer");
    popBox.style.display = "none";
    popLayer.style.display = "none";
}
// 修改租金
function zjzy() {
    var zj=$("#zjinput").val();
    console.log(zj)
    $("#zzj").text(zj);

}

/*点击弹出新建管理员按钮*/
function xjglypopBox() {
    console.log("弹出")
    glycloseBox();
    var xjglypopBox = document.getElementById("xjglypopBox");
    var popLayer2 = document.getElementById("popLayer2");
    xjglypopBox.style.display = "block";
    popLayer2.style.display = "block";

};

/*点击关闭按钮*/
function xjglycloseBox() {

    var xjglypopBox = document.getElementById("xjglypopBox");
    var popLayer2 = document.getElementById("popLayer2");
    xjglypopBox.style.display = "none";
    popLayer2.style.display = "none";
    console.log("关闭新建管理员弹窗")
    glypopBox();
}

$(function() {

    //新建密码
    $(document).on("click",".gb",function() {

        //ajax

        closeBox();
    })

})