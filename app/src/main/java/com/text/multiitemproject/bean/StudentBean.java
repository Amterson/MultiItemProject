package com.text.multiitemproject.bean;

import android.view.View;

import com.text.multiitemproject.decorate.Visitable;
import com.text.multiitemproject.factory.TypeFactory;
import com.text.multiitemproject.viewholder.BaseViewHolder;
import com.text.multiitemproject.viewholder.StudentViewHolder;

public class StudentBean implements Visitable {


    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }

    @Override
    public BaseViewHolder createViewHolder(View itemView) {
        return new StudentViewHolder(itemView);
    }
}
