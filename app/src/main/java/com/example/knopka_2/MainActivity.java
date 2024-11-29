package com.example.knopka_2;

import android.content.Intent; // Импортируйте Intent
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button; // Импортируйте Button

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView helloText;
    private ImageButton startButton;
    private Button developerButton; // Добавьте переменную для кнопки разработчика

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        helloText = findViewById(R.id.helloText);
        startButton = findViewById(R.id.startButton);
        developerButton = findViewById(R.id.buttonDeveloper); // Инициализация кнопки разработчика

        // Установка обработчика нажатия для кнопки "О разработчике"
        developerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class); // Создание интента
                startActivity(intent); // Запуск новой активности
            }
        });
    }

    public void onStartButtonClick(View view) {
        helloText.setVisibility(View.VISIBLE);
        startButton.setClickable(false);
    }
}
