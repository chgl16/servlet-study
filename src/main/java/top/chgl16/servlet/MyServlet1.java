package top.chgl16.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Lin 2018-5-31
 * 测试Servlet的生命周期
 */
public class MyServlet1 extends HttpServlet {
    public MyServlet1() {
        System.out.println("调用了Servlet的构造函数");
    }

    @Override
    public void init() {
        System.out.println("调用了init函数");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("调用service方法");
        doPost(req, resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("调用了doGet方法");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("调用了doPost方法");
        // <a>便签和<form>便签都跳转到这里了
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
//        out.write("hello");

        // 获取表单数据
        String introduction = req.getParameter("introduction");
        System.out.println("introduction:" + introduction);

        String submit = req.getParameter("submit");
        System.out.println("submit: " + submit);

        resp.sendRedirect("/pages/jump.html");   // 前面需要加'/'
    }

    @Override
    public void destroy() {
        System.out.println("调用了destroy方法");
    }

}
