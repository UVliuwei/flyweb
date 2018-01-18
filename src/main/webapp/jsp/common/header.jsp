<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<div class="fly-header layui-bg-black">
  <div class="layui-container">
    <a class="fly-logo" href="/">
      <img src="${ctx }/res/images/logo.png" alt="layui">
    </a>
    <ul class="layui-nav fly-nav layui-hide-xs">
      <li class="layui-nav-item layui-this">
        <a href="/"><i class="iconfont icon-jiaoliu"></i>交流</a>
      </li>
      <li class="layui-nav-item">
        <a href="#"><i class="iconfont icon-iconmingxinganli"></i>案例</a>
      </li>
      <li class="layui-nav-item">
        <a href="#" target="_blank"><i class="iconfont icon-ui"></i>框架</a>
      </li>
    </ul>
    
    <ul class="layui-nav fly-nav-user">
      
      <shiro:notAuthenticated>
      <li class="layui-nav-item">
        <a class="iconfont icon-touxiang layui-hide-xs" href="../user/login.html"></a>
      </li>
      <li class="layui-nav-item">
        <a href="${ctx }/user/login">登入</a>
      </li>
      <li class="layui-nav-item">
        <a href="${ctx }/user/reg">注册</a>
      </li>
      <li class="layui-nav-item layui-hide-xs">
        <a href="" onclick="layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})" title="QQ登入" class="iconfont icon-qq"></a>
      </li>
      <li class="layui-nav-item layui-hide-xs">
        <a href="" onclick="layer.msg('正在通过微博登入', {icon:16, shade: 0.1, time:0})" title="微博登入" class="iconfont icon-weibo"></a>
      </li>
      </shiro:notAuthenticated>
      
       <!-- 登入后的状态 -->
      <shiro:authenticated>
      <li class="layui-nav-item">
        <a class="fly-nav-avatar" href="javascript:;">
          <cite class="layui-hide-xs">${user.name }</cite>
         <shiro:hasRole name="admin"> <i class="iconfont icon-renzheng layui-hide-xs" title="认证信息：layui 管理员"></i> </shiro:hasRole>
          <img src="${ctx }/images/${user.img}">
        </a>
        <dl class="layui-nav-child">
          <dd><a href="/user/set"><i class="layui-icon">&#xe620;</i>基本设置</a></dd>
          <dd><a href="/user/message"><i class="iconfont icon-tongzhi" style="top: 4px;"></i>我的消息</a></dd>
          <dd><a href="/user/home"><i class="layui-icon" style="margin-left: 2px; font-size: 22px;">&#xe68e;</i>我的主页</a></dd>
          <hr style="margin: 5px 0;">
          <dd><a href="/user/logout" style="text-align: center;">退出</a></dd>

        </dl>
      </li>
      </shiro:authenticated>
      
    </ul>
  </div>
</div>
