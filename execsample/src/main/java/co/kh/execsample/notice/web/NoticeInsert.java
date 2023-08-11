package co.kh.execsample.notice.web;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.kh.execsample.common.ViewResolve;
import co.kh.execsample.notice.service.NoticeService;
import co.kh.execsample.notice.service.NoticeVO;
import co.kh.execsample.notice.serviceImpl.NoticeServiceImpl;

/**
 * Servlet implementation class NoticeInsert
 */
@WebServlet("/noticeinsert.do")
public class NoticeInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NoticeInsert() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		NoticeService dao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		String saveDir = getServletContext().getRealPath("attech/notice/");
		int sizeLimit = 100 * 1024 * 1024;

		MultipartRequest multi = new MultipartRequest(request, saveDir, sizeLimit, "utf-8",
				new DefaultFileRenamePolicy());

		String orignalFiel = multi.getOriginalFileName("file");
		if (orignalFiel != null) {
			String fileName = multi.getFilesystemName("file");
			vo.setNoticeAttech(orignalFiel);
			vo.setNoticeAttechDir(saveDir + fileName);
		}

		vo.setNoticeWriter(multi.getParameter("noticeWriter"));
		vo.setNoticeDate(LocalDate.parse(multi.getParameter("noticeDate")));
		vo.setNoticeTitle(multi.getParameter("noticeTitle"));
		vo.setNoticeSubject(multi.getParameter("noticeSubject"));

		int n = dao.noticeInsert(vo);
		if (n == 1) {
			request.setAttribute("message", "게시글이 정상적으로 등록완료");
		} else {
			request.setAttribute("message", "실패");
		}

		String viewName = "notice/noticemessage";
		ViewResolve.forward(request, response, viewName);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
