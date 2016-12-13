package co.edu.ufps.dao;

import co.edu.ufps.connection.conexion;
import co.edu.ufps.dto.EmpresaAdscrita;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Clair
 */
public class EmpresaAdscritaDAO {

    private Statement s = null;
    private conexion con = null;

    public EmpresaAdscritaDAO() {
        try {
            con = new conexion();
            // Preparamos la consulta
            s = con.getConnection().createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean RegistrarEmpresaAdscrtita(EmpresaAdscrita emp) {
        boolean respuesta = false;
        try {
            respuesta = s.execute("INSERT INTO `Empresaads`( `ads_nombreEmpresa`, `ads_nombreGerente`, `ads_email`, `ads_paginaWeb`,"
                    + " `ads_telefono`) VALUES (\'" + emp.getNombre_empresa() + "\',\'" + emp.getNombre_gerente() + "\',\'" + emp.getEmail() + "\',"
                    + "\'" + emp.getSitio_web() + "\',\'" + emp.getTelefono() + "\');");
        } catch (SQLException ex) {
            Logger.getLogger(EmpresaAdscritaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return respuesta;
    }

    public List<EmpresaAdscrita> mostrarEmpresasAdscritas(int cantidad) {
        ArrayList lista = new ArrayList();
        try {
            ResultSet rs = s.executeQuery("SELECT * FROM `Empresaads` order by `ads_nombreEmpresa` asc limit " + cantidad + "," + (cantidad + 10) + ";");
            EmpresaAdscrita emp = null;

            while (rs.next()) {
                emp = new EmpresaAdscrita(rs.getString("ads_nombreEmpresa"), rs.getString("ads_nombreGerente"), rs.getString("ads_email"),
                        rs.getString("ads_telefono"), rs.getString("ads_paginaWeb"));
                lista.add(emp);
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmpresaAdscritaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    //Busquedas.
    public List<EmpresaAdscrita> buscarEmpresaAdscrita(String tipoBusqueda, String valorBuscado, int cantidad) {
        ArrayList lista = new ArrayList();
        try {
            ResultSet rs = null;
            if (tipoBusqueda.equals("nombre_empresa")) {
                rs = s.executeQuery("SELECT * FROM `Empresaads` where `ads_nombreEmpresa` like \"e%\" order by `ads_nombreEmpresa`"
                        + " asc limit " + cantidad + "," + (cantidad + 10) + ";");
            } else if (tipoBusqueda.equals("")) {

            }
            EmpresaAdscrita emp = null;

            while (rs.next()) {
                emp = new EmpresaAdscrita(rs.getString("ads_nombreEmpresa"), rs.getString("ads_nombreGerente"), rs.getString("ads_email"),
                        rs.getString("ads_telefono"), rs.getString("ads_paginaWeb"));
                lista.add(emp);
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmpresaAdscritaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
}