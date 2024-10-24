package com.practica.eventos.model;


public class TipoDeEventos {


    private String id;

    private String tipoDeEvento;

    public TipoDeEventos(String id, String tipoDeEvento) {
        this.id = id;
        this.tipoDeEvento = tipoDeEvento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoDeEvento() {
        return tipoDeEvento;
    }

    public void setTipoDeEvento(String tipoDeEvento) {
        this.tipoDeEvento = tipoDeEvento;
    }
}
