package servlets;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;


public class ServletTask2 extends HttpServlet {
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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        handler(req, resp);
    }

    private void handler(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Hashtable<String, String> table = new Hashtable<>();
        table.put("Ivanov", "+375294798441");
        table.put("Smirnov", "+375446685217");
        table.put("Petrov", "+375336600688");

        String key = req.getParameter("key");
        String value = table.get(key);
        req.setAttribute("key", key);
        req.setAttribute("value", value);
        req.getRequestDispatcher("task2.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
