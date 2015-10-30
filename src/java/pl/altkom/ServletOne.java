
package pl.altkom;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/one")
public class ServletOne extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("name");
        String response = "Przetworzone pozywnie dla " + user ;
        req.setAttribute("info", response);
        String action = "/index.jsp";
        if(user != null){
            if("Adam".equals(user)){
                action = "/myfolder/my.jsp";
            }
            if("Admin".equals(user)){
                action = "/myfolder/my2.jsp";
            }
        }
        req.getRequestDispatcher(action).forward(req, resp);
        
    }
    
}
