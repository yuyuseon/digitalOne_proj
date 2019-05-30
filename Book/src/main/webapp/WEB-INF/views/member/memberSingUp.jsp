<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
 	<%@ include file="/resources/common/commonHead.jsp" %>
</head>

<body class="index-page sidebar-collapse">
	<%@ include file="/resources/common/commonTop.jsp" %>
	<div class="page-header header-filter clear-filter purple-filter" data-parallax="true">
	    <div class="container" >
	      <div class="row" style="text-align: center;">
	        <div class="col-md-4 ml-auto mr-auto text-center" style="text-align: center;">
	            <h1>Login</h1>
	            <input type="text" class="form-control"  placeholder="아이디">
	           	<input type="password" class="form-control" placeholder="비밀번호" >
	           	<br/>
	           	<span>
		           	<button class="btn btn-primary btn-lg" style="text-align: center;">Login</button>
		           	<button class="btn">회원 가입</button>
	           	</span>
	        </div>
	      </div>
	      
	    </div>
  	</div>
	<%@ include file="/resources/common/commonFooter.jsp" %>
	
	
	<%@ include file="/resources/common/commonScript.jsp" %>
</body>

</html>
