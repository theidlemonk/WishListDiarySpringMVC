<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><sitemesh:write property='title' /></title>
<sitemesh:write property='head' />
<!-- <link rel="stylesheet" -->
<!-- 	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" -->
<!-- 	type="text/css" /> -->
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootswatch/3.2.0/darkly/bootstrap.min.css"
	type="text/css" />

</head>
<body>
	<div class="container">
		<div class="header">
			<ul class="nav nav-tabs nav-justified">
				<li><a href="/">Home</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Wishes <span class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="/wish/view">View All Wishes</a></li>
						<li><a href="/wish/add">Make a Wish</a></li>
					</ul></li>
			</ul>
			<h3 class="text-muted">WishListDiary</h3>
		</div>
		<hr>
		<a href="https://github.com/theidlemonk/WishListDiarySpringMVC"><img
			style="position: absolute; top: 0; right: 0; border: 0; width: 149px; height: 149px;"
			src="http://aral.github.com/fork-me-on-github-retina-ribbons/right-turquoise@2x.png"
			alt="Fork me on GitHub"></a>
		<sitemesh:write property='body' />
		<br>
		<hr>
		<div class="text-muted text-right">&copy; Maintained by
			TheIdleMonk</div>
	</div>
</body>
</html>
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"
	type="text/javascript">
	
</script>
