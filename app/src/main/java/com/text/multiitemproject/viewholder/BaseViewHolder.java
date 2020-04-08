package com.text.multiitemproject.viewholder;

import android.util.SparseArray;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    private SparseArray<View> mViews;

    protected View mItemView;

    public BaseViewHolder(View itemView) {
        super(itemView);
        mItemView = itemView;
        mViews = new SparseArray<>();
    }

    public View getView(int resId) {
        View view = mViews.get(resId);

        if(view== null) {
            view = mItemView.findViewById(resId);
            mViews.put(resId, view);
        }
        return view;
    }

    public abstract void bindViewData(T data);
}
