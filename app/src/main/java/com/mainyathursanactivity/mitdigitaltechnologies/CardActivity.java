package com.mainyathursanactivity.mitdigitaltechnologies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import  android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.util.ArrayList;

public class CardActivity extends AppCompatActivity {
    RecyclerView homeRecycler;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        final CardView cardNumbers = (CardView) findViewById(R.id.card_choose_study);
        CardView pathway =(CardView) findViewById(R.id.pathway_study);
        CardView apply =(CardView) findViewById(R.id.how_to_apply);

       cardNumbers.setOnClickListener(CardNumbersHandler);
        pathway.setOnClickListener(CardNumbersHandler1);
        apply.setOnClickListener(CardNumbersHandler2);

        homeRecycler= findViewById(R.id.study_path);
        stdComments();
    }
    private void stdComments() {
        homeRecycler.setHasFixedSize(true);
        homeRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<RecycleAdaptor> studentComment = new ArrayList<>();
        studentComment.add(new RecycleAdaptor(R.drawable.mit_logo,"New Zealand Certificate in Digital Media and Design",
                "Assistant and/or support roles in various industries including advertising, web design, in house design studio, news media.","LEVEL 4"));
        studentComment.add(new RecycleAdaptor(R.drawable.mit_logo,"New Zealand Certificate in Digital Media and Design",
                "Assistant and/or support roles in various industries including advertising, web design, in house design studio, news media.","LEVEL 5"));
        studentComment.add(new RecycleAdaptor(R.drawable.mit_logo,"New Zealand Certificate in Digital Media and Design",
                "Assistant and/or support roles in various industries including advertising, web design, in house design studio, news media.","LEVEL 6"));
        studentComment.add(new RecycleAdaptor(R.drawable.mit_logo,"New Zealand Certificate in Digital Media and Design",
                "Assistant and/or support roles in various industries including advertising, web design, in house design studio, news media.","LEVEL 7"));
        studentComment.add(new RecycleAdaptor(R.drawable.mit_logo,"New Zealand Certificate in Digital Media and Design",
                "Assistant and/or support roles in various industries including advertising, web design, in house design studio, news media.","LEVEL 8"));

        adapter = new bRecyclerAdapterClass(studentComment);
        homeRecycler.setAdapter(adapter);

    }

    public  void digital_brochure_ban(View view) {
        Intent mainCardArea = new Intent(getBaseContext(), CardActivity.class);
        startActivity(mainCardArea);
    }

   View.OnClickListener CardNumbersHandler = new View.OnClickListener() {
        public void onClick(View view) {


            Intent studyActivity=new Intent(getBaseContext(),ChooseStudliest.class).
                    putExtra(Intent.EXTRA_TEXT, "A message form MainActivity");
            startActivity(studyActivity);
        }};
    View.OnClickListener CardNumbersHandler1 = new View.OnClickListener() {
        public void onClick(View view) {

            Intent pathwayActivity=new Intent(getBaseContext(),StudyPathwayActivity.class).
                    putExtra(Intent.EXTRA_TEXT, "A message form MainActivity");
            startActivity(pathwayActivity);
        }};
    View.OnClickListener CardNumbersHandler2 = new View.OnClickListener() {
        public void onClick(View view) {

            Intent howApplyActivity=new Intent(getBaseContext(),applyActivity.class).
                    putExtra(Intent.EXTRA_TEXT, "A message form MainActivity");
            startActivity(howApplyActivity);
        }};
}