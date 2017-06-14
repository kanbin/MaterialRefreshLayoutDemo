package com.kb.materialrefreshlayoutdemo;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by SONY on 2017/6/14.
 */
public class QuickAdapter extends BaseQuickAdapter<Status, BaseViewHolder> {

    public QuickAdapter(List<Status> data) {
        super(R.layout.item_refresh, data);
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, Status item) {

        Glide.with(mContext).load(item.getId()).crossFade().into((ImageView) viewHolder.getView(R.id.avatar));
    }
}
