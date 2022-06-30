package com.example.firebasework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText Name, Email,Password;
    Button signupbtn;
    DatabaseReference signupDbRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name =findViewById(R.id.editTextName);
        Email =findViewById(R.id.editTextEmail);
        Password =findViewById(R.id.editTextPwd);
        signupbtn = findViewById(R.id.Signup);
//        FirebaseApp.initializeApp(this);

        signupDbRef = FirebaseDatabase.getInstance().getReference().child("Signup");
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });


    }

    private void sendData() {
        String name = Name.getText().toString();
        String email = Email.getText().toString();
        String pwd = Password.getText().toString();
        Signup signUp =new Signup(name,email,pwd);
        signupDbRef.push().setValue(signUp);
        Toast.makeText(this, "Data Send Successfully", Toast.LENGTH_SHORT).show();

    }
}