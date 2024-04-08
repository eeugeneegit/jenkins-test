package servlets;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ServletTask1 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

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
        //wordSearch(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        wordSearch(req, resp);
    }

    private void wordSearch(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        File file = new File("C:\\Users\\Lenovo\\Desktop\\mytext.txt");
        FileInputStream inputStream = new FileInputStream(file);
        StringBuilder text = new StringBuilder();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            text.append(new String(buffer, 0, bytesRead));
        }
        inputStream.close();
        String find_word = req.getParameter("find-word");
        String text1 = text.toString().replaceAll(find_word, "");
        int result = (text.length() - text1.length()) / find_word.length();
        req.setAttribute("result", result);
        req.getRequestDispatcher("task1.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
