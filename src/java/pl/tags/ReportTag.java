/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tags;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author student
 */
public class ReportTag extends SimpleTagSupport{

    private String f;
    
    private String name;
    
    public void setFor(String f){
        this.f = f;
    }
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public void doTag() throws JspException, IOException {
        Collection<?> c = (Collection<?>)getJspContext().findAttribute(f);
        Class<?> clazz = null;
        Field[] fields = null;
        JspWriter out = getJspContext().getOut();
        out.print("<h2>"+name+"</h2>");
        out.print("<table class=\"table table-bordered\"> <thead>");
        for(Object row : c ){
            if(clazz == null){
                clazz = row.getClass();
                fields = clazz.getDeclaredFields();
                out.println("<tr>");
                for(Field field : fields){
                    field.setAccessible(true);
                    out.print("<th>"+field.getName()+"</th>");
                }
                out.println("</tr></thead><tbody>");
            }
            out.println("<tr>");
            for (Field field : fields){
                try {
                    out.print("<td>" + field.get(row) + "</td>");
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
            out.println("</tr>");
        }
        out.print("</tbody> </table> ");
    }
    
}
