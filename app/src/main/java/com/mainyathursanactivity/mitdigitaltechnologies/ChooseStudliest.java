package com.mainyathursanactivity.mitdigitaltechnologies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.cardview.widget.CardView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ChooseStudliest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_studliest);
        ArrayList<Study> numbersList = GetStudy();
        StudyAdaptor adaptor = new StudyAdaptor
                (this, R.layout.tostudy, numbersList);

        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adaptor);



    }
    private Map<Integer, String> GetChoose() {
        Map<Integer, String> words = new LinkedHashMap<Integer, String>();
        words.put(1, getString(R.string.std_title1));
        words.put(2, getString(R.string.std_title2));
        words.put(3, getString(R.string.std_title3));
        words.put(4, getString(R.string.std_title4));
        words.put(5, getString(R.string.std_title5));
        words.put(6, "Targeted Training and Apprenticeships Fund (TTAF)");
        words.put(7, "First time learner fees-free initiative");
        words.put(8, "Māori and Pasifika Trades Training (MPTT)");
        words.put(9, "All level 1 and 2 programmes");
        words.put(10, "Youth Guarantee");


        return words;
    }
    private Map<Integer, String> GetDescription() {
        Map<Integer, String> desc = new LinkedHashMap<Integer, String>();
        desc.put(1, getString(R.string.std_subtitle1));
        desc.put(2, getString(R.string.std_subtitle2));
        desc.put(3, getString(R.string.std_subtitle3));
        desc.put(4, getString(R.string.std_subtitle4));
        desc.put(5, getString(R.string.std_subtitle5));
        desc.put(6, "If you are a New Zealand citizen or permanent resident\n" +
                "you may be eligible to get free training in specific areas\n" +
                "that are critical to the economy and will help New Zealand\n" +
                "get moving again.");
        desc.put(7, "Are you thinking about starting tertiary education for the\n" +
                "first time? You may be able to get one year study or two\n" +
                "years training fees-free.");
        desc.put(8, "If you are New Zealand Māori or Pasifika, aged\n" +
                "16-40 years old, you could get free fees for many\n" +
                "of our trade qualifications.");
        desc.put(9, "Left school without getting your NCEA level 1 or 2, School\n" +
                "Certificate or 6th Form Certificate? Start here and go\n" +
                "anywhere with our free level 1 and 2 programmes.");
        desc.put(10, "If you are 16-19 years old, you could get free fees with\n" +
                "one of our level 3 qualifications.\n" +
                "Proof of residency status required, entry criteria, and some costs\n" +
                "may also apply. Free study is subject to funding confirmation.");

        return desc;
    }

    ArrayList<Study> GetStudy() {
        ArrayList<Study> numbersArrayList = new ArrayList<>();
        Map<Integer, String> words = GetChoose();
        Map<Integer, String> desc = GetDescription();
        for (Integer key : words.keySet()) {
            int id = key;
            String discript =desc.get(key);
            String title = words.get(key);
            String icon = "studyicon" + id;
            String readmore = "data" + id;
            Study n = new Study(id, icon, title, readmore, discript);
            numbersArrayList.add(n);
        }
        return numbersArrayList;
    }

    }


