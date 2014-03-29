package demo;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Irfan
 */

public class HerokuMain extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        PrintWriter out = resp.getWriter();

        out.write("Please wait.. running Observer Pattern... ");
        out.println("\n\n\n");
        out.println("---------------------------------------------------------");
        out.println("\n\n\n");
        {
            ObserverDemo.main(null);
        }
        out.flush();
        out.write("Please wait.. running Proxy Pattern... ");
        out.println("\n\n\n");
        out.println("---------------------------------------------------------");
        out.println("\n\n\n");
        {
            ProxyDemo.main(null);
        }
        out.flush();
    }

    public static void main(String[] args) throws Exception {
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new HerokuMain()), "/*");
        server.start();
        server.join();
    }
}