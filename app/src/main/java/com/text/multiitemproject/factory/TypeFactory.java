package com.text.multiitemproject.factory;

import android.view.View;

import com.text.multiitemproject.bean.StudentBean;
import com.text.multiitemproject.viewholder.BaseViewHolder;

public interface TypeFactory {

    int type(StudentBean studentBean);

    BaseViewHolder createViewHolder(int type, View itemView);
}
