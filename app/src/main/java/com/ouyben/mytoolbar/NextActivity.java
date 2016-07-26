package com.ouyben.mytoolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NextActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.button2)
    Button mButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        ButterKnife.bind(this);
        setAppbar();
    }

    private void setAppbar() {
        ToolbarUtil.setColorNoTranslucent(this,getResources().getColor(R.color.colorPrimary));
        mToolbar.setTitle("纯色标题栏");
        setSupportActionBar(mToolbar);
    }

    @OnClick(R.id.button2)
    public void onClick() {
        finish();
    }
}
