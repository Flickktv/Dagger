package com.example.android.dagger.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.dagger.MyApplication
import javax.inject.Inject

class SplashActivity : AppCompatActivity() {

    @Inject
    lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        (application as MyApplication).appComponent.splashComponent().create().inject(this)
        super.onCreate(savedInstanceState)

        startActivity(Intent(this, splashViewModel.getActivityClass()))
        finish()
    }

}