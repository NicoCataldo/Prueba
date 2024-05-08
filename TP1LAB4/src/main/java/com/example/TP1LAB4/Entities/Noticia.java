package com.example.TP1LAB4.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Noticia")
public class Noticia extends Base {
    private String Titulo;
    private String Resumen;
    private String Imagen;
    private String HTMl;
    private char Publicada;
    private String Fecha;
    private int idEmpresa;
}
