package com.example.itproger;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView ;
    private EditText number_field_1, number_field_2;
    private Button sum_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        resultTextView =findViewById(R.id.resultTextView);
        number_field_1 =findViewById(R.id.number_field_1);
        number_field_2 =findViewById(R.id.number_field_2);
        sum_button =findViewById(R.id.sum_button);

        sum_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(number_field_1.getText().toString());
                float num2=Float.parseFloat(number_field_1.getText().toString());
                float res=num1+num2;
                resultTextView.setText(String.valueOf(res));
            }
        });
    }

}