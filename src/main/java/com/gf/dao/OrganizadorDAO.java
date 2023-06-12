/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.dao;

/**
 *
 * La clase OrganizadorDAO proporciona métodos para interactuar con la base de datos en relación con los organizadores.
 * Permite insertar organizadores, eliminar organizadores y obtener todos los organizadores almacenados en la base de datos.
 * Utiliza la clase ConectarBD para establecer y cerrar la conexión con la base de datos.
 * 
 * author canmonal
 */
import com.gf.entities.Organizador;
import com.gf.resources.ConectarBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrganizadorDAO {
    /**
     * Inserta un nuevo organizador en la base de datos.
     * 
     * @param organizador el organizador a insertar
     */
    public void insertarOrganizador(Organizador organizador) {
        try (Connection connection = ConectarBD.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "INSERT INTO ORGANIZADOR (N_ORGANIZADOR, PAGA_RESERVA, NOMBRE, TELEFONO, DIRECCION, NOMBRE_CUMPLEANERO) " +
                             "VALUES (?, ?, ?, ?, ?, ?)"
             )) {
            statement.setInt(1, organizador.getNOrganizador());
            statement.setInt(2, organizador.getPagaReserva());
            statement.setString(3, organizador.getNombre());
            statement.setInt(4, organizador.getTelefono());
            statement.setString(5, organizador.getDireccion());
            statement.setString(6, organizador.getNombreCumpleanero());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
    }

    /**
     * Elimina un organizador de la base de datos según el número de organizador especificado.
     * 
     * @param nOrganizador el número del organizador a eliminar
     */
    public void eliminarOrganizador(int nOrganizador) {
        try (Connection connection = ConectarBD.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "DELETE FROM ORGANIZADOR WHERE N_ORGANIZADOR = ?"
             )) {
            statement.setInt(1, nOrganizador);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
    }

    /**
     * Obtiene todos los organizadores almacenados en la base de datos.
     * 
     * @return una lista de todos los organizadores
     */
    public List<Organizador> obtenerTodosLosOrganizadores() {
        List<Organizador> organizadores = new ArrayList<>();

        try (Connection connection = ConectarBD.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM ORGANIZADOR")) {

            while (resultSet.next()) {
                int nOrganizador = resultSet.getInt("N_ORGANIZADOR");
                int pagaReserva = resultSet.getInt("PAGA_RESERVA");
                String nombre = resultSet.getString("NOMBRE");
                int telefono = resultSet.getInt("TELEFONO");
                String direccion = resultSet.getString("DIRECCION");
                String nombreCumpleanero = resultSet.getString("NOMBRE_CUMPLEANERO");

                Organizador organizador = new Organizador(nOrganizador, pagaReserva, nombre, telefono, direccion, nombreCumpleanero);
                organizadores.add(organizador);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            
        }

        return organizadores;
    }
}

