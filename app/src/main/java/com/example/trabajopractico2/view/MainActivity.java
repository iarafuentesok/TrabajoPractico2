package com.example.trabajopractico2.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.trabajopractico2.databinding.ActivityMainBinding;
import com.example.trabajopractico2.model.Libro;
import com.example.trabajopractico2.viewmodel.LibroViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private LibroViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(LibroViewModel.class);

        binding.botonBuscar.setOnClickListener(view -> {
            String titulo = binding.editTextoBusqueda.getText().toString();
            Libro libro = viewModel.buscarLibroPorTitulo(titulo);

            if (libro != null) {
                Intent intent = new Intent(this, DetalleLibroActivity.class);
                intent.putExtra("titulo", libro.getTitulo());
                intent.putExtra("autor", libro.getAutor());
                intent.putExtra("descripcion", libro.getDescripcion());
                startActivity(intent);
            } else {
                Toast.makeText(this, "Libro no encontrado", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

