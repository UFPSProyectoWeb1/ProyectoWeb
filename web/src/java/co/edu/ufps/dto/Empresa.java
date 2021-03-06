package co.edu.ufps.dto;

import java.util.Date;

/**
 *
 * @author Clair
 */
public class Empresa {

    private String emp_consecutivo,
            emp_fecha,
            emp_asesor,
            emp_clasCliente,
            emp_cc,
            emp_nombre;
    private int emp_nit;
    private String emp_nombreRepLegal,
            emp_constitucionLegal,
            emp_otraConstitucion,
            emp_fechaConstitucion,
            emp_noEmpleadoTC,
            emp_noEmpleadoMT,
            emp_noEmpleadoDirectos,
            emp_noEmpleadoIndirectos,
            emp_direccion,
            emp_ciudad,
            emp_telefono,
            emp_celular,
            emp_emailEmpresa,
            emp_urlWebsite,
            emp_tipo, //Solo indsutria y comercio
            emp_tipoVenta, //Con relacion a "emp_tipo" ya que dice el tipo de venta de comercio, debe de ir en un combo
            emp_registroMercantil, //si o no
            emp_numRegistroMercantil,
            emp_ultimoAnioRenovacion, //fecha de renovación.
            emp_codigoCIIU,
            emp_actividadInternacional, //Con un combo
            emp_paisesComercio, //Quiza un multi combochoise
            emp_negocioWeb, //si o no 
            emp_productoServicio, //Multichoise
            emp_medioCDE, //Multichoise
            emp_observaciones;

    public Empresa() {
    }

    public Empresa(String emp_consecutivo, String emp_fecha, String emp_asesor, String emp_clasCliente, String emp_cc, String emp_nombre,
            int emp_nit, String emp_nombreRepLegal, String emp_constitucionLegal, String emp_otraConstitucion, String emp_fechaConstitucion,
            String emp_noEmpleadoTC, String emp_noEmpleadoMT, String emp_noEmpleadoDirectos, String emp_noEmpleadoIndirectos,
            String emp_direccion, String emp_ciudad, String emp_telefono, String emp_celular, String emp_emailEmpresa, String emp_urlWebsite,
            String emp_tipo, String emp_tipoVenta, String emp_registroMercantil, String emp_numRegistroMercantil, String emp_ultimoAnioRenovacion,
            String emp_codigoCIIU, String emp_actividadInternacional, String emp_paisesComercio, String emp_negocioWeb,
            String emp_productoServicio, String emp_medioCDE, String emp_observaciones) {
        this.emp_consecutivo = emp_consecutivo;
        this.emp_fecha = emp_fecha;
        this.emp_asesor = emp_asesor;
        this.emp_clasCliente = emp_clasCliente;
        this.emp_cc = emp_cc;
        this.emp_nombre = emp_nombre;
        this.emp_nit = emp_nit;
        this.emp_nombreRepLegal = emp_nombreRepLegal;
        this.emp_constitucionLegal = emp_constitucionLegal;
        this.emp_otraConstitucion = emp_otraConstitucion;
        this.emp_fechaConstitucion = emp_fechaConstitucion;
        this.emp_noEmpleadoTC = emp_noEmpleadoTC;
        this.emp_noEmpleadoMT = emp_noEmpleadoMT;
        this.emp_noEmpleadoDirectos = emp_noEmpleadoDirectos;
        this.emp_noEmpleadoIndirectos = emp_noEmpleadoIndirectos;
        this.emp_direccion = emp_direccion;
        this.emp_ciudad = emp_ciudad;
        this.emp_telefono = emp_telefono;
        this.emp_celular = emp_celular;
        this.emp_emailEmpresa = emp_emailEmpresa;
        this.emp_urlWebsite = emp_urlWebsite;
        this.emp_tipo = emp_tipo;
        this.emp_tipoVenta = emp_tipoVenta;
        this.emp_registroMercantil = emp_registroMercantil;
        this.emp_numRegistroMercantil = emp_numRegistroMercantil;
        this.emp_ultimoAnioRenovacion = emp_ultimoAnioRenovacion;
        this.emp_codigoCIIU = emp_codigoCIIU;
        this.emp_actividadInternacional = emp_actividadInternacional;
        this.emp_paisesComercio = emp_paisesComercio;
        this.emp_negocioWeb = emp_negocioWeb;
        this.emp_productoServicio = emp_productoServicio;
        this.emp_medioCDE = emp_medioCDE;
        this.emp_observaciones = emp_observaciones;
    }

