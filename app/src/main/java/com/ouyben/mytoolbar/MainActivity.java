package com.ouyben.mytoolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.button)
    Button mButton;
    @Bind(R.id.fab)
    FloatingActionButton mFab;
    @Bind(R.id.button3)
    Button mButton3;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setAppbar();
        initData();
    }

    private void initData() {
        mContext = this;
    }

    private void setAppbar() {
        ToolbarUtil.setColor(this, getResources().getColor(R.color.colorPrimary));
        mToolbar.setTitle("标准标题栏");
        setSupportActionBar(mToolbar);
    }


    @OnClick({R.id.button, R.id.fab,R.id.button3})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button3:
                startActivity(new Intent(mContext, TransparentActivity.class));
                break;
            case R.id.button:
                startActivity(new Intent(mContext, NextActivity.class));
                break;
            case R.id.fab:
                Snackbar.make(view, "Go to next page", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(mContext, NextActivity.class));
                    }
                }).show();
                break;

        }
    }

}
