package com.example.taxation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class register_activity : AppCompatActivity() {
    lateinit var back_btn: ImageView
    lateinit var enter_name: EditText
    lateinit var enter_mail: EditText
    lateinit var passwrd: TextView
    lateinit var cnf_passwrd: TextView
    lateinit var enter_mob: TextView
    lateinit var regbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_activity)
        back_btn = findViewById(R.id.back_btn)
        enter_name = findViewById(R.id.enter_name)
        enter_mail = findViewById(R.id.enter_mail)
        enter_mob = findViewById(R.id.enter_mob)
        passwrd = findViewById(R.id.enter_pass)
        cnf_passwrd = findViewById(R.id.enter_cnfrm_pass)
        regbtn = findViewById(R.id.reg_btn)

        back_btn.setOnClickListener {
            var intent = Intent(this@register_activity,login_activity::class.java)
            startActivity(intent)
        }

    }
}
