package com.practica.eventos.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

public class EventoYRecursos {

    private String id;

    private Evento evento;

    private String transporte;
    private BigDecimal dineroPeajes;
    private BigDecimal dineroViaticos;

    public EventoYRecursos(String id, Evento evento, String transporte, BigDecimal dineroPeajes,
            BigDecimal dineroViaticos) {
        this.id = id;
        this.evento = evento;
        this.transporte = transporte;
        this.dineroPeajes = dineroPeajes;
        this.dineroViaticos = dineroViaticos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public BigDecimal getDineroPeajes() {
        return dineroPeajes;
    }

    public void setDineroPeajes(BigDecimal dineroPeajes) {
        this.dineroPeajes = dineroPeajes;
    }

    public BigDecimal getDineroViaticos() {
        return dineroViaticos;
    }

    public void setDineroViaticos(BigDecimal dineroViaticos) {
        this.dineroViaticos = dineroViaticos;
    }

}
