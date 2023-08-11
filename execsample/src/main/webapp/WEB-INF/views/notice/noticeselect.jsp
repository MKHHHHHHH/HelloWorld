<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>글 보기</h1>
		</div>

		<div>
			<table border="1">
				<tr>
					<th>작성자</th>
					<td align="center">${n.noticeWriter }</td>
					<th>작성일자</th>
					<td>${n.noticeDate }</td>
					<th>조회수</th>
					<td>${n.noticeHit }</td>
				</tr>
				<tr>
					<th>제목</th>
					<td colspan="4">${n.noticeTitle }</td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea rows="20" cols="80">${n.noticeSubject }</textarea></td>
				</tr>
			</table>
		</div>
	</div>

	<div>
		<c:if test="${name eq n.noticeWriter }">
			<button type="button" onclick="noticeUpdate('E')">수정</button> &nbsp;&nbsp;&nbsp;
				<button type="button" onclick="noticeUpdate('D')">삭제</button> &nbsp;&nbsp;&nbsp;
			</c:if>
		<button type="button" onclick="location.href='noticelist.do'">목록</button>
	</div>


	<div>
		<form id="frm" method="post">
			<input type="hidden" id="noticeId" name="noticeId"
				value="${n.noticeId }">
		</form>
	</div>

	<script type="text/javascript">
		function noticeUpdate(str) {
			if (str == 'E') {
				document.getElementById("frm").action = "noticeeditform.do";
			} else {
				document.getElementById("frm").action = "noticedelete.do";
			}
			document.getElementById("frm").submit();
		}
	</script>

</body>
</html>

