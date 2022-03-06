package com.example.sampleconstrainlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variable untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan pe3assword
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada Layout
        btnLogin = findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada layout
        edemail = findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edpassword = findViewById(R.id.edPassword);

        //membuat fungsi OonClik pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                //menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password

                if (nama.length() < 9 || nama.length() > 9){
                    Toast b = Toast.makeText(getApplicationContext(),
                            "Email yand anda masukan salah",Toast.LENGTH_LONG);
                    b.show();

                }
                else if (password.length() < 5 || password.length() > 5){
                    Toast b = Toast.makeText(getApplicationContext(),
                            "Password yand anda masukan salah",Toast.LENGTH_LONG);
                    b.show();

                }
                else if(nama.equals("aldy@mail")&& password.equals("12345")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Berhasil ", Toast.LENGTH_LONG);
                    t.show();

                }
                else{
                    Toast y = Toast.makeText(getApplicationContext(),
                            "Email dan Password Salah",Toast.LENGTH_LONG);
                    y.show();
                }

            }


        });
    }
}