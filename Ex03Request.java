package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03Request")
public class Ex03Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		String ip = request.getRemoteAddr();

		String name = "";
		if (ip.equals("59.0.236.207")) {
			name = "강사";
			// 59.0.236.207 임명진 강사
			// 59.0.236.189 강범수
			// 211.48.228.6 정준선
			// 220.80.203.88 이동윤
			// 192.168.0.11 이승훈
			// 220.93.229.187 박상민
			// 211.63.240.114 박건하
			// 222.102.104.24 문도연
			// 222.102.104.240 한국인
			// 59.0.236.117 지윤
			// 220.80.203.113 최찬호
			// 59.0.124.155 최종인
			// 220.80.88.62 김태경
			// 211.228.61.202 김동민
			// 121.147.52.212 김지은
			// 192.168.0.11 박나영
			// 59.0.129.239 임지원
			// 211.33.239.153 권우진
			// 121.147.52.59 최성규
			// 59.0.129.239 임지원
			// 210.183.87.89 장민서
			// 59.0.129.237 김혜정
		} else if (ip.equals("59.0.236.189")) {
			name = "강범수";
		} else if (ip.equals("211.48.228.6")) {
			name = "정준선";
		} else if (ip.equals("220.80.203.88")) {
			name = "이동윤";
		} else if (ip.equals("192.168.0.11")) {
			name = "이승훈";
		} else if (ip.equals("2220.93.229.187")) {
			name = "박상민";
		} else if (ip.equals("211.63.240.114")) {
			name = "박건하";
		} else if (ip.equals("222.102.104.24")) {
			name = "문도연";
		} else if (ip.equals("222.102.104.240")) {
			name = "한국인";
		} else if (ip.equals("220.80.203.113")) {
			name = "최찬호";
		} else if (ip.equals("59.0.124.155")) {
			name = "최종인";
		} else if (ip.equals("220.80.88.62")) {
			name = "김태경";
		} else if (ip.equals("211.228.61.202")) {
			name = "김동민";
		} else if (ip.equals("121.147.52.212")) {
			name = "김지은";
		} else if (ip.equals("192.168.0.11")) {
			name = "박나영";
		} else if (ip.equals("59.0.129.237")) {
			name = "김혜정";
		} else if (ip.equals("59.0.129.239")) {
			name = "임지원";
		} else if (ip.equals("211.33.239.153")) {
			name = "권우진";
		} else if (ip.equals("121.147.52.59")) {
			name = "최성규";
		} else if (ip.equals("210.183.87.89")) {
			name = "장민서";
		} else if (ip.equals("118.235.16.181")) {
			name = "이광일";
		} else if (ip.equals("223.39.241.189")) {
			name = "한대호호구";
		}
		System.out.println(name + "(" + ip + ")" + "(이)가 접속했습니다.");
		out.print("<html>");
		out.print("<head><title>Request & Response 실습</title></head>");
		out.print("<body>");
		out.print("<h1>귀한 곳에 누추하신 " + name + "님이...</h1>");
		out.print("</body>");
		out.print("</html>");

	}

}
