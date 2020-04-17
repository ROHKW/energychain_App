package org.techtown.energychain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button purchaseButton = (Button)findViewById(R.id.purchaseButton);
        final Button saleButton = (Button)findViewById(R.id.purchaseButton);
        final Button mydataButton = (Button)findViewById(R.id.purchaseButton);
        final LinearLayout energymain = (LinearLayout)findViewById(R.id.energymain);

        purchaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                energymain.setVisibility(View.GONE);
                purchaseButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                saleButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                mydataButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new Purchase_Fragment());
                fragmentTransaction.commit();
            }
        });


        saleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                energymain.setVisibility(View.GONE);
                purchaseButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                saleButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                mydataButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new Sale_Fragment());
                fragmentTransaction.commit();
            }
        });


        mydataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                energymain.setVisibility(View.GONE);
                purchaseButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                saleButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                mydataButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new Mydata_Fragment());
                fragmentTransaction.commit();
            }
        });




    }
}
