package fr.usmb.m2isc.javaee.comptes.web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.usmb.m2isc.javaee.comptes.ejb.Operation;
import fr.usmb.m2isc.javaee.comptes.jpa.Colis;
import fr.usmb.m2isc.javaee.comptes.jpa.Compte;

/**
 * Servlet utilisee pour enregister un colis.
 */
@WebServlet("/RegisterColisServlet")
public class RegisterColisServlet extends HttpServlet{

    private static final long serialVersionUID = 5236668439173484090L;
    @EJB
    private Operation op;


    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterColisServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String identifiant = request.getParameter("identifiant");
        String poidParameter= request.getParameter("poid");
        String name= request.getParameter("name");
        String origin = request.getParameter("origin");
        String destination = request.getParameter("destination");
        String latitude = request.getParameter("lat");
        String longitude = request.getParameter("lng");
        double poid = Double.parseDouble(poidParameter);
        double lat = Double.parseDouble(latitude);
        double lng = Double.parseDouble(longitude);

        Colis colis = op.registerColis(identifiant,poid,name,origin,destination,lat,lng);

        request.setAttribute("colis", colis);

        //response.getWriter().println("C'est fait");

        request.getRequestDispatcher("/DisplayColis.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
