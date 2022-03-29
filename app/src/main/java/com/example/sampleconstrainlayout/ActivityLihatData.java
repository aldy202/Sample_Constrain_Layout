package com.example.sampleconstrainlayout;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama,tvnomer;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomer = findViewById(R.id.tvNomerTelepon);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama){
            case "Inayah":
                tvnama.setText("Inayah M");
                tvnomer.setText("08772030175");
                break;
            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomer.setText("08772030345");
                break;
            case "Eris":
                tvnama.setText("Eris J");
                tvnomer.setText("08772030455");
                break;
            case "Fikri":
                tvnama.setText("M Fikri");
                tvnomer.setText("08772030145");
                break;
            case "Maul":
                tvnama.setText("Maul M");
                tvnomer.setText("087734354535");
                break;
            case "Intan":
                tvnama.setText("intan S");
                tvnomer.setText("087720301234");
                break;
            case "Vina":
                tvnama.setText("Vina R");
                tvnomer.setText("08772030345");
                break;
            case "Gita":
                tvnama.setText("Gitas S");
                tvnomer.setText("08772030336");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi M");
                tvnomer.setText("08772030563");
                break;
            case "Vian":
                tvnama.setText("Vian M");
                tvnomer.setText("087734354567");

        }
    }
}
