package com.enjoy.zhaofn.mylazyloadingfragment.lazy3;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.enjoy.zhaofn.mylazyloadingfragment.R;


public class Fragment5_1 extends LazyFragment2 {


    public static Fragment newIntance() {
        Fragment5_1 fragment = new Fragment5_1();
        fragment.setFragmentDelegater(new FragmentDelegater(fragment));
        return fragment;
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_5_1;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void onFragmentFirstVisible() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
