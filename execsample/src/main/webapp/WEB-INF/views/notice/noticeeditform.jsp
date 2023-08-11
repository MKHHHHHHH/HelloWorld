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
			<h1>글 수정</h1>
		</div>

		<div>
			<form id="frm" action="noticeedit.do" method="post"
				enctype="multipart/form-data">
				<div>
					<table border="1">
						<tr>
							<th>작성자</th>
							<td><input type="text" id="noticeWriter" name="noticeWriter"
								value="${n.noticeWriter}" readonly="readonly"></td>
							<th>작성일자</th>
							<td><input type="date" id="noticeDate" name="noticeDate"
								value="${n.noticeDate}"></td>
						</tr>
						<tr>
							<th>제목</th>
							<td colspan="3"><input type="text" id="noticeTitle"
								name="noticeTitle" size="84" value="${n.noticeTitle }"></td>
						</tr>
						<tr>
							<th>내용</th>
							<td><textarea rows="20" cols="80" id="noticeSubject"
									name="noticeSubject">${n.noticeSubject }</textarea></td>
						</tr>
						<tr>
							<td>첨부파일</td>
							<td><input type="text" name="noticeAttech" value="${n.noticeAttech }"></td>
							<td colspan="2"><input type="file" id="file" name="file">
							</td>
						</tr>
					</table>
				</div> <br>
				<div>
					<input type="submit" value="수정">
					<input type="button" onclick="location.href='noticelist.do'" value="취소">
				</div>
				<input type="hidden" id="noticeId" name="noticeId" value="${n.noticeId }">
				
			</form>
		</div>
	</div>
</body>
</html>