<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%> 
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Fly Template v3.0，基于 layui 的极简社区页面模版</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <meta name="keywords" content="fly,layui,前端社区">
  <meta name="description" content="Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力">
  <link rel="stylesheet" href="${ctx}/res/layui/css/layui.css">
  <link rel="stylesheet" href="${ctx}/res/css/global.css">
</head>
<body>

<c:import url="${ctx}/jsp/common/header.jsp"></c:import> 

<div class="layui-hide-xs">
  <div class="fly-panel fly-column">
    <div class="layui-container">
      <ul class="layui-clear">
        <li class="layui-hide-xs"><a href="/">首页</a></li> 
        <li class="layui-this"><a href="">提问</a></li> 
        <li><a href="">分享<span class="layui-badge-dot"></span></a></li> 
        <li><a href="">讨论</a></li> 
        <li><a href="">建议</a></li> 
        <li><a href="">公告</a></li> 
        <li><a href="">动态</a></li> 
        <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><span class="fly-mid"></span></li> 
        
        <!-- 用户登入后显示 -->
        <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><a href="../user/index.html">我发表的贴</a></li> 
        <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><a href="../user/index.html#collection">我收藏的贴</a></li> 
      </ul> 
      
      <div class="fly-column-right layui-hide-xs"> 
        <span class="fly-search"><i class="layui-icon"></i></span> 
        <a href="add.html" class="layui-btn">发表新帖</a> 
      </div> 
      <div class="layui-hide-sm layui-show-xs-block" style="margin-top: -10px; padding-bottom: 10px; text-align: center;"> 
        <a href="add.html" class="layui-btn">发表新帖</a> 
      </div> 
    </div>
  </div>
</div>

