package com.example.recycleveiw;

import static android.widget.Toast.makeText;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MakananAdapter.OnItemClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvMakanan);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<ModelMakanan> dataMakanan = new ArrayList<>();
        dataMakanan.add(new ModelMakanan("Steak", "Rp 300.000",R.drawable.steak,"Steak adalah jenis makanan mewah yang biasa dihidangkan di restoran berbintang ataupun rumah makan kelas atas. Menu berbahan dasar daging sapi ini memang rasanya sangat nikmat, apalagi jika di olah dan di bumbui dengan benar maka bisa menambah cita rasa yang diberikan." +
                "Penggunaan daging steak sendiri tidak sembarangan, bahkan ada grade-grade nya tersendiri dan inilah yang berpengaruh terhadap harga jualnya."));
        dataMakanan.add(new ModelMakanan("Indomie", "Rp 5.000",R.drawable.indomi,"Indomie adalah merek mi instan yang diproduksi oleh Indofood CBP, anak perusahaan Indofood Sukses Makmur di Indonesia. Indofood sendiri merupakan produsen mi instan terbesar di dunia, dengan puluhan pabrik di berbagai negara."));
        dataMakanan.add(new ModelMakanan("Babi Bakar", "Rp 50.000",R.drawable.babiba,"Babi panggang merujuk kepada aneka jenis hidangan Indonesia yang terbuat dari daging babi yang dipanggang. Di Indonesia terdapat beberapa jenis hidangan babi panggang yang terkenal, antara lain babi panggang karo (lazim disingkat BPK), bipang ambawang, dan babi panggang merah."));
        dataMakanan.add(new ModelMakanan("Babi Goreng", "Rp 60.000",R.drawable.babigo,"Babi goreng adalah gorengan dari danging babi yang di goreng. Di Indonesia babi goreng sulit di temukan di pedagang kaki tiga karenakan babi di anggap haram oleh sebagian besar rakyat Indonesia dan di beberapa tempat di makanan yang mengandung babi dilarang."));
        dataMakanan.add(new ModelMakanan("Popmie", "Rp 5.000",R.drawable.popmie,"Pop Mie adalah merek mi instan dalam bentuk cup di Indonesia, diproduksi oleh Indofood CBP, anak perusahaan Indofood. "));

        MakananAdapter adapter = new MakananAdapter(dataMakanan, this);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public void onItemClick(ModelMakanan makananModel) {
        Toast.makeText(this, makananModel.getNamaMakanan() + " , " + makananModel.getHargaMakanan(), Toast.LENGTH_SHORT).show();

        Intent in = new Intent(MainActivity.this, DetailMakanan.class);
        in.putExtra("namaMakanan",makananModel.getNamaMakanan());
        in.putExtra("hargaMakanan",makananModel.getHargaMakanan());
        in.putExtra("asalMakanan",makananModel.getGambarasal());
        in.putExtra("infoMakanan",makananModel.getInfoMakanan());

        startActivity(in);
    }
}
