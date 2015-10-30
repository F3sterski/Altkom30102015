
package pl.altkom;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/two")
public class ExtraFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        String name = req.getParameter("name");
        if("Adam".equals(name)){
            chain.doFilter(request, response);
        }
        else{
            response.getWriter().printf("Sory, to nie twój swiat");
        }
    }

    @Override
    public void destroy() {
        
    }
    
}
