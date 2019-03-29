/*点击弹出按钮*/
function glypopBox() {
    var popBox = document.getElementById("glygl");
    var popLayer1 = document.getElementById("popLayer1");
    popLayer1.style.display = "block";
    console.log(popLayer1)
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
    var popLayer1 = document.getElementById("popLayer1");
    popLayer1.style.display = "block";
    zsfjtc.style.display = "block";


};

/*点击关闭增删房间*/
function zsfjcloseBox() {
    var zsfjtc = document.getElementById("zsfjtc");
    var popLayer1 = document.getElementById("popLayer1");
    zsfjtc.style.display = "none";
    popLayer1.style.display = "none";
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



$(function() {

    //新建密码
    $(document).on("click",".gb",function() {

        //ajax

        closeBox();
    })

})