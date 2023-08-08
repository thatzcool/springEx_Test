package com.multicampus.w1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="myServlet" , urlPatterns = "/my")
public class MyServlet extends HttpServlet {
    protected  void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
        // MySerlvet 텍스트 보여주고 싶소!
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>MySerlvet</h1>");
        out.println("</body></html>");


    }
}
