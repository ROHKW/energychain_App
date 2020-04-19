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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button purchaseButton = (Button)findViewById(R.id.purchaseButton);
        final Button saleButton = (Button)findViewById(R.id.saleButton);
        final Button mydataButton = (Button)findViewById(R.id.mydataButton);
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

    private long lastTimeBackPressed; //뒤로 두번 클릭시 앱 종료
    @Override
    public void onBackPressed(){
        if(System.currentTimeMillis()-lastTimeBackPressed<1500){
            finish();
            return;
        }
        Toast.makeText(this, "'뒤로' 버튼을 한 번 더 눌러 종료합니다.", Toast.LENGTH_SHORT);
        lastTimeBackPressed=System.currentTimeMillis();
    }
}
