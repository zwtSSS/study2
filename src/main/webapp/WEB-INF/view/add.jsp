<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
  <!-- <link rel="stylesheet" href="css/css.css" type="text/css"></link>
  <script type="text/javascript" src="jquery/jquery-1.8.2.js"></script> -->
 <!--  <script type="text/javascript" src="jquery/My97DatePicker/WdatePicker.js"></script> -->
<link rel="stylesheet" href="/resource/bootstrap.css">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<form:form action="add" method="post" modelAttribute="goods" enctype="multipart/form-data">
		商品名称：<form:input path="name"/><br>
		商品品牌：<select name="bid" id="bid">
					
				</select><br>
		商品种类：<select name="tid" id="tid">
					
				</select><br>
		尺寸：<form:input path="chicun"/><br>
		单价：<form:input path="price"/><br>
		数量：<form:input path="num"/><br>
		标签：<form:input path="biaoqian"/><br>
		图片：<input type="file" name="file"><br>
		<form:button>添加</form:button>
		
	</form:form>
	<script type="text/javascript">
		$(function(){
			$.post("selbid",function(data){
				for ( var i in data) {
					$("#bid").append("<option value='"+data[i].id+"'>"+data[i].name+"</option>")
				}
			})
			$.post("seltid",function(data){
				for ( var i in data) {
					$("#tid").append("<option value='"+data[i].id+"'>"+data[i].name+"</option>")
				}
			})
		})
	</script>
</body>
</html>