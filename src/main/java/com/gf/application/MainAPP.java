/**
 * Haz clic en nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
 * Haz clic en nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
 */
package com.gf.application;

import com.gf.controller.OrganizadorController;
import com.gf.view.vista;

/**
 * La clase MainAPP es responsable de iniciar la aplicación.
 * Crea una instancia de la vista y del controlador, y establece el controlador
 * para la vista. Finalmente, hace visible la vista.
 * 
 * @author canmonal
 */
public class MainAPP {

    /**
     * El método main es el punto de entrada de la aplicación.
     * Crea una instancia de la vista y del controlador, y establece el controlador
     * para la vista. Finalmente, hace visible la vista.
     * 
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        vista view = new vista();                
        OrganizadorController controller = new OrganizadorController(view);
        view.setController(controller);
        view.setVisible(true);
    }

}

