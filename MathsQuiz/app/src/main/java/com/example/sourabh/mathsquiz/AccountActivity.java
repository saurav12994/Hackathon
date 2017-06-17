package com.example.sourabh.mathsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class AccountActivity extends AppCompatActivity {
Button b1;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        recyclerView=(RecyclerView)findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(new RecyclerAdapter(this));
    }
}