    public String getEmp_consecutivo() {
        return emp_consecutivo;
    }

    public void setEmp_consecutivo(String emp_consecutivo) {
        this.emp_consecutivo = emp_consecutivo;
    }

    public String getEmp_fecha() {
        return emp_fecha;
    }

    public void setEmp_fecha(String emp_fecha) {
        this.emp_fecha = emp_fecha;
    }

    public String getEmp_asesor() {
        return emp_asesor;
    }

    public void setEmp_asesor(String emp_asesor) {
        this.emp_asesor = emp_asesor;
    }

    public String getEmp_clasCliente() {
        return emp_clasCliente;
    }

    public void setEmp_clasCliente(String emp_clasCliente) {
        this.emp_clasCliente = emp_clasCliente;
    }

    public String getEmp_cc() {
        return emp_cc;
    }

    public void setEmp_cc(String emp_cc) {
        this.emp_cc = emp_cc;
    }

    public String getEmp_nombre() {
        return emp_nombre;
    }

    public void setEmp_nombre(String emp_nombre) {
        this.emp_nombre = emp_nombre;
    }

    public int getEmp_nit() {
        return emp_nit;
    }

    public void setEmp_nit(int emp_nit) {
        this.emp_nit = emp_nit;
    }

    public String getEmp_nombreRepLegal() {
        return emp_nombreRepLegal;
    }

    public void setEmp_nombreRepLegal(String emp_nombreRepLegal) {
        this.emp_nombreRepLegal = emp_nombreRepLegal;
    }

    public String getEmp_constitucionLegal() {
        return emp_constitucionLegal;
    }

    public void setEmp_constitucionLegal(String emp_constitucionLegal) {
        this.emp_constitucionLegal = emp_constitucionLegal;
    }

    public String getEmp_otraConstitucion() {
        return emp_otraConstitucion;
    }

    public void setEmp_otraConstitucion(String emp_otraConstitucion) {
        this.emp_otraConstitucion = emp_otraConstitucion;
    }

    public String getEmp_fechaConstitucion() {
        return emp_fechaConstitucion;
    }

    public void setEmp_fechaConstitucion(String emp_fechaConstitucion) {
        this.emp_fechaConstitucion = emp_fechaConstitucion;
    }

    public String getEmp_noEmpleadoTC() {
        return emp_noEmpleadoTC;
    }

    public void setEmp_noEmpleadoTC(String emp_noEmpleadoTC) {
        this.emp_noEmpleadoTC = emp_noEmpleadoTC;
    }

    public String getEmp_noEmpleadoMT() {
        return emp_noEmpleadoMT;
    }

    public void setEmp_noEmpleadoMT(String emp_noEmpleadoMT) {
        this.emp_noEmpleadoMT = emp_noEmpleadoMT;
    }

    public String getEmp_noEmpleadoDirectos() {
        return emp_noEmpleadoDirectos;
    }

    public void setEmp_noEmpleadoDirectos(String emp_noEmpleadoDirectos) {
        this.emp_noEmpleadoDirectos = emp_noEmpleadoDirectos;
    }

    public String getEmp_noEmpleadoIndirectos() {
        return emp_noEmpleadoIndirectos;
    }

    public void setEmp_noEmpleadoIndirectos(String emp_noEmpleadoIndirectos) {
        this.emp_noEmpleadoIndirectos = emp_noEmpleadoIndirectos;
    }

