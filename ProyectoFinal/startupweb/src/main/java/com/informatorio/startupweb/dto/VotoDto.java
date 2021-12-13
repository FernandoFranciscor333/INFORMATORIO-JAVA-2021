package com.informatorio.startupweb.dto;

import java.time.LocalDate;

public class VotoDto {

    private Long usuarioId;
    private Long emprendimientoId;
    private String generadoPor;

    
    
    //private boolean votado;

    public Long getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
    public Long getEmprendimientoId() {
        return emprendimientoId;
    }
    public void setEmprendimientoId(Long emprendimientoId) {
        this.emprendimientoId = emprendimientoId;
    }

    public String getGeneradoPor() {
        return generadoPor;
    }
    public void setGeneradoPor(String generadoPor) {
        this.generadoPor = generadoPor;
    }

    /*public boolean isVotado() {
        return votado;
    }
    public void setVotado(boolean votado) {
        this.votado = votado;
    }*/

    
    
}
