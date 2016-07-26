package com.ouyben.mytoolbar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TransparentActivity extends AppCompatActivity {

    @Bind(R.id.fab)
    FloatingActionButton mFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ToolbarUtil.removeStatusBar(this);
        setContentView(R.layout.activity_transparent);
        ButterKnife.bind(this);
        setAppbar();
    }

    private void setAppbar() {


    }

    @OnClick(R.id.fab)
    public void onClick() {
    }
}