    public String getEmp_direccion() {
        return emp_direccion;
    }

    public void setEmp_direccion(String emp_direccion) {
        this.emp_direccion = emp_direccion;
    }

    public String getEmp_ciudad() {
        return emp_ciudad;
    }

    public void setEmp_ciudad(String emp_ciudad) {
        this.emp_ciudad = emp_ciudad;
    }

    public String getEmp_telefono() {
        return emp_telefono;
    }

    public void setEmp_telefono(String emp_telefono) {
        this.emp_telefono = emp_telefono;
    }

    public String getEmp_celular() {
        return emp_celular;
    }

    public void setEmp_celular(String emp_celular) {
        this.emp_celular = emp_celular;
    }

    public String getEmp_emailEmpresa() {
        return emp_emailEmpresa;
    }

    public void setEmp_emailEmpresa(String emp_emailEmpresa) {
        this.emp_emailEmpresa = emp_emailEmpresa;
    }

    public String getEmp_urlWebsite() {
        return emp_urlWebsite;
    }

    public void setEmp_urlWebsite(String emp_urlWebsite) {
        this.emp_urlWebsite = emp_urlWebsite;
    }

    public String getEmp_tipo() {
        return emp_tipo;
    }

    public void setEmp_tipo(String emp_tipo) {
        this.emp_tipo = emp_tipo;
    }

    public String getEmp_tipoVenta() {
        return emp_tipoVenta;
    }

    public void setEmp_tipoVenta(String emp_tipoVenta) {
        this.emp_tipoVenta = emp_tipoVenta;
    }

    public String getEmp_registroMercantil() {
        return emp_registroMercantil;
    }

    public void setEmp_registroMercantil(String emp_registroMercantil) {
        this.emp_registroMercantil = emp_registroMercantil;
    }

    public String getEmp_numRegistroMercantil() {
        return emp_numRegistroMercantil;
    }

    public void setEmp_numRegistroMercantil(String emp_numRegistroMercantil) {
        this.emp_numRegistroMercantil = emp_numRegistroMercantil;
    }

    public String getEmp_ultimoAnioRenovacion() {
        return emp_ultimoAnioRenovacion;
    }

    public void setEmp_ultimoAnioRenovacion(String emp_ultimoAnioRenovacion) {
        this.emp_ultimoAnioRenovacion = emp_ultimoAnioRenovacion;
    }

    public String getEmp_codigoCIIU() {
        return emp_codigoCIIU;
    }

    public void setEmp_codigoCIIU(String emp_codigoCIIU) {
        this.emp_codigoCIIU = emp_codigoCIIU;
    }

    public String getEmp_actividadInternacional() {
        return emp_actividadInternacional;
    }

    public void setEmp_actividadInternacional(String emp_actividadInternacional) {
        this.emp_actividadInternacional = emp_actividadInternacional;
    }

    public String getEmp_paisesComercio() {
        return emp_paisesComercio;
    }

    public void setEmp_paisesComercio(String emp_paisesComercio) {
        this.emp_paisesComercio = emp_paisesComercio;
    }

    public String getEmp_negocioWeb() {
        return emp_negocioWeb;
    }

    public void setEmp_negocioWeb(String emp_negocioWeb) {
        this.emp_negocioWeb = emp_negocioWeb;
    }

    public String getEmp_productoServicio() {
        return emp_productoServicio;
    }

    public void setEmp_productoServicio(String emp_productoServicio) {
        this.emp_productoServicio = emp_productoServicio;
    }

    public String getEmp_medioCDE() {
        return emp_medioCDE;
    }

    public void setEmp_medioCDE(String emp_medioCDE) {
        this.emp_medioCDE = emp_medioCDE;
    }

    public String getEmp_observaciones() {
        return emp_observaciones;
    }

    public void setEmp_observaciones(String emp_observaciones) {
        this.emp_observaciones = emp_observaciones;
    }
}
