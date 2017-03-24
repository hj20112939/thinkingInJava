<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>evernote</title>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

<script type="text/javascript">
$(document).ready(function () {  
	var note = ${noteContent};
	$("#noteContent").empty();
    $("#noteContent").append("<h2>" + note.title + "</h2>" + note.content);
});
</script>

<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">

				<nav class="navbar navbar-default navbar-static-top" role="navigation">
					<div class="navbar-header">
						<a class="navbar-brand" href="#"><img alt="140x140"
							src="${pageContext.request.contextPath}/image/logo.png" /></a>
					</div>
				</nav>

				<div class="container-fluid">
					<div class="row-fluid">
						<div class="span12" id="noteContent" style="word-break: break-all;word-wrap: break-word;"></div>
					</div>
				</div>

			</div>
		</div>
	</div>
</body>
</html>
