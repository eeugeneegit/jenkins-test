package servlets;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ServletTask3 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        handler(req, resp);
    }

    private void handler(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String linesNumber = req.getParameter("lines-number");
        String fontSize = req.getParameter("font-size");
        String text = "Hello, worlddd";
        req.setAttribute("text", text);
        req.setAttribute("fontSize", fontSize);
        req.getRequestDispatcher("task3.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
