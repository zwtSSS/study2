<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
  <!-- <script type="text/javascript" src="jquery/My97DatePicker/WdatePicker.js"></script> -->
<link rel="stylesheet" href="/resource/bootstrap.css">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<form action="list" method="post">
	<input type="text" name="name" value="${goods.name }"><button>查询</button>
	<a href="toadd"><input type="button" value="添加"></a>
	<a><button type="button" onclick="pishan()">批量删除</button> </a>
		<table>
			<tr>
				<td><input type="checkbox" id="xuan" onclick="qx(this.checked)"></td>
				<td>商品名称</td>
				<td>商品品牌</td>
				<td>商品种类</td>
				<td>尺寸</td>
				<td>单价</td>
				<td>数量</td>
				<td>标签</td>
				<td>商品图片</td>
				<td></td>
				<td></td>
			</tr>
			<c:forEach items="${list }" var="g">
				<tr>
					<td><input type="checkbox" class="s" value="${g.id }"></td>
					<td>${g.name }</td>
					<td>${g.bname }</td>
					<td>${g.tname }</td>
					<td>${g.chicun }</td>
					<td>${g.price }</td>
					<td>${g.num }</td>
					<td>${g.biaoqian }</td>
					<td><img alt="" src="/pic/${g.pic }" height="100px" width="100px"> </td>
					<td>
						<a href="deletes?id=${g.id }">删除</a>
						<a href="toupdate?id=${g.id }">修改</a>
						<a href="xinxi?id=${g.id }">详细信息</a>
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="10">
					<button name="pageNum" value="1">首页</button>
					<button name="pageNum" value="${pg.prePage==0?1:pg.prePage }">上一页</button>
					<button name="pageNum" value="${pg.nextPage==0?pg.pages:pg.nextPage }">下一页</button>
					<button name="pageNum" value="${pg.pages }">尾页</button>
					第${pg.pageNum }页/共${pg.pages }页
				</td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		function qx(a){
			$(".s").attr("checked",a)
		}
		function pishan(){
			var id = $(".s:checked").map(function(){
				return this.value;
			}).get().join();
			if(confirm("确定要删除吗？")){
				$.post("deletes",{id:id},function(data){
					if(data>0){
						alert("删除成功");
						location="list";
					}else{
						alert("删除失败");
					}
				})
			}
		}
	</script>
</body>
</html>