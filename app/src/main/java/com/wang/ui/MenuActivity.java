package com.wang.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jpeng.jptabbar.JPTabBar;
import com.wang.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 28724 on 2018/3/26.
 */


public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.tabbar)
    JPTabBar tabbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
        tabbar.setTitles(R.string.tab1, R.string.tab2, R.string.tab3, R.string.tab4)
                .setNormalIcons(R.mipmap.tab1_normal, R.mipmap.tab2_normal, R.mipmap.tab3_normal, R.mipmap.tab4_normal)
                .setSelectedIcons(R.mipmap.tab1_selected, R.mipmap.tab2_selected, R.mipmap.tab3_selected, R.mipmap.tab4_selected)
                .generate();
        getSupportActionBar().hide();

    }
}
