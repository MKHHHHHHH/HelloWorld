package co.kh.execsample.notice.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.kh.execsample.common.ViewResolve;
import co.kh.execsample.notice.service.NoticeService;
import co.kh.execsample.notice.service.NoticeVO;
import co.kh.execsample.notice.serviceImpl.NoticeServiceImpl;

/**
 * Servlet implementation class NoticeEditForm
 */
@WebServlet("/noticeeditform.do")
public class NoticeEditForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeEditForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeService dao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		
		vo.setNoticeId(Integer.valueOf(request.getParameter("noticeId"))); // 폼에서 오는건 다 스트링이라 인티거를 붙여서 형변환 시켜줘야함
		vo = dao.noticeSelect(vo);
		request.setAttribute("n", vo); // n이라고 하고 보 객체를 실어보냄
		String viewName = "notice/noticeeditform";
		ViewResolve.forward(request, response, viewName);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
