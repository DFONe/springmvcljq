<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="main">
		<div class="newcontainer" id="course_intro">
		  <form name="mainForm" action="<%= request.getContextPath()%>/courses/view" method="post">
		    <div>
		       <span>课程编号:</span><input type="text" id="title" name="courseId">
		    </div>
		    <div>
		       <span>课程名:  </span><input type="text" id="title" name="courseNa">
		    </div>
		    <div>
		       <input type="submit" id="btnPass" value="提交" />
		    </div> 
		  </form>
		</div>
	</div>
</body>
</html>