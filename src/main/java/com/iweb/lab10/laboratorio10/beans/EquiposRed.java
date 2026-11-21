package com.iweb.lab10.laboratorio10.beans;

public class EquiposRed {

    private int idEquipo;
    private String hostName;
    private int tipo;
    private String ipGestion;
    private int estado;
    private int fechaAlta;
    private Sedes idSede;


    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getIpGestion() {
        return ipGestion;
    }

    public void setIpGestion(String ipGestion) {
        this.ipGestion = ipGestion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(int fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Sedes getIdSede() {
        return idSede;
    }

    public void setIdSede(Sedes idSede) {
        this.idSede = idSede;
    }
}
