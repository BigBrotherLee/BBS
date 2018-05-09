<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>首页</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="css/head.css"/>
		<link rel="stylesheet" type="text/css" href="css/body.css" />
		<link rel="stylesheet" type="text/css" href="css/copyright.css" />
		<link rel="stylesheet" type="text/css" href="css/login.css" />
		<script type="text/javascript" src="js/jquery/jquery-3.3.1.min.js" ></script>
		<script type="text/javascript" src="js/bootstrap.min.js" ></script>
		<script type="text/javascript" src="js/change.js"></script>
		<script type="text/javascript" src="js/login.js" charset="utf-8"></script>
	</head>
	<body>
		<div id="head" >
			<div id="head_bar">
				<div id="head_bar_left">
					<a href="index.html"><img src="img/logo.png" height="53px" alt="logo"/></a>
					<span id="website_name">观点</span>
					<div id="head_bar_left_search">
						<input type="text" placeholder="关键字" id="head_bar_left_searchT"/>
						<button type="button" class="btn btn-danger glyphicon glyphicon-search" id="head_bar_left_searchB">	</button>
					</div>
				</div>
				<div id="head_bar_right">
					<div id="head_bar_right_icon">
						
					</div>
				</div>
			</div>
		</div>
		
		<div id="login">
			<div id="login_bg">
				<input type="button" id="login_close"  title="暂不登录" value="x" onclick="loginClose()"/>
				<div id="login_head">
					<div id="login_head_option">
						我们的思想
					</div>
				</div>
					<form action="loginUserAction" method="post">
					<input type="email" id="login_name"  name="user.name"  placeholder="Email"/>
					<input type="password"  id="login_password"  name="user.password" placeholder="Password"/>
					<div id="login_yzm">
						<input type="text"  id="login_yzm_input" placeholder="验证码" /><img src="#"  width="100px" height="46px"/>
					</div>
					<input type="submit" value="登录" id="login_button"/>
				</form>
				<div id="login_register">
					注册
				</div>
				<div id="login_other">
					其他方式登录		
				</div>
			</div>
		</div>
		
		<div id="body">
			<div id="body_left">
				<div class="card">
					<div class="card_head">
						<div class="card_head_type">文章</div>
						<div class="card_head_point"></div>
						<div class="card_head_title">真正的全自动驾驶！特斯拉又放出大招了</div>
						<div class="card_head_auther">米壳网</div>
					</div>
					<div class="card_line"></div>
					<div class="card_body">
						<div class="card_body_img">
							<img src="img/tsl.jpg" width="200px"/>
						</div>
						<div class="card_body_text">
							众所周知，特斯拉最近一段时间以来一直在打造全自动驾驶技术，未来的某一天我们或许根本就不再需要用到“驾驶员”这一词语。
								当地时间周六，特斯拉CEO伊隆-马斯克（Elon Musk）就在推特上放出了一段特斯拉自动驾驶的最新视频。在视频中，
								我们看到如今的特斯拉自动驾驶技术已经可以驾轻就熟的在街道中安全驾驶、避开行人，且在每一个“Stop”标识前按规定停下。
						</div>
					</div>
					<div class="card_foot">
						<div class="card_foot_position card_foot_add" title="补充">
							<span class="glyphicon glyphicon-plus-sign">10</span>
						</div>
						<div class="card_foot_position card_foot_agree" title="赞同">
							<span class="glyphicon glyphicon-ok-sign">0</span>
						</div>
						<div class="card_foot_position  card_foot_disagree" title="反对">
							<span class="glyphicon glyphicon-remove-sign">0</span>
						</div>
						<div class="card_foot_position  card_foot_question" title="疑问">
							<span class="glyphicon glyphicon-question-sign">0</span>
						</div>
						<div class="card_foot_attention card_foot_get" title="收藏">
							<span class="glyphicon glyphicon-book">0</span>
						</div>
						<div class="card_foot_attention card_foot_love" title="赞">
							<span class="glyphicon glyphicon-heart">0</span>
						</div>
					</div>
				</div>
				<div class="card">
					<div class="card_head">
						<div class="card_head_type">问题</div>
						<div class="card_head_point"></div>
						<div class="card_head_title">为何历史上的开国皇帝都很难处理与开国功臣的关系？</div>
						<div class="card_head_auther">匿名用户</div>
					</div>
					<div class="card_line"></div>
					<div class="card_body">
						<div class="card_body_auther">
								来自<span>匿名用户</span>的观点
						</div>
						<div class="card_body_img">
							<!--<img src="" width="200px"/>-->
						</div>
						<div class="card_body_text">
							大概十年前，我爸散步的时候和我说过这么一句：“上朝的时候，登基的时候，你看到的是山呼万岁，而皇帝呢，皇帝看到的是什么？是磨牙吮血，
							是群狼环伺，是小心谨慎，是战战兢兢”人类历史一个永恒的难题就是处理王权和大贵族的关系，你们所看到的纷繁复杂的历史，都是围绕着这个展开的。
							新生王权，根基不稳，谁也没有绝对的权威，谁都能分一杯羹。和你爹打天下出来的那些叔叔伯伯们都是合伙人，能威胁到你的王权的只有这些拥有行政权、
							地方立法权、军权的分封贵族。想要万世一系？怕不是没那么容易.
						</div>
					</div>
					<div class="card_foot">
						<div class="card_foot_position card_foot_add" title="补充">
							<span class="glyphicon glyphicon-plus-sign">10</span>
						</div>
						<div class="card_foot_position card_foot_agree" title="赞同">
							<span class="glyphicon glyphicon-ok-sign">0</span>
						</div>
						<div class="card_foot_position  card_foot_disagree" title="反对">
							<span class="glyphicon glyphicon-remove-sign">0</span>
						</div>
						<div class="card_foot_position  card_foot_question" title="疑问">
							<span class="glyphicon glyphicon-question-sign">0</span>
						</div>
						<div class="card_foot_attention card_foot_get" title="收藏">
							<span class="glyphicon glyphicon-book">0</span>
						</div>
						<div class="card_foot_attention card_foot_love" title="赞">
							<span class="glyphicon glyphicon-heart">0</span>
						</div>
					</div>
				</div>
			</div>
			<div id="body_right">
				<div class="about_me_type">
					<div id="type_blog" class="about_me_type_item" onclick="changeType()">
						博客
					</div>
					<div id="type_question" class="about_me_type_item" onclick="changeType()">
						问题
					</div>
					<div id="type_answer" class="about_me_type_item" onclick="changeType()">
						回答
					</div>
				</div>
				<div id="about_me_body">
					<div class="about_me_body_item">
						it is working!!
					</div>
					<div class="about_me_body_item">
						it is working!!
					</div>
					<div class="about_me_body_item">
						it is working!!
					</div>
				</div>
			</div>
		</div>
		
		<div id="copyright">
			&copy;Copyright made by L,W,N
		</div>
	</body>
</html>