/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;

/**
 *
 * @author DesktopN°1
 */
public interface EntidadService<T> {
    public int crearEntidad(T t);
    public int eliminarEntidad(int codigo);
    public int actualizarEntidad(T t);
    public List<T> obtenerEntidades();
    public T buscarEntidad(int codigo);
    public List<T> mostrarPrimerElemento();
    public boolean todosMas2500();
    public List<T> mas1500Menos40NoA();
    public List<Integer> sueldoBrutoAnual();
    public double promedioMayor40();
    
}
