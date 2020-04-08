package com.text.multiitemproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.text.multiitemproject.decorate.Visitable;
import com.text.multiitemproject.factory.ItemTypeFactory;
import com.text.multiitemproject.factory.TypeFactory;
import com.text.multiitemproject.viewholder.BaseViewHolder;

import java.util.List;

public class MultiTypeAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<Visitable> mData;
    private TypeFactory typeFactory;

    public MultiTypeAdapter(List<Visitable> mData) {
        this.mData = mData;
        this.typeFactory = new ItemTypeFactory();
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return typeFactory.createViewHolder(viewType, view);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bindViewData(mData.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return mData.get(position).type(typeFactory);
    }

    @Override
    public int getItemCount() {
        return (mData != null ? mData.size() : 0);
    }
}
