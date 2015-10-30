
package pl.altkom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pl.model.Person;


@WebServlet("/person")
public class PersonServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getSession().setAttribute("persons", Arrays.asList(new Person("Adam","Zielke","dom"), new Person("Klaudia","Kosiek","dom2")));
        req.getRequestDispatcher("/myfolder/person.jsp").forward(req, resp);
    }
    
}
