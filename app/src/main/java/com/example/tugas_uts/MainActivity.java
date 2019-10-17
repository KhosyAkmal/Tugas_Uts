package com.example.tugas_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tugas_uts.activities.HasilActivity;
import com.example.tugas_uts.fragmen.barang_daftar;
import com.example.tugas_uts.fragmen.barang_daftar2;
import com.example.tugas_uts.fragmen.barang_daftar3;
import com.example.tugas_uts.fragmen.beli;
import com.example.tugas_uts.fragmen.daftar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlerClickLoadDaftarFragment(View view) {
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.btn_dynamic_fragment_placeholer,new RedFragment());
//        fragmentTransaction.commit();

//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.btn_dynamic_fragment_placeholer,new RedFragment(),"RED_FRAGMENT");
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new daftar());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


    public void handlerClickLoadListFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new beli());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


    public void handlerClikDaftarkan(View view) {
        Intent intent = new Intent(this, HasilActivity.class);
        startActivity(intent);
    }

    public void handlerClickCelana(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new barang_daftar2());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void handlerClickJaket(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new barang_daftar3());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void handlerClickBaju(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new barang_daftar());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}
