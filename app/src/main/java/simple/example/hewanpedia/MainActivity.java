package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKelinci,btnSerigala,btnRusa;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKelinci = findViewById(R.id.btn_buka_ras_kelinci);
        btnSerigala = findViewById(R.id.btn_buka_ras_serigala);
        btnRusa = findViewById(R.id.btn_buka_ras_rusa);
        btnKelinci.setOnClickListener(view -> bukaGaleri("Kelinci"));
        btnSerigala.setOnClickListener(view -> bukaGaleri("Serigala"));
        btnRusa.setOnClickListener(view -> bukaGaleri("Rusa"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity kelinci");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    public void btn_profil(View view) {
        Intent intent = new Intent(MainActivity.this, Myprofil.class);
        startActivity(intent);
    }
}