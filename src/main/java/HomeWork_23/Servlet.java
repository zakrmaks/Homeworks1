package HomeWork_23;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
    public Servlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String html = "<HTML><HEAD><TITLE>fIRST PAGE</TITLE></HEAD><BODY><H1> Hello World! (It's GET request </H1></BODY></HTML>";
        PrintWriter writer = resp.getWriter();
        writer.println(html);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        String html = "<HTML><HEAD><TITLE>fIRST PAGE</TITLE></HEAD><BODY><H1> Hello World! (It's POST request </H1></BODY></HTML>";
        PrintWriter writer = resp.getWriter();
        writer.println(html);
    }
}

