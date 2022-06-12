package java.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Hector on 6/12/22.
 */
@WebServlet(name = "DisplayProductDetailsServlet")
public class DisplayProductDetailsServlet extends HttpServlet {

    private static final long serialVersionUID = 8837529580879289536L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
