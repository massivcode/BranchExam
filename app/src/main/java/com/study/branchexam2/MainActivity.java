package com.study.branchexam2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mTitleEditText;
    private EditText mContentsEditText;
    private RecyclerView mMemoRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTitleEditText = (EditText) findViewById(R.id.main_title_et);
        mContentsEditText = (EditText) findViewById(R.id.main_contents_et);
        findViewById(R.id.main_memo_add_btn).setOnClickListener(mOnMemoAddClicked);
        mMemoRecyclerView = (RecyclerView) findViewById(R.id.main_memo_rv);
        mMemoRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

    private View.OnClickListener mOnMemoAddClicked = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
}
