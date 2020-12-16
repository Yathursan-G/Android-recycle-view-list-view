package com.mainyathursanactivity.mitdigitaltechnologies;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class miniDataActivity extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_data);
        imageView=findViewById(R.id.listImageView);
        Intent intent= getIntent();
        String result=intent.getStringExtra(intent.EXTRA_TEXT);
        int receivedImage = intent.getIntExtra("image",0);
        String desc=intent.getStringExtra("descript");
        //CardView cardViewResults = (CardView) findViewById(R.id.card_view_results);
        TextView resultTextView = (TextView) findViewById(R.id.listdata1);
        resultTextView.setText(result);
        TextView resultTextView1 = (TextView) findViewById(R.id.listdata2);
        resultTextView1.setText(desc);
        imageView.setImageResource(receivedImage);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}