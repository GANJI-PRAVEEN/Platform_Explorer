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

public class Coding extends AppCompatActivity {
    Button gfg,lc,hr,cc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coding);
        gfg=findViewById(R.id.gfg);
        lc=findViewById(R.id.leetcode);
        hr=findViewById(R.id.hackerrank);
        cc=findViewById(R.id.codechef);
        gfg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                Toast.makeText(Coding.this, "Opening GFG", Toast.LENGTH_SHORT).show();
                intent.setData(Uri.parse("https://www.geeksforgeeks.org/"));
                startActivity(intent);
            }
        });
        lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                Toast.makeText(Coding.this, "Opening Leetcode", Toast.LENGTH_SHORT).show();
                intent.setData(Uri.parse("https://leetcode.com/problemset/"));
                startActivity(intent);
            }
        });
        hr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                Toast.makeText(Coding.this, "Opening HackerRank", Toast.LENGTH_SHORT).show();
                intent.setData(Uri.parse("https://www.hackerrank.com/"));
                startActivity(intent);
            }
        });
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                Toast.makeText(Coding.this, "Opening CodeChef", Toast.LENGTH_SHORT).show();
                intent.setData(Uri.parse("https://www.codechef.com/"));
                startActivity(intent);
            }
        });
    }
}