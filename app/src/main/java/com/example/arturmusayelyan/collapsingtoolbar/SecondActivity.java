package com.example.arturmusayelyan.collapsingtoolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView cardViewBanking, cardViewIdeas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        cardViewBanking = findViewById(R.id.banking_card);
        cardViewIdeas = findViewById(R.id.ideas_card);
        cardViewBanking.setOnClickListener(this);
        cardViewIdeas.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.banking_card:
                // Toast.makeText(this,"Banking card",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, BankingActivity.class));
                break;
            case R.id.ideas_card:
                startActivity(new Intent(this, ShopingActivity.class));
                break;
        }
    }
}
