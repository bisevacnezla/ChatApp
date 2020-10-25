package com.example.chatapp

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_login)

        login_button.setOnClickListener {
            val email = email_login.text.toString()
            val password= password_login.text.toString()
            Log.d("Login Activity", "Email: $email, password: $password")

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener {  }
                .addOnFailureListener { }
        }
        back_registration.setOnClickListener {
            finish()
        }
    }
}