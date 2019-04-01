
/*点击弹出按钮*/
function popBox() {
    console.log("弹出")
    var popBox = document.getElementById("popBox");
    var popLayer = document.getElementById("popLayer");
    popBox.style.display = "block";
    popLayer.style.display = "block";

};

/*点击关闭按钮*/
function closeBox() {
    var popBox = document.getElementById("popBox");
    var popLayer = document.getElementById("popLayer");
    popBox.style.display = "none";
    popLayer.style.display = "none";
}







/*点击弹出按钮*/
function popBox2() {
    console.log("弹出")
    var popBox = document.getElementById("xxxx");
    //var popLayer = document.getElementById("popLayer");
    popBox.style.display = "block";
   // popLayer.style.display = "block";

};

function closeBox2() {
    var popBox = document.getElementById("xxxx");
   // var popLayer = document.getElementById("popLayer");
    popBox.style.display = "none";
   // popLayer.style.display = "none";
}

//删除房间
function fjscjh(id){
    console.log(id)
    var tr="'#"+id+"'"
     $("#"+id+"").remove();

}


$(function() {
    var n=1;
    //弹出
    $(document).on("click",".xiugai",function(){
        var name =$(this).prev().text();

        console.log(name);
        $("#name1").val(name);
        popBox();
    })
    //删除楼
    $(document).on("click",".xiugai",function(){
        //删除楼层ajax，记得检测有不有人住
    })

    //添加房间弹窗
    $(document).on("click","#zjfj",function(){
        console.log("添加房间")
        var h="fjcj"+n;
        var txt="<div class=\"left zjfjk\" id='"+h+"'>\n" +
            "                <div class=\"right1 iconfont zjfjkgb finger\" onclick=\"fjscjh('"+h+"')\">&#xe613;</div>\n" +
            "                <div class=\"zjfjk2\">\n" +
            "                    <input class=\"zjfjk3\" placeholder=\"输入房号\" name=\"houseelementname\">\n" +
            "                </div>\n" +
            "\n" +
            "            </div>"
        $(this).before(txt)
        n++;

    })


})



