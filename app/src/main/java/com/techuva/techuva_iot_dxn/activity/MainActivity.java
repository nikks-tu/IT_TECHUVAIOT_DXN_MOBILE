package com.techuva.techuva_iot_dxn.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.techuva.techuva_iot_dxn.table.Table;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Table table = new Table(this);
        setContentView(table);
    }
}
