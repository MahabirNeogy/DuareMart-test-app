package com.example.jbmatrix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.telecom.Call
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jbmatrix.api.RetrofitClient
import com.example.jbmatrix.data.Product
import retrofit2.Response
import javax.security.auth.callback.Callback

class SplashScreen : AppCompatActivity() {

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()

        Handler().postDelayed({
            val intent= Intent(this@SplashScreen,MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)


    }

}