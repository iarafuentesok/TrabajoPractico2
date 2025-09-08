package com.example.trabajopractico2.view;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.trabajopractico2.databinding.ActivityDetalleLibroBinding;

public class DetalleLibroActivity extends AppCompatActivity {

    private ActivityDetalleLibroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalleLibroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String titulo = getIntent().getStringExtra("titulo");
        String autor = getIntent().getStringExtra("autor");
        String descripcion = getIntent().getStringExtra("descripcion");

        binding.textTitulo.setText(titulo);
        binding.textAutor.setText(autor);
        binding.textDescripcion.setText(descripcion);
    }
}
