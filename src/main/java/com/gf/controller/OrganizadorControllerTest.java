/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.controller;

/**
 *
 * @author canmonal
 */
import org.junit.Test;
import com.gf.entities.Organizador;
import com.gf.view.vista;
import java.util.List;

public class OrganizadorControllerTest {

    @Test
    public void testInsertarOrganizador() {
        vista view = new vista();
        OrganizadorController controller = new OrganizadorController(view);
        Organizador organizador = new Organizador(0, 0, "Alejandro", 0, "C/ Agualuna", "Juan");        

        // Llamar al método de inserción del controlador
        controller.insertarOrganizador(organizador);      
    }

    @Test
    public void testEliminarOrganizador() {        
        vista view = new vista();
        OrganizadorController controller = new OrganizadorController(view);
        int nOrganizador = 1; // Número de organizador a eliminar

        // Llamar al método de eliminación del controlador
        controller.eliminarOrganizador(nOrganizador);
    }

    @Test
    public void testObtenerTodosLosOrganizadores() {        
        vista view = new vista();
        OrganizadorController controller = new OrganizadorController(view);

        // Llamo al método para obtener todos los organizadores
        List<Organizador> organizadores = controller.obtenerTodosLosOrganizadores();       
    }
}

