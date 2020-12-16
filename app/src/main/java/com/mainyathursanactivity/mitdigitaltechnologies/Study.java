package com.mainyathursanactivity.mitdigitaltechnologies;

public class Study {
    private int mId;
    private String mIcon;
    private String mTitle;
    private String mReadmore;
    private String mDiscript;

    //Properties
    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        this.mIcon = icon;
    }

    public String getReadmore() {
        return mReadmore;
    }

    public void setReadmore(String readmore) {
        this.mReadmore = readmore;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setMaoriTranslation(String title) {
        this.mTitle = title;
    }
    public String getDiscript(){return  mDiscript;}
    public void  setDiscript(String discript){
        this.mDiscript = discript;
    }


    //Constructor
    public Study(int id, String icon, String title, String readmore, String discript) {
        this.mId = id;
        this.mIcon = icon;
        this.mTitle = title;
        this.mReadmore = readmore;
        this.mDiscript=discript;
    }
}
