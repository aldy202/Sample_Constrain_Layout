package com.example.sampleconstrainlayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {

    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;

    FloatingActionButton fab;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtNama = findViewById(R.id.edNama);
        edtAlamat = findViewById(R.id.edAlamat);
        edtEmail = findViewById(R.id.EdEmail);
        edtPassword = findViewById(R.id.edPass);
        edtrepass = findViewById(R.id.edrepas);

        fab = findViewById(R.id.febSimpan);

        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                if (edtNama.getText().toString().isEmpty() ||
                edtAlamat.getText().toString().isEmpty()||
                edtEmail.getText().toString().isEmpty()||
                edtPassword.getText().toString().isEmpty()||
                edtrepass.getText().toString().isEmpty())
                {
                    Snackbar.make(view,"Wajib isi seluruh data !!!",Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    if(edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        Toast.makeText(DaftarActivity.this,"Pendaftaran Berhasil..", Toast.LENGTH_LONG).show();

                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        Snackbar.make(view, "Password dan Repassword harus sama !!",Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
