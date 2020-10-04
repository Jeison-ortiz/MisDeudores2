package com.jeisonortiz.misdeudores2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_registro.*

class RegistroActivity : AppCompatActivity() {
    companion object{
        private const val EMPTY = ""
        private const val SPACE = " "
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)


        registrar_button.setOnClickListener{
            val nombre = nombre_edit_text.text.toString()
            val correo = correo_edit_text.text.toString()
            val telefono = telefono_edit_text.text.toString()
            val contrasena = contraseña_edit_text.text.toString()
            val rep_contrasena = repetir_contraseña_edit_text.text.toString()

            val genero = if(masculino_radio_button.isChecked) getString(R.string.masculino) else getString(R.string.femenino)
            var pasatiempos = EMPTY
            if(nadar_check_box.isChecked) pasatiempos += getString(R.string.nadar) + SPACE
            if(cine_check_box.isChecked) pasatiempos += getString(R.string.cine) + SPACE
            if(comer_check_box.isChecked) pasatiempos += getString(R.string.comer) + SPACE


            Respuesta_text_view.text = getString(R.string.respuesta,nombre,correo,telefono,genero,pasatiempos)

            //Respuesta_text_view.text = "nombre: $nombre, \ncorreo: $correo, \ncontraseña: $contrasena, \nrepetir_contraseña: $rep_contrasena"
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag:"Metodo", msg:"onstart")

    }

    override fun onResume() {
        super.onStart()
        Log.d(tag:"Metodo", msg: "onStart")
    }

    override fun onPause() {
        super.onStart()
        Log.d(tag "Metodo",msg: onStart)
    }
    override fun onStop() {
        super.onStart()
        Log.d(tag "Metodo",msg: onStart)
    }

    override fun onDestroy() {
        super.onStart()
        Log.d(tag "Metodo",msg: onStart)
    }

    override fun onRestart() {
        super.onStart()
        Log.d(tag "Metodo",msg: onStart)
    }

}