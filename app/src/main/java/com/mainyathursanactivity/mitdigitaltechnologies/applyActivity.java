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
import android.os.Bundle;

public class applyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);
        ArrayList<Study> numbersList = GetStudy();
        StudyAdaptor adaptor = new StudyAdaptor
                (this, R.layout.tostudy, numbersList);

        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adaptor);
    }
    private Map<Integer, String> GetChoose() {
        Map<Integer, String> words = new LinkedHashMap<Integer, String>();
        words.put(1, getString(R.string.apply_title1));
        words.put(2, getString(R.string.apply_title2));
        words.put(3, getString(R.string.apply_title3));
        words.put(4, getString(R.string.apply_title4));
        words.put(5, getString(R.string.apply_title5));
        words.put(6, "Entry requirements\n" +
                "Domestic students:");
        words.put(7, "Entry requirements\n" +
                "International students:");

        return words;
    }
    private Map<Integer, String> GetDescription() {
        Map<Integer, String> desc = new LinkedHashMap<Integer, String>();
        desc.put(1, getString(R.string.apply_subtitle1));
        desc.put(2, getString(R.string.apply_subtitle2));
        desc.put(3, getString(R.string.apply_subtitle3));
        desc.put(4, getString(R.string.apply_subtitle4));
        desc.put(5, getString(R.string.apply_subtitle5));
        desc.put(6, "• Have completed a degree in a field excluding\n" +
                "specific graduate diploma field\n" +
                "Or\n" +
                "• Have completed a level 6 or 7 diploma\n" +
                "• Relevant experience\n" +
                "Or\n" +
                "• Evidence of equivalent practical, professional\n" +
                "or educational experience.");
        desc.put(7, "In addition to the above requirements you need:\n" +
                "Academic IELTS 6.0\n" +
                "with no band lower than 5.5, or equivalence..\n" +
                "For more detailed information\n" +
                "on entry requirements (including relevant\n" +
                "experience and equivalent qualifications) visit\n" +
                "manukau.ac.nz/digitaltechnologies.");

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
            String icon = "icon" + id;
            String readmore = "data" + id;
            Study n = new Study(id, icon, title, readmore, discript);
            numbersArrayList.add(n);
        }
        return numbersArrayList;
    }

}
