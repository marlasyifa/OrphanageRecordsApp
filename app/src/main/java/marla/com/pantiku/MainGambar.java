package marla.com.pantiku;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import marla.com.pantiku.adapter.ScreenSlidePagerAdapter;
import me.relex.circleindicator.CircleIndicator;


/**
 * Created by Taufiq on 7/5/2017.
 */

public class MainGambar extends AppCompatActivity {
    private PagerAdapter mPagerAdapter;
    private ViewPager viewPager;
    private CircleIndicator circleIndicator;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambar);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        circleIndicator = (CircleIndicator)findViewById(R.id.circleIndicator);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mPagerAdapter);
        circleIndicator.setViewPager(viewPager);
    }
}
