
package HomeWork_22;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

    public class HelloServlet extends HttpServlet {
        public HelloServlet() {
        }
@Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String html = "<HTML><HEAD><TITLE>fIRST PAGE</TITLE></HEAD><BODY><H1> Hello World!</H1></BODY></HTML>";
            PrintWriter writer = resp.getWriter();
            writer.println(html);
        }


    }

