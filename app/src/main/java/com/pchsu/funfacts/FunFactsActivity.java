package com.pchsu.funfacts;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends ActionBarActivity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorBook mColorBook = new ColorBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view variables and assign the views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.my_layout);

        final Button showFactButton = (Button) findViewById(R.id.showFactButton);

         showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // update the label with our dynamic fact
                int color = mColorBook.getColor();
                factLabel.setText(mFactBook.getFact());
                showFactButton.setTextColor(color);
                layout.setBackgroundColor(color);
            }
        });

        // Toast.makeText(this, "Yay~~~", Toast.LENGTH_LONG).show();
        Log.d(TAG," on create()!!!");
    }
}
