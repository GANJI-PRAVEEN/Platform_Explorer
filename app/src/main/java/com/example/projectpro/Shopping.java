package com.example.projectpro;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class Shopping extends AppCompatActivity {
    Button meesho,fk,amazon,shopsy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shopping);
        meesho=findViewById(R.id.meesho);
        fk=findViewById(R.id.flipkart);
        amazon=findViewById(R.id.amazon);
        shopsy=findViewById(R.id.shospy);
        meesho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                Toast.makeText(Shopping.this, "Opening Meesho", Toast.LENGTH_SHORT).show();
                intent.setData(Uri.parse("https://www.meesho.com/"));
                startActivity(intent);
            }
        });
        fk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Shopping.this, "Opening Flipkart", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.flipkart.com/"));
                startActivity(intent);
            }
        });
        shopsy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Shopping.this, "Opening Shopsy", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.shopsy.in/"));
                startActivity(intent);
            }
        });
        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                Toast.makeText(Shopping.this, "Opening Amazon", Toast.LENGTH_SHORT).show();
                intent.setData(Uri.parse("https://www.amazon.com/"));
                startActivity(intent);
            }
        });
    }
}