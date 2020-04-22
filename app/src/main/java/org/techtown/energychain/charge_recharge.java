package org.techtown.energychain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class charge_recharge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energyhistory);
    }

    public void charge_waken_Click(View v) {
        EditText charge_waken = (EditText) findViewById(R.id.charge_waken);
        TextView charged_waken = (TextView) findViewById(R.id.charged_waken);
        int n1 = Integer.parseInt(charge_waken.getText().toString());
        int n2 = 1000;
        charged_waken.setText(Integer.toString(n1*n2));
    }

    public void charge_money_Click(View v) {
        EditText recharge_waken = (EditText) findViewById(R.id.recharge_waken);
        TextView recharged_money = (TextView) findViewById(R.id.recharged_money);
        int n1 = Integer.parseInt(recharge_waken.getText().toString());
        recharged_money.setText(Integer.toString(n1));
    }
}
