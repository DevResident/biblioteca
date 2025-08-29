package com.fca.biblioteca.data;

import lombok.*;
import java.time.LocalDate;

public class Prestamo {

    private int idPrestamo;
    private int idPersona;
    private int idLibro;
    private LocalDate fechaPrestamo;
    private LocalDate diasPrestamo;
}
