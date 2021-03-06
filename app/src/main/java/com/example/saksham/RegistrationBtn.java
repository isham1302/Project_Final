package com.example.saksham;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.saksham.Student.LoginStud;
import com.example.saksham.Writer.Login;

public class RegistrationBtn extends AppCompatActivity {
    ImageButton writerBtn,studentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_btn);
        writerBtn=findViewById(R.id.writerBtn);
        studentBtn= findViewById(R.id.studentBtn);

        writerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regIntent= new Intent(RegistrationBtn.this, Login.class);
                startActivity(regIntent);
            }
        });
        studentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regIntent= new Intent(RegistrationBtn.this, LoginStud.class);
                startActivity(regIntent);
            }
        });
    }
}