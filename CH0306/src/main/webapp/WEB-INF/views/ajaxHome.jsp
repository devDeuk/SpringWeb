<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page session="false"%>
<html>
<head>
	<title>Home</title>
</head>

<script src="/resources/js/jQuery-2.1.4.min.js"></script>

<script type="text/javascript">
$(document).ready(function() {

	$("#postBtn").on("click", function() {
		var boardNo = $("#boardNo");
		var title = $("#title");
		var content = $("#content");
		var writer = $("#writer");

		var boardNoVal = boardNo.val();
		var titleVal = title.val();
		var contentVal = content.val();
		var writerVal = writer.val();

		var boardObject = {
			boardNo : boardNoVal,
			title : titleVal,
			content : contentVal,
			writer : writerVal
		};

		$.ajax({
			type : "post",
			url : "/board/" + boardNoVal,
			data : JSON.stringify(boardObject),
			contentType : "application/json; charset=utf-8",
			success : function(result) {
				console.log("result: " + result);
				if (result === "SUCCESS") {
					alert("SUCCESS");
				}
			}
		});
	});
	
	$("#putJsonBtn").on("click", function() {
		var boardNo = $("#boardNo");
		var title = $("#title");
		var content = $("#content");
		var writer = $("#writer");

		var boardNoVal = boardNo.val();
		var titleVal = title.val();
		var contentVal = content.val();
		var writerVal = writer.val();

		var boardObject = {
			boardNo : boardNoVal,
			title : titleVal,
			content : contentVal,
			writer : writerVal
		};

		$.ajax({
			type : "put",
			url : "/board/" + boardNoVal,
			data : JSON.stringify(boardObject),
			contentType : "application/json; charset=utf-8",
			success : function(result) {
				console.log("result: " + result);
				if (result === "SUCCESS") {
					alert("SUCCESS");
				}
			}
		});
	});
	
	$("#putXmlBtn").on("click", function() {
		var boardNo = $("#boardNo");
		var title = $("#title");
		var content = $("#content");
		var writer = $("#writer");

		var boardNoVal = boardNo.val();
		var titleVal = title.val();
		var contentVal = content.val();
		var writerVal = writer.val();
		
		var xmlData = "<Board>";
		xmlData += "<boardNo>0</boardNo>";
		xmlData += "<title>title1</title>";
		xmlData += "<content>content1</content>";
		xmlData += "<writer>writer1</writer>";
		xmlData += "<regDate>2018-12-10</regDate>";
		xmlData += "</Board>";
		
		$.ajax({
			type : "put",
			url : "/board/" + boardNoVal,
			data : xmlData,
			contentType : "application/xml; charset=utf-8",
			success : function(result) {
				console.log("result: " + result);
				if (result === "SUCCESS") {
					alert("SUCCESS");
				}
			}
		});
	});
	
});
</script>

<body>
	<h1>Ajax Home</h1>

	<form>
		boardNo: <input type="text" name="boardNo" value="" id="boardNo"><br>
		title: <input type="text" name="title" value="" id="title"><br>
		content: <input type="text" name="content" value="" id="content"><br>
		writer: <input type="text" name="writer" value="" id="writer"><br>
	</form>

	<div>
		<button id="postBtn">MODIFY(post)</button>
		<button id="putJsonBtn">MODIFY(put json)</button>
		<button id="putXmlBtn">MODIFY(put xml)</button>
	</div>
</body>
</html>
