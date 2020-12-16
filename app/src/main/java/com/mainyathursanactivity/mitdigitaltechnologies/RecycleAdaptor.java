package com.mainyathursanactivity.mitdigitaltechnologies;

public class RecycleAdaptor {
    int image;
    String title, description,subtitle;

    public RecycleAdaptor(int image, String title, String description, String subtitle) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.subtitle=subtitle;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    public String getSubtitle(){
        return subtitle;
    }
}
