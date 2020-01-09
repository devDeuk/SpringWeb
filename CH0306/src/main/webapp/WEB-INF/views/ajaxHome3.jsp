<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<html>
<head>
	<title>Home</title>
</head>

<script src="/resources/js/jQuery-2.1.4.min.js"></script>

<script type="text/javascript">
$(document).ready(function() {

	$("#putBtn").on("click", function() {
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
		
		var boardObject = {
				boardNo : boardNoVal,
				title : titleVal,
				content : contentVal,
				writer : writerVal
			};

		/* 
		var xmlData = "<Board>";
		xmlData += "<boardNo>0</boardNo>";
		xmlData += "<title>제목</title>";
		xmlData += "<content>내용입니다.</content>";
		xmlData += "<writer>홍길동</writer>";
		xmlData += "<regDate>1544319539845</regDate>";
		xmlData += "</Board>";
		 */
		 
		//var xmlData = "<?xml version=1.0?><Board>";
		var xmlData = "<Board>";
		xmlData += "<boardNo>0</boardNo>";
		xmlData += "<title>title1</title>";
		xmlData += "<content>content1</content>";
		xmlData += "<writer>writer1</writer>";
		xmlData += "<regDate>2018-12-10</regDate>";
		xmlData += "</Board>";
		
		//alert(xmlData);
		//data : JSON.stringify(boardObject),
		//data : escape(xmlData),
		
		//alert(escape(xmlData));


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
		<button id="putBtn">MODIFY(put)</button>
		<button id="putJsonBtn">MODIFY(put json)</button>
		<button id="putXmlBtn">MODIFY(put xml)</button>
	</div>
</body>
</html>