<div class="layui-container">
  <div class="layui-row layui-col-space15">
    <div class="layui-col-md8 content detail">
      <div class="fly-panel detail-box">
        <h1>Fly Template v3.0，基于 layui 的极简社区页面模版</h1>
        <div class="fly-detail-info">
          <!-- <span class="layui-badge">审核中</span> -->
          <span class="layui-badge layui-bg-green fly-detail-column">${post.column }</span>
          <c:choose>
          	<c:when test="${post.ended eq '1' }">
          		<span class="layui-badge" style="background-color: #5FB878;">已结</span>
          	</c:when>
          	<c:otherwise>
          		 <span class="layui-badge" style="background-color: #999;">未结</span>
          	</c:otherwise>
          </c:choose>
          <c:if test="${post.topped eq '1' }">
          	  <span class="layui-badge layui-bg-black">置顶</span>
          </c:if>
         <c:if test="${post.boutiqued eq '1' }">
          	  <span class="layui-badge layui-bg-red">精帖</span>
          </c:if>
          
          <div class="fly-admin-box" data-id="${post.id }">
          	<shiro:hasPermission name="post:delete">
            	<span class="layui-btn layui-btn-xs jie-admin" type="del">删除</span>
            </shiro:hasPermission>
            <shiro:hasPermission name="post:top">
            	 <c:choose>
		          	<c:when test="${post.topped eq '0' }">
		          		<span class="layui-btn layui-btn-xs jie-admin" type="set" field="topped" rank="1">置顶</span>
		          	</c:when>
		          	<c:otherwise>
		          		 <span class="layui-btn layui-btn-xs jie-admin" type="set" field="topped" rank="0" style="background-color:#ccc;">取消置顶</span> 
		          	</c:otherwise>
         		 </c:choose>	
            </shiro:hasPermission> 
            <shiro:hasPermission name="post:jing">
            	 <c:choose>
		          	<c:when test="${post.boutiqued eq '0' }">
 						<span class="layui-btn layui-btn-xs jie-admin" type="set" field="boutiqued" rank="1">加精</span> 		          	</c:when>
		          	<c:otherwise>
           			    <span class="layui-btn layui-btn-xs jie-admin" type="set" field="boutiqued" rank="0" style="background-color:#ccc;">取消加精</span> 
		          	</c:otherwise>
       		    </c:choose>
          	</shiro:hasPermission>
          </div>
          <span class="fly-list-nums"> 
            <a href="#comment"><i class="iconfont" title="回答">&#xe60c;</i> ${post.ansnum }</a>
            <i class="iconfont" title="人气">&#xe60b;</i> ${post.popularity }
          </span>
        </div>
        <div class="detail-about">
          <a class="fly-avatar" href="${ctx }/user/${post.user.id}">
            <img src="${imgctx }/images/${post.user.img}" alt="${post.user.name }">
          </a>
          <div class="fly-detail-user">
            <a href="${ctx }/user/home" class="fly-link">
              <cite>${post.user.name }</cite>
              <i class="iconfont icon-renzheng" title="认证信息：{{ rows.user.approve }}"></i>
              <i class="layui-badge fly-badge-vip">VIP3</i>
            </a>
            <span>${post.time }</span>
          </div>
          <div class="detail-hits" id="LAY_jieAdmin" data-id="${post.id }">
            <span style="padding-right: 10px; color: #FF7200">悬赏：${post.kiss }飞吻</span>  
           <c:if test="${post.userId eq user.id }">
           	 <span class="layui-btn layui-btn-xs jie-admin" type="edit"><a href="/jie/edit/${post.id }">编辑此贴</a></span>
           </c:if>
          </div>
        </div>
        <div class="detail-body photos">
     		<c:if test="${post.pcolumn eq '0' }"><table class="layui-table"> <tbody> <tr> <td>技术类型：${post.ptype }</td> <td>技术方向：${post.version }</td> </tr> </tbody> </table></c:if>
       		${post.content }
        </div>
      </div>

      <div class="fly-panel detail-box" id="flyReply">
        <fieldset class="layui-elem-field layui-field-title" style="text-align: center;">
          <legend>回帖</legend>
        </fieldset>

        <ul class="jieda" id="jieda">
          <li data-id="111" class="jieda-daan">
            <a name="item-1111111111"></a>
            <div class="detail-about detail-about-reply">
              <a class="fly-avatar" href="">
                <img src="https://tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg" alt=" ">
              </a>
              <div class="fly-detail-user">
                <a href="" class="fly-link">
                  <cite>贤心</cite>
                  <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                  <i class="layui-badge fly-badge-vip">VIP3</i>              
                </a>
                
                <span>(楼主)</span>
                <!--
                <span style="color:#5FB878">(管理员)</span>
                <span style="color:#FF9E3F">（社区之光）</span>
                <span style="color:#999">（该号已被封）</span>
                -->
              </div>

              <div class="detail-hits">
                <span>2017-11-30</span>
              </div>

              <i class="iconfont icon-caina" title="最佳答案"></i>
            </div>
            <div class="detail-body jieda-body photos">
              <p>香菇那个蓝瘦，这是一条被采纳的回帖</p>
            </div>
            <div class="jieda-reply">
              <span class="jieda-zan zanok" type="zan">
                <i class="iconfont icon-zan"></i>
                <em>66</em>
              </span>
              <span type="reply">
                <i class="iconfont icon-svgmoban53"></i>
                回复
              </span>
              <div class="jieda-admin">
                <span type="edit">编辑</span>
                <span type="del">删除</span>
                <!-- <span class="jieda-accept" type="accept">采纳</span> -->
              </div>
            </div>
          </li>
          
          <li data-id="111">
            <a name="item-1111111111"></a>
            <div class="detail-about detail-about-reply">
              <a class="fly-avatar" href="">
                <img src="https://tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg" alt=" ">
              </a>
              <div class="fly-detail-user">
                <a href="" class="fly-link">
                  <cite>贤心</cite>       
                </a>
              </div>
              <div class="detail-hits">
                <span>2017-11-30</span>
              </div>
            </div>
            <div class="detail-body jieda-body photos">
              <p>蓝瘦那个香菇，这是一条没被采纳的回帖</p>
            </div>
            <div class="jieda-reply">
              <span class="jieda-zan" type="zan">
                <i class="iconfont icon-zan"></i>
                <em>0</em>
              </span>
              <span type="reply">
                <i class="iconfont icon-svgmoban53"></i>
                回复
              </span>
              <div class="jieda-admin">
                <span type="edit">编辑</span>
                <span type="del">删除</span>
                <span class="jieda-accept" type="accept">采纳</span>
              </div>
            </div>
          </li>
          
          <!-- 无数据时 -->
          <!-- <li class="fly-none">消灭零回复</li> -->
        </ul>
        
        <div class="layui-form layui-form-pane">
          <form action="/jie/reply/" method="post">
            <div class="layui-form-item layui-form-text">
              <a name="comment"></a>
              <div class="layui-input-block">
                <textarea id="L_content" name="content" required lay-verify="required" placeholder="请输入内容"  class="layui-textarea fly-editor" style="height: 150px;"></textarea>
              </div>
            </div>
            <div class="layui-form-item">
              <input type="hidden" name="jid" value="123">
              <button class="layui-btn" lay-filter="*" lay-submit>提交回复</button>
            </div>
          </form>
        </div>
      </div>
    </div>
    <div class="layui-col-md4">
      <dl class="fly-panel fly-list-one">
        <dt class="fly-panel-title">本周热议</dt>
        <dd>
          <a href="">基于 layui 的极简社区页面模版</a>
          <span><i class="iconfont icon-pinglun1"></i> 16</span>
        </dd>
        <dd>
          <a href="">基于 layui 的极简社区页面模版</a>
          <span><i class="iconfont icon-pinglun1"></i> 16</span>
        </dd>
        <dd>
          <a href="">基于 layui 的极简社区页面模版</a>
          <span><i class="iconfont icon-pinglun1"></i> 16</span>
        </dd>
        <dd>
          <a href="">基于 layui 的极简社区页面模版</a>
          <span><i class="iconfont icon-pinglun1"></i> 16</span>
        </dd>
        <dd>
          <a href="">基于 layui 的极简社区页面模版</a>
          <span><i class="iconfont icon-pinglun1"></i> 16</span>
        </dd>
        <dd>
          <a href="">基于 layui 的极简社区页面模版</a>
          <span><i class="iconfont icon-pinglun1"></i> 16</span>
        </dd>
        <dd>
          <a href="">基于 layui 的极简社区页面模版</a>
          <span><i class="iconfont icon-pinglun1"></i> 16</span>
        </dd>
        <dd>
          <a href="">基于 layui 的极简社区页面模版</a>
          <span><i class="iconfont icon-pinglun1"></i> 16</span>
        </dd>
        <dd>
          <a href="">基于 layui 的极简社区页面模版</a>
          <span><i class="iconfont icon-pinglun1"></i> 16</span>
        </dd>
        <dd>
          <a href="">基于 layui 的极简社区页面模版</a>
          <span><i class="iconfont icon-pinglun1"></i> 16</span>
        </dd>

        <!-- 无数据时 -->
        <!--
        <div class="fly-none">没有相关数据</div>
        -->
      </dl>

      <div class="fly-panel">
        <div class="fly-panel-title">
          这里可作为广告区域
        </div>
        <div class="fly-panel-main">
          <a href="http://layim.layui.com/?from=fly" target="_blank" class="fly-zanzhu" time-limit="2017.09.25-2099.01.01" style="background-color: #5FB878;">LayIM 3.0 - layui 旗舰之作</a>
        </div>
      </div>

      <div class="fly-panel" style="padding: 20px 0; text-align: center;">
        <img src="../../res/images/weixin.jpg" style="max-width: 100%;" alt="layui">
        <p style="position: relative; color: #666;">微信扫码关注 layui 公众号</p>
      </div>

    </div>
  </div>
</div>

<c:import url="${ctx}/jsp/common/footer.jsp"></c:import> 

<script>
layui.cache.page = 'jie';
layui.cache.user = {
  username: '游客'
  ,uid: -1
  ,avatar: '../../res/images/avatar/00.jpg'
  ,experience: 83
  ,sex: '男'
};
layui.config({
  version: "2.0.0"
  ,base: '../../res/mods/'
}).extend({
  fly: 'index'
}).use('fly', function(){
  var fly = layui.fly;
  //如果你是采用模版自带的编辑器，你需要开启以下语句来解析。
  /*
  $('.detail-body').each(function(){
    var othis = $(this), html = othis.html();
    othis.html(fly.content(html));
  });
  */
});
</script>

</body>
</html>