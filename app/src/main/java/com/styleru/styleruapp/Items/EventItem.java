package com.styleru.styleruapp.Items;

public class EventItem {
    private String mImage;
    private String mTitle;
    private String mDate;
    private String mPlace;

    public EventItem(String image, String title, String date, String place) {
        mImage = image;
        mTitle = title;
        mDate = date;
        mPlace = place;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getPlace() {
        return mPlace;
    }

    public void setPlace(String place) {
        mPlace = place;
    }
}
