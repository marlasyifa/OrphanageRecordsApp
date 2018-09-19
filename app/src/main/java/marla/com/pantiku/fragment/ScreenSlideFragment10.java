package marla.com.pantiku.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import marla.com.pantiku.HalamanPanti1;
import marla.com.pantiku.R;


public class ScreenSlideFragment10 extends Fragment {

    Button mButtonNext;

    public ScreenSlideFragment10() {

    }

    @Nullable

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.screen_slide_fragment10, container, false);
        mButtonNext = (Button) rootView.findViewById(R.id.btn_next);
        mButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), HalamanPanti1.class);
                getActivity().startActivity(intent);
                getActivity().finish();
            }
        });
        return rootView;
    }
}
