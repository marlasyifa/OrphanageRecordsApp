package marla.com.pantiku.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import marla.com.pantiku.fragment.ScreenSlideFragment1;
import marla.com.pantiku.fragment.ScreenSlideFragment10;
import marla.com.pantiku.fragment.ScreenSlideFragment2;
import marla.com.pantiku.fragment.ScreenSlideFragment3;
import marla.com.pantiku.fragment.ScreenSlideFragment4;
import marla.com.pantiku.fragment.ScreenSlideFragment5;
import marla.com.pantiku.fragment.ScreenSlideFragment6;
import marla.com.pantiku.fragment.ScreenSlideFragment7;
import marla.com.pantiku.fragment.ScreenSlideFragment8;
import marla.com.pantiku.fragment.ScreenSlideFragment9;

/**
 * Created by Taufiq on 7/4/2017.
 */

public class ScreenSlidePagerAdapter  extends FragmentPagerAdapter {

    public ScreenSlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //method ini yang akan memanipulasi penampilan Fragment dilayar
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new ScreenSlideFragment1();
                break;
            case 1:
                fragment = new ScreenSlideFragment2();
                break;
            case 2:
                fragment = new ScreenSlideFragment3();
                break;
            case 3:
                fragment = new ScreenSlideFragment4();
                break;
            case 4:
                fragment = new ScreenSlideFragment5();
                break;
            case 5:
                fragment = new ScreenSlideFragment6();
                break;
            case 6:
                fragment = new ScreenSlideFragment7();
                break;
            case 7:
                fragment = new ScreenSlideFragment8();
                break;
            case 8:
                fragment = new ScreenSlideFragment9();
                break;
            case 9:
                fragment = new ScreenSlideFragment10();
                break;
            default:
                fragment = null;
                break;
        }

        return fragment;
    }
    // ini jumlah slide nya
    @Override
    public int getCount() {
        return 10;
    }
}