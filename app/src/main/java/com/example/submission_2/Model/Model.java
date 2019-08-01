package com.example.submission_2.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Model implements Parcelable {
    private String id;
    private String image;
    private String title;
    private String desc;
    private String rating;
    private String date;
    private String language;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Model(String id, String image, String title, String desc, String rating, String date, String language) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.desc = desc;
        this.rating = rating;
        this.date = date;
        this.language = language;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.image);
        dest.writeString(this.title);
        dest.writeString(this.desc);
        dest.writeString(this.rating);
        dest.writeString(this.date);
        dest.writeString(this.language);
    }

    protected Model(Parcel in) {
        this.id = in.readString();
        this.image = in.readString();
        this.title = in.readString();
        this.desc = in.readString();
        this.rating = in.readString();
        this.date = in.readString();
        this.language = in.readString();
    }

    public static final Parcelable.Creator<Model> CREATOR = new Parcelable.Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel source) {
            return new Model(source);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };
}
