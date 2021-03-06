package fr.usmb.m2isc.javaee.backlogs.web;

import fr.usmb.m2isc.javaee.backlogs.ejb.Operation;
import fr.usmb.m2isc.javaee.backlogs.jpa.Agence;
import fr.usmb.m2isc.javaee.backlogs.jpa.Backlog;
import fr.usmb.m2isc.javaee.backlogs.jpa.Entry;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet utilisee pour afficher un compte.
 */
@WebServlet("/DeleteBacklogEntryServlet")
public class DeleteBacklogEntryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB
    private Operation ejb;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBacklogEntryServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long entry_id = Long.parseLong(request.getParameter("entry_id"));
        Long backlog_id = Long.parseLong(request.getParameter("backlog_id"));

        ejb.deleteEntry(entry_id, backlog_id);

        Backlog backlog = ejb.getBacklogById(backlog_id);

        String message = "L'entrée " + entry_id + " a bien été supprimée.";
        request.setAttribute("notification_success",true);
        request.setAttribute("message",message);
        request.setAttribute("entries",backlog.getEntries());
        request.setAttribute("backlog_id",backlog_id);

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
