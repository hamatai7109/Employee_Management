<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ page import="java.sql.Connection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>従業員フォーム</title>
</head>
<body>
<h1 style="text-align: center;">従業員登録フォーム</h1>
<form style="text-align: center;" action="employee-register" method="post">
	<div>
		<label>氏名（姓）
			<input type="text" name="lastName" placeholder="山田" required>	
		</label>
	</div>
	<div>
		<label>氏名（名）
			<input type="text" name="firstName" placeholder="太郎" required>	
		</label>
	</div>
	<div>
		<label>性別</label>
	    <label>
   			<input type="radio" name="gender" value="m" />
	    	男
	    </label>
	    <label>
    		<input type="radio" name="gender" value="f" />
	    	女
	    </label>
	</div>
	<div>
		<label>生年月日
			<input type="text" name="birthday" placeholder="19910105" required>	
		</label>
	</div>
	<div>
		<label>電話番号
			<input type="text" name="phoneNumber" placeholder="08012345678" required>	
		</label>
	</div>
	<div>
		<label>部署
			<select name="sectionCode">
				<option value="サンプル1">サンプル1</option>
				<option value="サンプル2">サンプル2</option>
				<option value="サンプル3">サンプル3</option>
			</select>
		</label>
	</div>
	<div>
		<label>経験言語
			<select name="languageCode">
				<option value="サンプル1">サンプル1</option>
				<option value="サンプル2">サンプル2</option>
				<option value="サンプル3">サンプル3</option>
			</select>
		</label>
	</div>
	<div>
		<label>入社日
			<input type="text" name="hireDate" placeholder="20220401" required>	
		</label>
	</div>
	<div>
		<input type="submit" value="従業員登録確定">
		<input type="reset" value="クリア">		
	</div>
	<button style="margin-top: 50px;" onclick="location.href='menu.jsp'">メニュー画面へ</button>
</form>
</body>
</html>