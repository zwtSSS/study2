<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  <script type="text/javascript" src="jquery/My97DatePicker/WdatePicker.js"></script>
<link rel="stylesheet" href="/resource/css/index_work.css">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
</head>
<body>
	商品名称：${goods.name }<br>
	商品品牌：${goods.bname }<br>
	商品种类：${goods.tname }<br>
	尺寸：${goods.chicun }<br>
	单价：${goods.price }<br>
	数量：${goods.num }<br>
	标签：${goods.biaoqian }<br>
	商品图片：<img alt="" src="/pic/${goods.pic }" height="100px" width="100px"><br>
	<a href="list"><button>返回列表</button></a>
</body>
</html>