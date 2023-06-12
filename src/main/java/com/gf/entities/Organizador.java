/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.entities;

/**
 * Esta clase representa un organizador.
 */
public class Organizador {
    private int nOrganizador; // Número del organizador
    private int pagaReserva; // Monto que paga el organizador por la reserva
    private String nombre; // Nombre del organizador
    private int telefono; // Número de teléfono del organizador
    private String direccion; // Dirección del organizador
    private String nombreCumpleanero; // Nombre del cumpleañero

    /**
     * Crea una instancia de la clase Organizador.
     * 
     * @param nOrganizador      Número del organizador
     * @param pagaReserva       Monto que paga el organizador por la reserva
     * @param nombre            Nombre del organizador
     * @param telefono          Número de teléfono del organizador
     * @param direccion         Dirección del organizador
     * @param nombreCumpleanero Nombre del cumpleañero
     */
    public Organizador(int nOrganizador, int pagaReserva, String nombre, int telefono, String direccion, String nombreCumpleanero) {
        this.nOrganizador = nOrganizador;
        this.pagaReserva = pagaReserva;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombreCumpleanero = nombreCumpleanero;
    }

    /**
     * Obtiene el número del organizador.
     * 
     * @return Número del organizador
     */
    public int getNOrganizador() {
        return nOrganizador;
    }

    /**
     * Obtiene el monto que paga el organizador por la reserva.
     * 
     * @return Monto que paga el organizador por la reserva
     */
    public int getPagaReserva() {
        return pagaReserva;
    }

    /**
     * Obtiene el nombre del organizador.
     * 
     * @return Nombre del organizador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el número de teléfono del organizador.
     * 
     * @return Número de teléfono del organizador
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Obtiene la dirección del organizador.
     * 
     * @return Dirección del organizador
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Obtiene el nombre del cumpleañero.
     * 
     * @return Nombre del cumpleañero
     */
    public String getNombreCumpleanero() {
        return nombreCumpleanero;
    }
}


