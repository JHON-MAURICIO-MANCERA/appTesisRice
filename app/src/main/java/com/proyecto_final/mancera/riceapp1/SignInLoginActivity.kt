package com.proyecto_final.mancera.riceapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignInLoginActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding : Acti

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_login)
        // Initialize Firebase Auth
        auth = Firebase.auth
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if(currentUser != null){
            reload();
        }
    }
    private fun signInWithEmailAndPassword(  email : String, password : String){
    auth.signInWithEmailAndPassword(email, password)
    .addOnCompleteListener(this) { task ->
        if (task.isSuccessful) {
            // Sign in success, update UI with the signed-in user's information
            Log.d("TAG", "signInWithEmail:success")
            val user = auth.currentUser

        } else {
            // If sign in fails, display a message to the user.
            Log.w("TAG", "signInWithEmail:failure", task.exception)
            Toast.makeText(baseContext, "Authentication failed.",
                Toast.LENGTH_SHORT).show()

        }
    }}}