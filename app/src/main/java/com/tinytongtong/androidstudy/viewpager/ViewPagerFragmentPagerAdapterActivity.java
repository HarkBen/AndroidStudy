package com.tinytongtong.androidstudy.viewpager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.tinytongtong.androidstudy.R;

/**
 * @Description: ViewPager + FragmentPagerAdapter
 * @Author tinytongtong
 * @Date 2021/1/21 8:27 PM
 * @Version
 */
public class ViewPagerFragmentPagerAdapterActivity extends AppCompatActivity {

    public static void actionStart(Context context) {
        Intent starter = new Intent(context, ViewPagerFragmentPagerAdapterActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_fragment_pager_adapter);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        Fragment fragment = ViewPagerParentFragment.newInstance("ViewPager", "");
        transaction
                .add(R.id.fl_container, fragment)
                .show(fragment)
                .commitAllowingStateLoss();
    }
}