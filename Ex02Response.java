package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02Response")
public class Ex02Response extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// response(���䰴ü) : ����ڿ��� ��û����� ������ �� ����ϴ� ��ü
		// ���䵥���� : HTML�� ���� ����, �ؽ�Ʈ, �̹���, ���� ���� ��
		// ������ �̵�(redirect)
		
		// ���䵥������ ������ �����ϴ� �޼ҵ�
		// MINE Type : ������ ���� ����
		// ���ڵ� : ��ǻ�Ͱ� �ؼ��� �� �ֵ��� �������� ������ ����(EUC-KR, UTF-8)
		response.setContentType("text/html; charset=utf-8");
		
		// ����ڿ��� �����͸� �����ϱ� ���� ��ü����
		PrintWriter out =response.getWriter();
		
		// �������� ���� �� -> ������ ��! -> ������ �ڵ����� �ε�Ϸ�
		// -> �������� �̵��ؼ� F5(���ΰ�ħ) �ѹ� �ϸ� ���������� �ݿ���
		
		// Servers -> Tomcat ������ Ŭ�� -> Restart ��� Ȱ��
		// -> �������� �̵��ؼ� F5(���ΰ�ħ) �ѹ� �ϸ� ���������� �ݿ���
		out.print("<html>");
		out.print("<head><title>response ��ü</title></head>");
		out.print("<body>");
		out.print("<h1>Hi �� ��</h1>");
		out.print("</body>");
		out.print("</html>");
			
	}
	
}


// 59.0.236.207 �Ӹ��� ����
// 59.0.236.189 ������
// 211.48.228.6 ���ؼ�
// 220.80.203.88 �̵���
// 192.168.0.11 �̽���
// 220.93.229.187 �ڻ��
// 211.63.240.114 �ڰ���
// 222.102.104.24 ������
// 222.102.104.240 �ѱ���
// 59.0.236.117 ����
// 220.80.203.113 ����ȣ
// 59.0.124.155 ������
// 220.80.88.62 ���°�
// 211.228.61.202 �赿��
// 121.147.52.212 ������
// 192.168.0.11 �ڳ���
// 59.0.129.239 ������
// 211.33.239.153 �ǿ���
// 121.147.52.59 �ּ���
// 59.0.129.239 ������
// 210.183.87.89 ��μ�
// 59.0.129.237 ������
//