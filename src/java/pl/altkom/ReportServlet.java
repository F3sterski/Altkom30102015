
package pl.altkom;

import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pl.model.Expense;
import pl.model.Person;

@WebServlet("/report")
public class ReportServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("persons", 
                Arrays.asList(new Person("Adam","Zielke","Gdansk"), new Person("Klaudia","Kosiek","Gdansk")));
        req.setAttribute("expenses", 
                Arrays.asList(new Expense("563","bread",1000,new Date()), new Expense("564","fork",100,new Date()),new Expense("565","table",1050,new Date())));
        req.getRequestDispatcher("myfolder/reports.jsp").forward(req, resp);
    }
}
