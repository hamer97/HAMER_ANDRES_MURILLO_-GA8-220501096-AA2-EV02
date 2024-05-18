package com.sena.login

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtener referencias a los botones
        val botonIniciarSesion = findViewById<Button>(R.id.iniciar_sesion)
        val botonRegistrarse = findViewById<Button>(R.id.buttonRegistrarse)
        val botonFacebook = findViewById<ImageButton>(R.id.imageButton3)
        val botonInstagram = findViewById<ImageButton>(R.id.imageButton4)
        val botonGmail = findViewById<ImageButton>(R.id.imageButton7)

        // Establecer OnClickListener para el botón de iniciar sesión
        botonIniciarSesion.setOnClickListener {
            val intent = Intent(this, inicio::class.java)
            startActivity(intent)
        }

        // Establecer OnClickListener para el botón de registrarse
        botonRegistrarse.setOnClickListener {
            val intent = Intent(this, registro::class.java)
            startActivity(intent)
        }

        // Establecer OnClickListener para el botón de Facebook
        botonFacebook.setOnClickListener {
            val url = "https://www.facebook.com"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // Establecer OnClickListener para el botón de Instagram
        botonInstagram.setOnClickListener {
            val url = "https://www.instagram.com"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // Establecer OnClickListener para el botón de Gmail
        botonGmail.setOnClickListener {
            val url = "https://mail.google.com"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}


