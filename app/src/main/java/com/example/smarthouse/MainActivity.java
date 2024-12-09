package com.example.smarthouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Задержка в 5 секунд
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            // Запуск SignUpActivity
            startActivity(new Intent(MainActivity.this, SignUpActivity.class));
            // Завершение SplashScreenActivity
            finish();
        }, 5000);

    }
}
