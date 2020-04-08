package com.text.multiitemproject.decorate;

import android.view.View;

import com.text.multiitemproject.factory.TypeFactory;
import com.text.multiitemproject.viewholder.BaseViewHolder;

public interface Visitable {

    int type(TypeFactory typeFactory);

    BaseViewHolder createViewHolder(View itemView);
}
