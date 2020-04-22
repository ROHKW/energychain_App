package org.techtown.energychain;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;


public class MyPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button NoticeButton = (Button)findViewById(R.id.NoticeButton);
        final Button EditPersonalButton = (Button)findViewById(R.id.EditPersonalButton);
        final Button TransactionHistoryButton = (Button)findViewById(R.id.TransactionHistoryButton);
        final Button ExchangeButton = (Button)findViewById(R.id.ExchangeButton);
        final Button LogoutButton = (Button)findViewById(R.id.LogoutButton);


        NoticeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MyPage.this, SubActivity.class);
                startActivity(mainIntent);
            }});

        EditPersonalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MyPage.this, SubActivity.class);
                startActivity(mainIntent);
            }});

        TransactionHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MyPage.this, SubActivity.class);
                startActivity(mainIntent);
            }});

        ExchangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MyPage.this, charge_recharge.class);
                startActivity(mainIntent);
            }});

        LogoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
//            new AlertDialog.Builder(this/* 해당 액티비티를 가르킴 */) // 죄송합니다.
//                .setTitle("로그아웃").setMessage("로그아웃 하시겠습니까?")
//                .setPositiveButton("로그아웃", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int whichButton) {
//                        Intent i = new Intent(ClientMainActivity.this/*현재 액티비티 위치*/ , MainActivity.class/*이동 액티비티 위치*/);
//                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
//                        startActivity(i);
//                }
//            })

//                .setNegativeButton("취소", new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialog, int whichButton) {
//
//                }
//            })
//                    .show();

        }});}}