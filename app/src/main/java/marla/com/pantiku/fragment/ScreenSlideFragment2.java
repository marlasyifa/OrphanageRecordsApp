package marla.com.pantiku.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import marla.com.pantiku.R;


public class ScreenSlideFragment2 extends Fragment {


    public ScreenSlideFragment2() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.screen_slide_fragment2, container, false);
    }

}