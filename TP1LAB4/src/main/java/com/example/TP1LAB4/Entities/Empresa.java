package com.example.TP1LAB4.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Empresa")
public class Empresa extends Base{
    private String Denominacion;
    private String Telefono;
    private String Horario;
    private String QuienesSomos;
    private float Latitud;
    private float Longitud;
    private String Domicilio;
    private String Email;
    private String Ubicacion;
}
