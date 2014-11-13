package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by szymon on 10.11.14.
 */

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {
        // Very simple - just return some plain text
        PrintWriter writer = response.getWriter();
        writer.print("Hello World. My name is Simon!");
    }
}
