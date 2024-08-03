import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class GreetingServlet extends HttpServlet {
public GreetingServlet() {
super();
// TODO Auto-generated constructor stub
}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
//response.getWriter().append("Served at: ").append(request.getContextPath());
response.setContentType("text/html");
// Get username parameter from the request
String username = request.getParameter("username");
// Generate greeting message
String greetingMessage = "Hello " + (username != null ? username : "User") + ", How Are You?";
// Write greeting message to the response
response.getWriter().println("<html><body>");
response.getWriter().println("<h1>" + greetingMessage + "</h1>");
response.getWriter().println("</body></html>");
}
}