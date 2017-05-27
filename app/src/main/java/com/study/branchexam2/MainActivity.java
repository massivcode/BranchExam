package com.study.branchexam2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mTitleEditText;
    private EditText mContentsEditText;
    private RecyclerView mMemoRecyclerView;
    private MemoAdapter mMemoAdapter;


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

        mMemoAdapter = new MemoAdapter();

        mMemoRecyclerView = (RecyclerView) findViewById(R.id.main_memo_rv);
        mMemoRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mMemoRecyclerView.setAdapter(mMemoAdapter);
    }

    private View.OnClickListener mOnMemoAddClicked = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String title = mTitleEditText.getText().toString();

            if (TextUtils.isEmpty(title) || title.length() < 1) {
                Toast.makeText(MainActivity.this, "제목을 입력하세요!", Toast.LENGTH_SHORT).show();
                return;
            }

            String contents = mContentsEditText.getText().toString();

            if (TextUtils.isEmpty(contents) || contents.length() < 1) {
                Toast.makeText(MainActivity.this, "내용을 입력하세요!", Toast.LENGTH_SHORT).show();
                return;
            }

            Memo memo = new Memo(title, contents);
            mMemoAdapter.addMemo(memo);
        }
    };
}
