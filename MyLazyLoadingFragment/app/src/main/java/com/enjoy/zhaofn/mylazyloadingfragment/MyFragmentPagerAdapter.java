package com.enjoy.zhaofn.mylazyloadingfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.List;

/**
 * @author zhaofn
 * @package com.enjoy.zhaofn.mylazyloadingfragment
 * @fileName MyFragmentPagerAdapter
 * @date on 2019/6/10
 * @qq 2464061231
 **/
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private static final String TAG = "MyFragmentPagerAdapter";

    private List<Fragment> fragmentList;
    public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> flist) {
        super(fm);
        fragmentList = flist;
    }
    @Override
    public Fragment getItem(int i) {
        Log.d(TAG, "getItem: " + i);
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }


}
