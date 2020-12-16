package com.mainyathursanactivity.mitdigitaltechnologies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView homeRecycler;
    RecyclerView.Adapter adapter;
    public int data=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homeRecycler= findViewById(R.id.student_comment);
stdComments();
//button Animation
        final Button brouher = (Button) findViewById(R.id.button);
        final Animation fadein = AnimationUtils.loadAnimation(this,R.anim.buttin_ani);
        brouher.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==event.ACTION_UP){ brouher.startAnimation(fadein);
                    Intent mainCardArea = new Intent(getBaseContext(), CardActivity.class);}

                return false;
            }
        });
    }

    private void stdComments() {
        homeRecycler.setHasFixedSize(true);
        homeRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<RecycleAdaptor> studentComment = new ArrayList<>();
       studentComment.add(new RecycleAdaptor(R.drawable.person1,"LOUIS RODGERS","It was\n" +
               "a great choice","Digital Technologies graduate"));
        studentComment.add(new RecycleAdaptor(R.drawable.person2,"DIYAS RODGERS","It was\n" +"a great choice","Digital Technologies graduate"));
        studentComment.add(new RecycleAdaptor(R.drawable.person1,"LOUIS RODGERS","It was\n" +"a great choice","Digital Technologies graduate"));
        studentComment.add(new RecycleAdaptor(R.drawable.person2,"DIYAS RODGERS","It was\n" +"a great choice","Digital Technologies graduate"));
        adapter = new RecyclerAdapterClass(studentComment);
        homeRecycler.setAdapter(adapter);

    }

    public  void digital_brochure_ban(View view) {
    Intent mainCardArea = new Intent(getBaseContext(), CardActivity.class);
    startActivity(mainCardArea);
}
}