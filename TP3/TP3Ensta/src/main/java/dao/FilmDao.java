package dao;

import model.*;
import ensta.utils.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class FilmDao 
{
    public Film get(int id_){

        String selectQuery = "SELECT titre, realizateur FROM film where id = ?";

        Connection connection = null;
        
        PreparedStatement insertPreparedStatement = null;

        String titre = null;
        String realisateur = null;

        Film film = null ;

        try {
           
            connection = EstablishConnection.getConnection();

            insertPreparedStatement = connection.prepareStatement(selectQuery);

            insertPreparedStatement.setString(0, id_+"");

            ResultSet result = insertPreparedStatement.executeQuery();

            if(result.next()){
                titre = result.getString(0);
                realisateur = result.getString(1);
            }
            
            if (titre != null)
            {
                film = new Film(id_, titre, realisateur);
            }
            
        } catch (SQLException e) {
            System.out.println("Exception Message " + e.getLocalizedMessage());
        }
         
        return film;
    }

    public ArrayList<Film> getAll(){
        
        String selectAllQuery = "SELECT * FROM film";
        Connection connection = null;
        PreparedStatement insertPreparedStatement = null;

        int id = 0;
        String titre = null;
		String realisateur = null;

        ArrayList<Film> film = new ArrayList<Film>();

        try {
           
            connection = EstablishConnection.getConnection();

            insertPreparedStatement = connection.prepareStatement(selectAllQuery);

            ResultSet result = insertPreparedStatement.executeQuery();

            while(result.next()){
                id = result.getInt(0);
                titre = result.getString(1);
                realisateur = result.getString(2);
                film.add(new Film(id, titre, realisateur));
            }
        } catch (SQLException e) {
            System.out.println("Exception Message " + e.getLocalizedMessage());
        }

		return film;
    }

    public void create(Film film_){

        String insertQuery = "INSERT INTO film" + "(titre, realisateur) values" + "(?,?)";
        Connection connection = null;
        PreparedStatement insertPreparedStatement = null;

        try {
            connection = EstablishConnection.getConnection();

            insertPreparedStatement = connection.prepareStatement(insertQuery);

            insertPreparedStatement.setString(0, film_.getTitre());
            insertPreparedStatement.setString(1, film_.getRealisateur());

            insertPreparedStatement.executeQuery();

        } catch (SQLException e) {
            System.out.println("Exception Message " + e.getLocalizedMessage());
        }
    }

    public void update(Film film_){

        String updateQuery = "UPDATE film SET titre = '?', realisateur = '?' WHERE id = ?";
        Connection connection = null;
        PreparedStatement insertPreparedStatement = null;

        try {

            connection = EstablishConnection.getConnection();
            insertPreparedStatement = connection.prepareStatement(updateQuery);

            insertPreparedStatement.setString(0, film_.getTitre());
            insertPreparedStatement.setString(1, film_.getRealisateur());
            insertPreparedStatement.setString(2, film_.getId()+"");
    
            insertPreparedStatement.executeQuery();

        } catch (SQLException e) {
            System.out.println("Exception Message " + e.getLocalizedMessage());
        }
    }

    public void delete(int id_){

        String deleteQuery = "DELETE FROM film WHERE id = ?";
        Connection connection = null;
        PreparedStatement insertPreparedStatement = null;


        try {
            connection = EstablishConnection.getConnection();

            insertPreparedStatement = connection.prepareStatement(deleteQuery);

            insertPreparedStatement.setString(2, id_+"");
    
            insertPreparedStatement.executeQuery();

        } catch (SQLException e) {
            System.out.println("Exception Message " + e.getLocalizedMessage());
        }
    }
}
