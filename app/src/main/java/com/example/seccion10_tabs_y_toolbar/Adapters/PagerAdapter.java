package com.example.seccion10_tabs_y_toolbar.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.seccion10_tabs_y_toolbar.Fragments.FirstFragment;
import com.example.seccion10_tabs_y_toolbar.Fragments.SecondFragment;
import com.example.seccion10_tabs_y_toolbar.Fragments.ThirdFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
  private int numberOfTabs;

  public PagerAdapter(@NonNull FragmentManager fragmentManager, int numberOfTabs) {
    super(fragmentManager);
    this.numberOfTabs = numberOfTabs;
  }

  @NonNull
  @Override
  public Fragment getItem(int position) {
    switch (position){
      case 0:
        return new FirstFragment();
      case 1:
        return new SecondFragment();
      case 2:
        return new ThirdFragment();
      default:
        return null;
    }
  }

  @Override
  public int getCount() {
    return numberOfTabs;
  }
}
