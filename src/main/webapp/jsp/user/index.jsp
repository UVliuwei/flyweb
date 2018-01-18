<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%> 
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
  <title>用户中心 - Fly社区</title>
  <link rel="stylesheet" href="//at.alicdn.com/t/font_24081_aym082o86np3z0k9.css" />
  <link rel="stylesheet" href="//res.layui.com/layui/dist/css/layui.css?t=1513769483771" />
  <link rel="stylesheet" href="//res.layui.com/css/fly/global.css?t=15137694837711" charset="utf-8" />
  <style type="text/css">ins.adsbygoogle{display:none!important;display:none}</style>
 </head>
 <body>
	<c:import url="${ctx}/jsp/common/header.jsp"></c:import> 
	
  <div class="layui-container fly-marginTop fly-user-main"> 
  <ul class="layui-nav layui-nav-tree layui-inline" lay-filter="user">
    <li class="layui-nav-item">
      <a href="/user/${user.id }">
        <i class="layui-icon">&#xe609;</i>
        我的主页
      </a>
    </li>
    <li class="layui-nav-item layui-this">
      <a href="/user/index">
        <i class="layui-icon">&#xe612;</i>
        用户中心
      </a>
    </li>
    <li class="layui-nav-item ">
      <a href="/user/set">
        <i class="layui-icon">&#xe620;</i>
        基本设置
      </a>
    </li>
     <li class="layui-nav-item">
      <a href="/user/post">
        <i class="layui-icon">&#xe620;</i>
        我的帖子
      </a>
    </li>
    <li class="layui-nav-item">
      <a href="/user/message">
        <i class="layui-icon">&#xe611;</i>
        我的消息
      </a>
    </li>
  </ul>

   <div class="site-tree-mobile layui-hide"> 
    <i class="layui-icon"></i>
   </div>
   <div class="site-mobile-shade"></div> 
   <div class="fly-panel fly-panel-user" pad20="" style="padding-top:20px;"> 
    <div class="fly-msg" style="margin-bottom: 20px;">
      您的邮箱尚未验证，这比较影响您的帐号安全，
     <a href="/user/activate/">立即去激活？</a> 
    </div> 
    <div class="layui-row layui-col-space20"> 
     <div class="layui-col-md6"> 
  <div class="fly-panel fly-signin">
        <div class="fly-panel-title">
          签到
          <i class="fly-mid"></i> 
          <a href="javascript:;" class="fly-link" id="LAY_signinHelp">说明</a>
          <i class="fly-mid"></i> 
          <a href="javascript:;" class="fly-link" id="LAY_signinTop">活跃榜<span class="layui-badge-dot"></span></a>
          <span class="fly-signin-days">已连续签到<cite>16</cite>天</span>
        </div>
        <div class="fly-panel-main fly-signin-main">
          <button class="layui-btn layui-btn-danger" id="LAY_signin">今日签到</button>
          <span>可获得<cite>5</cite>飞吻</span>
          
          <!-- 已签到状态 -->
          <!--
          <button class="layui-btn layui-btn-disabled">今日已签到</button>
          <span>获得了<cite>20</cite>飞吻</span>
          -->
        </div>
      </div>
     </div> 
     <div class="layui-col-md6"> 
      <div class="fly-panel fly-panel-border"> 
       <div class="fly-panel-title">
         我的会员信息 
       </div> 
       <div class="fly-panel-main layui-text" style="padding: 18px 15px; height: 50px; line-height: 26px;"> 
        <p>您的财富经验值：0</p> 
        <p>您当前为：非 VIP</p> 
       </div> 
      </div> 
     </div> 
     <div class="layui-col-md12" style="margin-top: -20px;"> 
      <div class="fly-panel fly-panel-border"> 
       <div class="fly-panel-title">
         快捷方式 
       </div> 
       <div class="fly-panel-main"> 
        <ul class="layui-row layui-col-space10 fly-shortcut"> 
         <li class="layui-col-sm3 layui-col-xs4"> <a href="/user/set/"><i class="layui-icon"></i><cite>修改信息</cite></a> </li> 
         <li class="layui-col-sm3 layui-col-xs4"> <a href="/user/set#avatar"><i class="layui-icon"></i><cite>修改头像</cite></a> </li> 
         <li class="layui-col-sm3 layui-col-xs4"> <a href="/user/set#pass"><i class="layui-icon"></i><cite>修改密码</cite></a> </li> 
         <li class="layui-col-sm3 layui-col-xs4"> <a href="/user/set#bind"><i class="layui-icon"></i><cite>帐号绑定</cite></a> </li> 
         <li class="layui-col-sm3 layui-col-xs4"> <a href="/jie/add"><i class="layui-icon"></i><cite>发表新帖</cite></a> </li> 
         <li class="layui-col-sm3 layui-col-xs4"> <a href="/column/share/"><i class="layui-icon"></i><cite>查看分享</cite></a> </li> 
         <li class="layui-col-sm3 layui-col-xs4 LAY_search"> <a href="javascript:;"><i class="layui-icon"></i><cite>搜索资源</cite></a> </li> 
         <li class="layui-col-sm3 layui-col-xs4"> <a href="/user/post#collection"><i class="layui-icon"></i><cite>我的收藏</cite></a> </li> 
        </ul> 
       </div> 
      </div> 
     </div> 
    </div> 
   </div>
  </div>
<c:import url="${ctx}/jsp/common/footer.jsp"></c:import> 
<script src="${ctx }/res/mods/form.js"></script>
<script>
layui.cache.page = 'user';
layui.cache.user = {
  username: '游客'
  ,uid: -1
  ,avatar: '../../res/images/avatar/00.jpg'
  ,experience: 83
  ,sex: '男'
};
layui.config({
  version: "3.0.0"
  ,base: '../../res/mods/'
}).extend({
  fly: 'index'
}).use('fly');
</script>
 </body>
</html>