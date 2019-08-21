package com.example.appquanlysinhvien;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    EditText edtTen, edtLop, edtDiaChi;
    Button btnHuy, btnThem;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapview();
    }

    private void mapview() {
        edtTen = findViewById(R.id.edittextTen);
        edtLop = findViewById(R.id.edittextLop);
        edtDiaChi = findViewById(R.id.edittextDiachi);
        btnHuy = findViewById(R.id.buttonCancel);
        btnThem = findViewById(R.id.buttonAdd);
        recyclerView = findViewById(R.id.recyclerviewSinhvien);
    }
}
