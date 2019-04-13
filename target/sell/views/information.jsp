<%@ page import="com.dhy.yycompany.lock.bean.UserInfo" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>gy公寓</title>
    <link rel="stylesheet" href="../css/tou.css">
    <link rel="stylesheet" href="../css/iconfont.css">
    <link rel="stylesheet" href="../css/leftNavigation.css">
    <link rel="stylesheet" href="../css/rightWindow.css">
    <link rel="stylesheet" href="../css/information.css">
    <link rel="stylesheet" href="../css/xin.css">
    <link rel="stylesheet" href="../css/font.css">
    <link rel="stylesheet" href="../css/tc.css">
    <link rel="stylesheet" href="../css/style.css">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="../js/information.js"></script>
    <script type="text/javascript" src="../js/index.js"></script>
    <script type="text/javascript" src="../js/tc.js"></script>
</head>

<body >
<!--头实体-->
<div class="main_container dw">
    <div class="navbar-header">
        <div class="versions">
            <a href="#">
                gy公寓
                <span>版本v0.1</span>
            </a>
        </div>
        <div class="main_date">
            <a href="#">1月27日星期日</a>
        </div>
    </div>
    <div class="portrait" onmousemove="popBox2()" >
        <a href="#" on>
            <div class="tx"><img class="tp" src="../img/tx1.jpg"></div>

        </a>
        <!--角色详细信息弹窗-->
        <div id="xxxx" class="you "  onmouseout="closeBox2()">
            <div class="content2">
                <h4 class="toubt">管理员信息</h4>
                <div class="wk">
                    <div  class="jz jz1"><label class="nr left">昵称：</label><div  class="nr xx left">琥珀川小黑</div></div>
                    <br/>
                    <div class="jz jz2"><label class="nr left">信息：</label><div class="nr xx left">无</div></div>
                    <br/>
                    <div class="jz jz2"><label class="nr left">权限：</label><div class="nr xx left">一级权限</div></div>
                </div>

            </div>
            <HR align=center width=100% color=#ccc SIZE=2>
            <div  class="gb"><div  class="xm mmxg" onclick="glypopBox()">管理员管理</div><div class="xm tc">退出</div></div>

        </div>
    </div>
