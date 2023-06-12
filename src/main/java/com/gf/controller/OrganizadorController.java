/**
 * Haz clic en nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
 * Haz clic en nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
 */
package com.gf.controller;

import com.gf.entities.Organizador;
import com.gf.logic.OrganizadorLogic;
import com.gf.view.vista;
import java.util.List;

import javax.swing.*;

/**
 * La clase OrganizadorController es responsable de controlar las interacciones entre la vista y la lógica
 * relacionadas con los organizadores. Actúa como intermediario entre la vista y la lógica de negocio.
 * Se encarga de realizar operaciones como insertar organizadores, eliminar organizadores y obtener todos los organizadores.
 * También se encarga de iniciar la vista de la aplicación.
 * 
 * @author canmonal
 */
public class OrganizadorController {
    //Atributos
    /*
    * Variable view para crear la vista    
    * @param view
    */
    private final vista view;
    /*
    * Variable Logic para crear OrganizadorLogic 
    * @param logic
    */
    private final OrganizadorLogic logic;

    /**
     * Constructor de la clase OrganizadorController.
     * Inicializa la vista y la lógica del organizador.
     * 
     * @param view la vista del organizador
     */
    public OrganizadorController(vista view) {
        this.view = view;
        this.logic = new OrganizadorLogic();
    }

    /**
     * Inserta un nuevo organizador en la base de datos.
     * Después de insertar el organizador, se puede agregar lógica adicional.
     * 
     * @param organizador el organizador a insertar
     */
    public void insertarOrganizador(Organizador organizador) {
        logic.insertarOrganizador(organizador);        
    }

    /**
     * Elimina un organizador de la base de datos según el número de organizador especificado.
     * Después de eliminar el organizador, se puede agregar lógica adicional.
     * 
     * @param nOrganizador el número del organizador a eliminar
     */
    public void eliminarOrganizador(int nOrganizador) {
        logic.eliminarOrganizador(nOrganizador);        
    }

    /**
     * Obtiene todos los organizadores almacenados en la base de datos.
     * 
     * @return una lista de todos los organizadores
     */
    public List<Organizador> obtenerTodosLosOrganizadores() {
        return logic.obtenerTodosLosOrganizadores();
    }

    /**
     * Inicia la vista de la aplicación.
     * Utiliza SwingUtilities.invokeLater() para asegurar que la operación se ejecute en el hilo de eventos de Swing.
     */
    public void iniciar() {
        SwingUtilities.invokeLater(() -> {            
            view.setVisible(true);
        });
    }
}



