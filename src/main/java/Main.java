import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 * Created by ganku on 6/4/17.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Server server = new Server(7070);
        ServletContextHandler handler = new ServletContextHandler(server, "");
        handler.addServlet(ExampleServlet.class, "/abc");
        server.start();
    }

}
