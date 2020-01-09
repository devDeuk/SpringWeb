<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page session="false"%>
<html>
<head>
	<title>Home</title>
</head>

<script src="/resources/js/jQuery-2.1.4.min.js"></script>

<script type="text/javascript">
$(document).ready(function() {

	$("#getBtn").on("click", function() {
		var boardNo = $("#boardNo");
		var boardNoVal = boardNo.val();

		console.log(boardNoVal);

		$.get("/board/" + boardNoVal, function(data) {
			console.log(data);

			alert(JSON.stringify(data));
		});
	});
	
	$("#getJsonBtn").on("click", function() {
		var boardNo = $("#boardNo");
		var boardNoVal = boardNo.val();

		console.log(boardNoVal);
		
		$.ajax({
			type : "get",
			url : "/board/" + boardNoVal,
			headers : {
				"Accept" : "application/json"
			},
			success : function(result) {
				console.log("result: " + result);
				
				alert(JSON.stringify(result));
			}
		});
	});
	
	$("#getXmlBtn").on("click", function() {
		var boardNo = $("#boardNo");
		var boardNoVal = boardNo.val();

		console.log(boardNoVal);
		
		$.ajax({
			type : "get",
			url : "/board/" + boardNoVal,
			headers : {
				"Accept" : "application/xml"
			},
			success : function(result) {
				console.log("result: " + result);
				
				alert(xmlToString(result));
			}
		});
	});
	
}); 

function xmlToString(xmlData) { 
    var xmlString;
 
    if (window.ActiveXObject){
        xmlString = xmlData.xml;
    }
    else{
        xmlString = (new XMLSerializer()).serializeToString(xmlData);
    }
    
    return xmlString;
}   

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
		<button id="getBtn">READ</button>
		<button id="getJsonBtn">READ (JSON)</button>
		<button id="getXmlBtn">READ (XML)</button>
	</div>
</body>
</html>
