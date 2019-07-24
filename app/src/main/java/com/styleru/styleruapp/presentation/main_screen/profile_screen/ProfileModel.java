package com.styleru.styleruapp.presentation.main_screen.profile_screen;

import com.styleru.styleruapp.presentation.main_screen.people_screen.PeopleRecyclerModel;

import java.util.List;

public class ProfileModel extends PeopleRecyclerModel{
    private String mEmail;
    private String mPhoneNumber;
    private List<LinkItem> mLinks;

    public ProfileModel(String firstName, String secondName, String directions, String photo, String ID, String email, String phoneNumber, List<LinkItem> links) {
        super(firstName, secondName, directions, photo, ID);
        mEmail = email;
        mPhoneNumber = phoneNumber;
        mLinks = links;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        mPhoneNumber = phoneNumber;
    }

    public List<LinkItem> getLinks() {
        return mLinks;
    }

    public void setLinks(List<LinkItem> links) {
        mLinks = links;
    }
}