</div>
<!--主体-->
<div class="main_xia" style="min-height:100%;">

    <!--房态-->
    <div class="house_status dw">
        <!--左导航实体-->
        <div class="left_navigation dw">
            <ul class="houses">
                <li>
                    <a class="house"  href="#"><i class="iconfont">&#xe60f;</i><span >1号楼</span><button class="xiugai" >修改</button></a>

                    <ul>
                        <li class="floor"><a href="#">1楼</a></li>
                        <li class="floor"><a href="#">2楼</a></li>
                        <li class="floor"><a href="#">3楼</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>

        <%--<!--左导航虚-->--%>
        <%--<div class="left_navigation xt zxt">--%>
        <!--右边房间窗口-->
        <div class="house_status1 dw">
            <div class="right_window dw">
            <div class="card">
                <a class="ft_card ft" href="index">房态</a><span  class="ft"> > </span><a class="ft_card ft"  href="information?roomId=${requestScope.roomX.rId}">${requestScope.roomX.rApartmentName}-${requestScope.roomX.rFloor}楼-${requestScope.roomX.rNum}</a>
             </div>
            <div class="information">
                <div class="information_t">
                        <div class="room_name">${requestScope.roomX.rApartmentName}-${requestScope.roomX.rFloor}楼-${requestScope.roomX.rNum}</div>
                        <div class="message2 ">
                            <div class="zxx">
                                月租金： <span id="zzj" class="zj">${requestScope.roomX.rPrice}</span>
                                <span id="xgzj" onclick="xgzjpopBox()" class="xgzj finger">修改租金</span>
                            </div>

                            <div class="butt2">
                                <button class="bd">绑定</button>

                            </div>
                            <div class="message3s">
                                <div class="message3 ke">
                                    <label class="border-input">租聘时间:</label><div readonly="readonly" id="kaishi" class="form-control border-input">${requestScope.roomX.rentTime}</div><HR class="border-input" align=center width=5% color=#0000 SIZE=2 style="margin-top: 10px; margin-left: 8px;  "><div readonly="readonly" id="jieshu" class="form-control border-input">${requestScope.roomX.retreatTime}</div>
                                    <br/>
                                    <br/>

                                    <label class="border-input">居住人数:</label><div readonly="readonly"  class="form-control border-input">${requestScope.roomX.rResidentNum}</div>
                                </div>

                                <div class="message3 ke">
                                    <label style="float:left;">门锁控制</label>
                                    <div style="position: relative;width: 125px; height: 25px; line-height: 25px; font-size: 14px; float:left; margin-left: 20px;">
                                        <span class="SAP">关</span>
                                        <div class="onoffswitch">
                                            <input type="checkbox" name="onoff" class="onoff_checkbox" id="onoff" ${requestScope.onOff}>
                                            <label for="onoff" class="onoff_label" >
                                                <span class="onoff_inter"></span>
                                                <span class="onoff_switch"></span>

                                            </label>

                                        </div>
                                        <span class="FBOI">开</span>
                                    </div>

                                    <div class="butt1">
                                        <a href="key.html">
                                        <button style="cursor:pointer" class="gl bd ">门锁管理</button>
                                        </a>
                                    </div>
                                </div>
                                <%
                                    int i;
                                    List<UserInfo> users = (List<UserInfo>) request.getAttribute("users");
                                    for(i=0;i<users.size();i++)
                                    {
                                        UserInfo userInfo = users.get(i);
                                        int id = userInfo.getuId();//用户id
                                        String name = userInfo.getuName();
                                        String sexStr = userInfo.getSexStr();//性别
                                        String phone = userInfo.getuPhone();//手机号
                                        String rztime = userInfo.getuStayTime();//入住时间
                                        String idCard = userInfo.getuIdCard();//身份证
                                %>
                                <%
                                    if(users.get(i).getuDelete()==0)
                                    {
                                %>
                                <div id="inuser_<%=id%>" class="message31 ke">
                                    <label class="border-input">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</label><div readonly="readonly" class="form-control"><%=name%></div>
                                    <br/>

                                    <label class="border-input">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</label><div readonly="readonly"  class="form-control"><%=sexStr%></div>
                                    <br/>

                                    <label class="border-input">手&nbsp;&nbsp;机&nbsp;&nbsp;号：</label><div readonly="readonly"  class="form-contro2"><%=phone%></div>
                                    <br/>
                                    <label class="border-input">入住时间：</label><div readonly="readonly"  class="form-contro2"><%=rztime%></div>
                                    <br/>
                                    <label class="border-input">身份证号：</label><div readonly="readonly" class="form-contro2"><%=idCard%></div>
                                    <div class="butt butt2">
                                        <button style="cursor:pointer" class="bd">退宿</button>

                                    </div>
                                </div>
                                <%}else if(users.get(i).getuDelete()==1)
                                {
                                %>

                                <div id="inuser_<%=id%>" class="message32 ke">
                                    <label class="border-input">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</label><div readonly="readonly"  class="form-control"><%=name%></div>
                                    <br/>

                                    <label class="border-input">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</label><div readonly="readonly"  class="form-control"><%=sexStr%></div>
                                    <br/>

                                    <label class="border-input">手&nbsp;&nbsp;机&nbsp;&nbsp;号：</label><div readonly="readonly"  class="form-contro2"><%=phone%></div>
                                    <br/>
                                    <label class="border-input">入住时间：</label><div readonly="readonly"  class="form-contro2"><%=rztime%></div>
                                    <br/>
                                    <label class="border-input">身份证号：</label><div readonly="readonly" class="form-contro2"><%=idCard%></div>
                                </div>
                                <%
                                        }
                                    }
                                %>
                            </div>

                        </div>
                </div>
            </div>

        </div>
                </div>
    </div>

</div>

    <%--实--%>
    <div class="db1 dw">
        <div class="ld_footer">
            <div class="ld_footer_in">
                <p>地址：宁波财经学院</p>
                <p>联系方式：13355908909</p>
            </div>
        </div>
    </div>
    <!--角色详细信息弹窗-->
    <div id="xxxx" class="you dw"  onmouseout="closeBox2()">
        <div class="content2">
            <h4 class="toubt">管理员信息</h4>
            <div class="wk">
                <div  class="jz jz1"><label class="nr left">昵称：</label><div  class="nr xx left">琥珀川小黑</div></div>
                <br/>
                <div class="jz jz2"><label class="nr left">信息：</label><div class="nr xx left">无</div></div>
                <br/>
                <div class="jz jz2"><label class="nr left">权限：</label><div class="nr xx left">一级权限</div></div>
            </div>

        </div>
        <HR align=center width=100% color=#ccc SIZE=2>
        <div  class="gb"><div  class="xm mmxg" onclick="glypopBox()">管理员管理</div><div class="xm tc">退出</div></div>

    </div>

<!--修改楼弹窗-->
<div id="popLayer"></div>
<div id="xgzjtc" class="popBox ke">
    <div class="close">
        <a  href="javascript:void(0)" onclick="closeBox()" class="gb iconfont">&#xe613;</a>
    </div>
    <div class="content">
        <h4>修改租金</h4>
        <div class="zj"><label>租金：</label><input  id="zjinput" class="form-control" type="text" value=""></div>
        <br/>


    </div>
    <div onclick="xgzjcloseBox()"><div id="b1" class="bd xyb finger">确认</div></div>

</div>

</body>
</html>
