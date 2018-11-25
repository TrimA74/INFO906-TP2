package fr.usmb.m2isc.javaee.backlogs.web;

import fr.usmb.m2isc.javaee.backlogs.ejb.Operation;
import fr.usmb.m2isc.javaee.backlogs.jpa.Comment;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ViewEntryCommentsServlet")
public class ViewEntryCommentsServlet extends HttpServlet {

    @EJB
    private Operation ejb;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long entry_id = Long.parseLong(req.getParameter("entry_id"));
        List<Comment> comments = ejb.getCommentsByEntryId(entry_id);
        req.setAttribute("comments",comments);

        req.getRequestDispatcher("/display_comments.jsp").forward(req, resp);


        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
