package com.iweb.lab10.laboratorio10.beans;

public class Sedes {

    private int idSede;
    private String nombre;
    private String ciudad;

    public int getIdSede(Integer idSede) {
        return this.idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
