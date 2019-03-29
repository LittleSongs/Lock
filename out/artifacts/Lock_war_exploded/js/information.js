



$(function() {

    $(document).on("click","#xgzj",function() {
            $("#zj1").removeAttr("readonly");
    })

    $("#xgzj").click(function(){
        $("#zj1").val("").focus();
    })
})