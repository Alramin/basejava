package ru.javawebinar.webapp.web;

import ru.javawebinar.webapp.Config;
import ru.javawebinar.webapp.storage.FileStorage;
import ru.javawebinar.webapp.storage.IStorage;
import ru.javawebinar.webapp.storage.XmlFileStorage;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * GKislin
 * http://javawebinar.ru/basejava/
 */
public class ResumeServlet extends HttpServlet {
    private IStorage storage;

 //   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

 //   }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("post");
        System.out.println(req.getParameter("uuid"));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException
    {
/*
        Writer w = response.getWriter();
        String name = request.getParameter("name");
        response.setCharacterEncoding("UTF-8");
        w.write("Hello " + name);
        w.close();
*/
      //  request.setAttribute("resumeList", storage.getAllSorted());
     //   request.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(request, response);

     //********************************************************************************************************************

        String uuid = request.getParameter("uuid");
        String action = request.getParameter("action");

        if (action != null)
        {
            if (action.equals("delete"))
            {
                storage.delete(uuid);
            }
            else
            {
            request.setAttribute("resume", storage.load(uuid));
            if (action.equals("edit"))
            {
                request.getRequestDispatcher("/WEB-INF/jsp/edit.jsp").forward(request, response);

            }
                else if (action.equals("view"))
                {
                    request.getRequestDispatcher("/WEB-INF/jsp/resume.jsp").forward(request, response);
                }
             }


        }

        if (action != null || uuid != null) {
         //   response.sendRedirect("/resume");
        } else {
            request.setAttribute("resumeList", storage.getAllSorted());
            request.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(request, response);
        }

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        storage = new FileStorage(Config.STORAGE, new XmlFileStorage());
    }
}


