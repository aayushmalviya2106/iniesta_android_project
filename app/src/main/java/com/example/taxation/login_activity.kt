package com.example.taxation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import launcher.launch_activity

class login_activity : AppCompatActivity() {
    lateinit var enter_mail: EditText
    lateinit var enter_pas: EditText
    lateinit var forgotpas: TextView
    lateinit var sign_up: TextView
    lateinit var loginbtn: Button
    val validmail = "aayushmalviya@gamil.com"
    val validpass = "qwerty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activity)
        title = "Log In"
        enter_mail = findViewById(R.id.enter_mail)
        enter_pas = findViewById(R.id.enter_pass)
        loginbtn = findViewById(R.id.login_btn)
        sign_up = findViewById(R.id.signup)
        forgotpas = findViewById(R.id.forgot_pass)
        val mail = enter_mail.text.toString()
        val password = enter_pas.text.toString()
        loginbtn.setOnClickListener {
            val mobile_no = enter_mail.text.toString()
            val password = enter_pas.text.toString()
            if (mobile_no == validmail && password == validpass) {
                val intent = Intent(this@login_activity, MainActivity::class.java)
                intent.putExtra("guest", enter_mail.getText().toString())
                intent.putExtra("hi", enter_pas.getText().toString())
                startActivity(intent)
                Toast.makeText(
                    this@login_activity, "you are now logged in", Toast.LENGTH_SHORT
                ).show()
                Toast.makeText(
                    this@login_activity, "YOUR DETAILS", Toast.LENGTH_LONG
                ).show()
            } else {
                Toast.makeText(
                    this@login_activity, "incorrect credentials", Toast.LENGTH_LONG
                ).show()


            }


            val intent = Intent(this@login_activity, launch_activity::class.java)
        }
    }
}