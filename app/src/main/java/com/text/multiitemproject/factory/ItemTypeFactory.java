package com.text.multiitemproject.factory;

import android.util.SparseArray;
import android.view.View;

import com.text.multiitemproject.R;
import com.text.multiitemproject.bean.StudentBean;
import com.text.multiitemproject.decorate.Visitable;
import com.text.multiitemproject.viewholder.BaseViewHolder;


public class ItemTypeFactory implements TypeFactory {

    private static final int ITEM_STUDENT = R.layout.layout_student_item;

    private static SparseArray<Visitable> items = new SparseArray<>();

    static {
        items.put(ITEM_STUDENT, new StudentBean());
    }

    @Override
    public int type(StudentBean studentBean) {
        return ITEM_STUDENT;
    }

    @Override
    public BaseViewHolder createViewHolder(int type, View itemView) {
        Visitable visitable = items.get(type);
        if (visitable == null) {
            return null;
        }
        return visitable.createViewHolder(itemView);
    }
}
