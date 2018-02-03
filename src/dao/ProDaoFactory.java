/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidad.Profesor;
import service.EntidadService;

/**
 *
 * @author DesktopN°1
 */
public class ProDaoFactory {
    public static EntidadService<Profesor> getClienteDao(){
        EntidadService<Profesor> servicio;
        servicio = new ProfesorARCDAO();
        return servicio;
        
    }
}
