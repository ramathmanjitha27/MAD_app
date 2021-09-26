package com.example.mad_project_ram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManageBooks extends AppCompatActivity {

    Button updateBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_books);
        Toolbar toolbar = findViewById(R.id.toolbar6);
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_ios_24);
        setSupportActionBar(toolbar);


        updateBook = (Button)findViewById(R.id.btn_UpdateBook);

        updateBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openeupdateBook();

            }
        });

    }

    private void openeupdateBook() {
        Intent intent = new Intent(this,ViewBooks.class);
        startActivity(intent);
    }


}