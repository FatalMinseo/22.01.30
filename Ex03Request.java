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
			name = "����";
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
		} else if (ip.equals("59.0.236.189")) {
			name = "������";
		} else if (ip.equals("211.48.228.6")) {
			name = "���ؼ�";
		} else if (ip.equals("220.80.203.88")) {
			name = "�̵���";
		} else if (ip.equals("192.168.0.11")) {
			name = "�̽���";
		} else if (ip.equals("2220.93.229.187")) {
			name = "�ڻ��";
		} else if (ip.equals("211.63.240.114")) {
			name = "�ڰ���";
		} else if (ip.equals("222.102.104.24")) {
			name = "������";
		} else if (ip.equals("222.102.104.240")) {
			name = "�ѱ���";
		} else if (ip.equals("220.80.203.113")) {
			name = "����ȣ";
		} else if (ip.equals("59.0.124.155")) {
			name = "������";
		} else if (ip.equals("220.80.88.62")) {
			name = "���°�";
		} else if (ip.equals("211.228.61.202")) {
			name = "�赿��";
		} else if (ip.equals("121.147.52.212")) {
			name = "������";
		} else if (ip.equals("192.168.0.11")) {
			name = "�ڳ���";
		} else if (ip.equals("59.0.129.237")) {
			name = "������";
		} else if (ip.equals("59.0.129.239")) {
			name = "������";
		} else if (ip.equals("211.33.239.153")) {
			name = "�ǿ���";
		} else if (ip.equals("121.147.52.59")) {
			name = "�ּ���";
		} else if (ip.equals("210.183.87.89")) {
			name = "��μ�";
		} else if (ip.equals("118.235.16.181")) {
			name = "�̱���";
		} else if (ip.equals("223.39.241.189")) {
			name = "�Ѵ�ȣȣ��";
		}
		System.out.println(name + "(" + ip + ")" + "(��)�� �����߽��ϴ�.");
		out.print("<html>");
		out.print("<head><title>Request & Response �ǽ�</title></head>");
		out.print("<body>");
		out.print("<h1>���� ���� �����Ͻ� " + name + "����...</h1>");
		out.print("</body>");
		out.print("</html>");

	}

}
