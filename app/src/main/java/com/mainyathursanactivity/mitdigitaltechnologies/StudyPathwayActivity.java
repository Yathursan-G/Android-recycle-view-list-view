package com.mainyathursanactivity.mitdigitaltechnologies;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import androidx.cardview.widget.CardView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


public class StudyPathwayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_pathway);
        ArrayList<Study> numbersList = GetStudy();
        StudyAdaptor adaptor = new StudyAdaptor
                (this, R.layout.tostudy, numbersList);

        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adaptor);
    }
    private Map<Integer, String> GetChoose() {
        Map<Integer, String> words = new LinkedHashMap<Integer, String>();
        words.put(1, getString(R.string.path_title1));
        words.put(2, getString(R.string.path_title2));
        words.put(3, getString(R.string.path_title3));
        words.put(4, getString(R.string.path_title4));
        words.put(5, getString(R.string.path_title5));
        words.put(6, getString(R.string.path_title6));

        return words;
    }
    private Map<Integer, String> GetDescription() {
        Map<Integer, String> desc = new LinkedHashMap<Integer, String>();
        desc.put(1, getString(R.string.path_subtitle1));
        desc.put(2, getString(R.string.path_subtitle2));
        desc.put(3, getString(R.string.path_subtitle3));
        desc.put(4, getString(R.string.path_subtitle4));
        desc.put(5, getString(R.string.path_subtitle5));
        desc.put(6, getString(R.string.path_subtitle6));

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
            String icon = "levelicon" + id;
            String audio = "data" + id;
            Study n = new Study(id, icon, title, audio,discript);
            numbersArrayList.add(n);
        }
        return numbersArrayList;
    }

}
