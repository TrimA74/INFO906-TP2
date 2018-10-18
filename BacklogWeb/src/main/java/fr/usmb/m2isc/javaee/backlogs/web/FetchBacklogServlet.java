package fr.usmb.m2isc.javaee.backlogs.web;


import fr.usmb.m2isc.javaee.backlogs.ejb.Operation;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet utilisee pour afficher un compte.
 */
@WebServlet("/FetchBacklogServlet")
public class FetchBacklogServlet {
    private static final long serialVersionUID = 1L;

    @EJB
    private Operation ejb;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchBacklogServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int agency_id = Integer.parseInt(request.getParameter("agency_id"));

        Agence a = ejb.getAgence(agency_id);
        Backlog b = ejb.getBacklog(a);

        request.setAttribute("backlog", b);

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
