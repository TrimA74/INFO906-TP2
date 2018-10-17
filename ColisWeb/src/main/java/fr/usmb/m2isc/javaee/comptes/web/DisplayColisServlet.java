package fr.usmb.m2isc.javaee.comptes.web;

import fr.usmb.m2isc.javaee.comptes.ejb.Operation;
import fr.usmb.m2isc.javaee.comptes.jpa.Colis;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet utilisee pour afficher un colis.
 */
@WebServlet("/DisplayColisServlet")
public class DisplayColisServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB
    private Operation ejb;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayColisServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("identifiant");

        Colis colis = ejb.getColis(num);

        request.setAttribute("colis", colis);

        request.getRequestDispatcher("/DisplayColis.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
