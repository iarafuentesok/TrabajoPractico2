package com.example.trabajopractico2.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.trabajopractico2.model.Libro;
import java.util.ArrayList;
import java.util.List;

public class LibroViewModel extends ViewModel {

    private final List<Libro> listaLibros;

    public LibroViewModel() {
        listaLibros = new ArrayList<>();
        listaLibros.add(new Libro("Rayuela", "Julio Cortázar", "Una novela no lineal."));
        listaLibros.add(new Libro("1984", "George Orwell", "Distopía sobre vigilancia."));
        listaLibros.add(new Libro("El Principito", "Antoine de Saint-Exupéry", "Fábula filosófica sobre la vida."));
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo.trim())) {
                return libro;
            }
        }
        return null;
    }
}

