package com.example.sampleconstrainlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText edemail, edpassword;

    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignin);

        edemail = findViewById(R.id.edEmail);

        edpassword = findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 nama = edemail.getText().toString();

                 password = edpassword.getText().toString();

                 String email = "aldy@mail.com";

                 String pass = "12345";

                 if (nama.isEmpty() || password.isEmpty()){
                     Toast x = Toast.makeText(getApplicationContext(),
                             "Email dan password wajib diisi !!!",Toast.LENGTH_LONG);

                     x.show();
                 }else{

                     if(nama.equals(email) && password.equals(pass)){
                         Toast y = Toast.makeText(getApplicationContext(),
                                 "Login Sukses",Toast.LENGTH_LONG);

                         y.show();

                         Bundle a = new Bundle();

                         a.putString("c",nama.trim());

                         a.putString("r",password.trim());

                         Intent i = new Intent(getApplicationContext(),MainActivity2.class);

                         i.putExtras(a);

                         startActivity(i);
                     }else{
                         Toast x = Toast.makeText(getApplicationContext(),
                                 "login Gagal", Toast.LENGTH_LONG);

                         x.show();
                     }
                 }

                 /*
                 if ((nama.length() < 9) || (nama.length() >9))
                 {
                     Toast.makeText(MainActivity.this, "Email anda salah", Toast.LENGTH_LONG).show();
                 }
                else if ((password.length() < 5) || (password.length() > 5))
                {
                    Toast.makeText(MainActivity.this, "Password anda salah", Toast.LENGTH_LONG).show();
                }
                if (nama.equals("aldy@mail") && password.equals("12345"))
                {
                    Toast.makeText(MainActivity.this, "Anda berhasil login", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Email dan password anda salah", Toast.LENGTH_LONG).show();
                }
                */

            }
        });

    }
}