/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ufps.dao;

import co.edu.ufps.connection.conexion;
import co.edu.ufps.dto.EmpresaAdscrita;
import co.edu.ufps.dto.Logro;
import co.edu.ufps.dto.Servicio;
import co.edu.ufps.dto.Servicio_Logro;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel Florez
 */
public class Servicio_LogroDAO {

    private Statement s = null;
    private conexion con = null;

    public Servicio_LogroDAO() {
        try {
            con = new conexion();
            // Preparamos la consulta
            s = con.getConnection().createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //carga el Servicio_Logro asignado al ide de la empresa adscrita
    public List<Servicio_Logro> consulta(EmpresaAdscrita e) {
        List<Servicio_Logro> l = new ArrayList<>();
        List<Logro> logros = new ArrayList();
        
        
        Servicio ser = new Servicio(1, "Importación");
        logros.add(new Logro(1, "Logro Bronce"));
        logros.add(new Logro(2, "Logro Plata"));
        //carga un servicio y la lista con los logros que estan asignados
        l.add(new Servicio_Logro(ser, logros));
        return l;
    }

    //asignar en la tabla servicio_logro
    /**
     *
     * @param id_servicio id del servicio
     * @param id_logro id del logro
     * @param e Empresa Adscrita que se le asignara el servicio y el logro
     */
    public void addServicio_Logro(String id_servicio, String id_logro, EmpresaAdscrita e) {

    }

}