package com.styleru.styleruapp.presentation.main_screen.events_screen;

import com.arellomobile.mvp.MvpView;

import java.util.List;


interface EventsView extends MvpView{
    void showData(List<EventItem> items);
}
