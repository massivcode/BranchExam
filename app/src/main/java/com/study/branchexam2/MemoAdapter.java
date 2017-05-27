package com.study.branchexam2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by massivcode@gmail.com on 2017. 5. 27. 11:58
 */

public class MemoAdapter extends RecyclerView.Adapter<MemoAdapter.MemoViewHolder> {

    private List<Memo> mMemos = new ArrayList<>();

    @Override
    public MemoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MemoViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_memo, parent, false));
    }

    @Override
    public void onBindViewHolder(MemoViewHolder holder, int position) {
        Memo item = mMemos.get(position);
        holder.mTitleTextView.setText(item.getTitle());
        holder.mContentsTextView.setText(item.getContents());
    }

    public void addMemo(Memo memo) {
        mMemos.add(memo);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mMemos == null ? 0 : mMemos.size();
    }

    class MemoViewHolder extends RecyclerView.ViewHolder {
        TextView mTitleTextView;
        TextView mContentsTextView;

        public MemoViewHolder(View itemView) {
            super(itemView);

            mTitleTextView = (TextView) itemView.findViewById(R.id.item_memo_title_tv);
            mContentsTextView = (TextView) itemView.findViewById(R.id.item_memo_contents_tv);
        }
    }
}
