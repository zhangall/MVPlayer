package com.itheima.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by Allison on 2017/1/15.
 *
 * @des 对Fragment进行抽取,减少代码的冗余
 */

public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root=inflater.inflate(getLayoutResIdz(),null);
        ButterKnife.bind(this,root);
        return root;

    }

    public abstract int getLayoutResIdz();
}
