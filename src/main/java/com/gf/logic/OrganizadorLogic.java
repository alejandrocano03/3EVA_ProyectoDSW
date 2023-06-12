/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.logic;

/**
 * Esta clase representa la lógica del organizador.
 */
import com.gf.dao.OrganizadorDAO;
import com.gf.entities.Organizador;

import java.util.List;

public class OrganizadorLogic {
    private OrganizadorDAO organizadorDAO;

    /**
     * Crea una instancia de la clase OrganizadorLogic e inicializa el OrganizadorDAO.
     */
    public OrganizadorLogic() {
        this.organizadorDAO = new OrganizadorDAO();
    }

    /**
     * Inserta un organizador en la base de datos.
     * 
     * @param organizador El organizador a insertar
     */
    public void insertarOrganizador(Organizador organizador) {
        organizadorDAO.insertarOrganizador(organizador);
    }

    /**
     * Elimina un organizador de la base de datos.
     * 
     * @param nOrganizador El número del organizador a eliminar
     */
    public void eliminarOrganizador(int nOrganizador) {
        organizadorDAO.eliminarOrganizador(nOrganizador);
    }

    /**
     * Obtiene todos los organizadores de la base de datos.
     * 
     * @return Una lista con todos los organizadores
     */
    public List<Organizador> obtenerTodosLosOrganizadores() {
        return organizadorDAO.obtenerTodosLosOrganizadores();
    }
}



