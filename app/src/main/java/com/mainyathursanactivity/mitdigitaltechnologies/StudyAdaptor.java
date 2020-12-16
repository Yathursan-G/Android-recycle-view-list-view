package com.mainyathursanactivity.mitdigitaltechnologies;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
public class StudyAdaptor extends ArrayAdapter {//mLayoutId refers to the ListView item xml
    int mLayoutID;
    // The collection of Number objects sent as data
    ArrayList<Study> mNumbers;

    Context mContext;
   // MediaPlayer mediaPlayer;

    public StudyAdaptor(@NonNull Context context, int resource, @NonNull ArrayList<Study> objects) {
        super(context, resource, objects);
        mLayoutID=resource;
        mNumbers=objects;
        mContext=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentListViewItem = convertView;

        // Check if the existing view is being reused, otherwise inflate the view
        if (currentListViewItem == null) {
            currentListViewItem = LayoutInflater.from(getContext()).inflate(mLayoutID, parent, false);
        }
        //Get the Number object for the current position
        final Study currentNumber = mNumbers.get(position);

        //Set the attributed of list_view_number_item views
        final ImageView iconImageView = (ImageView) currentListViewItem.findViewById(R.id.image_view_icon);
        int i = mContext.getResources().getIdentifier(
                currentNumber.getIcon(), "drawable",
                mContext.getPackageName());

        //Setting the icon
        iconImageView.setImageResource(i);

        final TextView titleTextView = (TextView) currentListViewItem.findViewById(R.id.text_view_maori_text);
        titleTextView.setText(currentNumber.getTitle());
        final String readmore = currentNumber.getReadmore();
        final ImageView move = (ImageView) currentListViewItem.findViewById(R.id.read_more_image);

        //Setting the image click handler
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Operations to perform when the play ImageView is clicked
                int i = mContext.getResources().getIdentifier(
                        readmore, "raw",
                        mContext.getPackageName());
                Intent numbersActivity=new Intent(mContext,miniDataActivity.class);
                String title=currentNumber.getTitle();
                String description=currentNumber.getDiscript();
                int a = mContext.getResources().getIdentifier(
                        currentNumber.getIcon(), "drawable",
                        mContext.getPackageName());
               //ImageView icon=iconImageView.setImageResource(a);
numbersActivity.putExtra(Intent.EXTRA_TEXT,title);
                numbersActivity.putExtra("descript",description);
numbersActivity.putExtra("image",a);
                mContext.startActivity(numbersActivity);



            }
        });
        return currentListViewItem;
    }
}