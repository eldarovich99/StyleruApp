package com.styleru.styleruapp;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoryPagerActivity extends AppCompatActivity {
    @BindView(R.id.category_view_pager) ViewPager mViewPager;

    public static Intent createCategoryPagerActivity(Context packageContext){
        Intent intent = new Intent(packageContext, CategoryPagerActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_pager);

        init();
    }

    private void init(){
        ButterKnife.bind(this);
        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentPagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int i) {
                switch (i){
                    case 0:
                        setTitle(Html.fromHtml("<font color='#ffffff'>Направления </font>"));
                        return CategoryFragment.newInstance();
                    case 1:
                        return ProfileFragment.newInstance();
                    case 2:
                        return PeopleFragment.newInstance();
                }
            return null;
            }

            @Override
            public int getCount() {
                return 3;
            }
        });
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
            }

            @Override
            public void onPageSelected(int i) {
                switch (i){
                    case 0:
                        setTitle(Html.fromHtml("<font color='#ffffff'>Направления </font>"));
                        break;
                    case 1:
                        setTitle(Html.fromHtml("<font color='#ffffff'>Профиль </font>")); // need to use sharedPreferences to get username
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {
            }
        });
    }
}
