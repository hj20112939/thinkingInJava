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
<script src="${pageContext.request.contextPath}/js/evernote.js"></script>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">

				<nav class="navbar navbar-default navbar-static-top" role="navigation">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span><span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#"><img alt="140x140"
							src="${pageContext.request.contextPath}/image/logo.png" /></a>
					</div>

					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li class="active"><a href="#" id="allNoteList"><img
									alt="140x140" src="${pageContext.request.contextPath}/image/note.png" /></a></li>
							<li><a href="#" id="notebookList"><img alt="140x140"
									src="${pageContext.request.contextPath}/image/notebook.png" /></a></li>
						</ul>
					</div>
				</nav>

				<div class="list-group">
					<div id="type" class="list-group-item active"
						style="background-color: #2DBE60; border-color: #2DBE60;">所有笔记</div>
					<div id="NoteOrNotebookList"></div>
				</div>

				<div class="container-fluid">
					<div class="row-fluid">
						<div class="span12" id="noteContent"></div>
					</div>
				</div>

			</div>
		</div>
	</div>
</body>
</html>
