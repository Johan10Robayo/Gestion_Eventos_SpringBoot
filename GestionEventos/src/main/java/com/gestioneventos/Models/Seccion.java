package com.gestioneventos.Models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="seccion")
@NoArgsConstructor
@Getter
@Setter
public class Seccion {
    @EmbeddedId
    private SeccionId id;


}
