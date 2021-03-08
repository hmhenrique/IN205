package ui;

import dao.*;
import model.*;
import ensta.utils.*;


public class Servlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        switch (action) {
            case "/new":
                showAddForm(request, response);
                break;
            case "/insert":
                insert(request, response);
                break;
            case "/delete":
                delete(request, response);
                break;
            case "/edit":
                showEditForm(request, response);
                break;
            case "/update":
                update(request, response);
                break;
            case "/list":
                showAllFilm(request, response);
                break;
        }
    
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    

    public Servlet(){

    }

    public void showAddForm(HttpServletRequest request, HttpServletResponse response){
        
    }

    public void delete(HttpServletRequest request, HttpServletResponse response){
        response.sendRedirect("list");
    }

    public void showEditForm(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher dispatcher = request.getRequestDispatcher("FilmForm.jsp");
        request.setAttribute("film", film);
        dispatcher.forward(request, response);  
    }

    public void update(HttpServletRequest request, HttpServletResponse response){
        request.getParameter("realisateur");
    }

    public void showAllFilm(HttpServletRequest request, HttpServletResponse response){

    }

}