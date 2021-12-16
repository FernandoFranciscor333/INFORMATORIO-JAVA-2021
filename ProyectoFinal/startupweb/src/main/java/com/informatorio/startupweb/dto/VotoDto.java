package com.informatorio.startupweb.dto;

public class VotoDto {

    private Long usuarioId;
    private Long emprendimientoId;
    private String generadoPor; 

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
}
