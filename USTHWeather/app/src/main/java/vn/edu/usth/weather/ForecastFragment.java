package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ForecastFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_forecast, container, false);
        //view.setBackgroundColor(Color.parseColor("#20FF0000"));

        return v;
    }
}

/// Labwork 4
// LinearLayout ll = new LinearLayout(getActivity());
//        ll.setOrientation(LinearLayout.VERTICAL);
//        ll.setBackgroundColor(0x20FF0000);
//
//        TextView tv = new TextView(getActivity());
//        tv.setText("Thursday");
//
//        ImageView iv = new ImageView(getActivity());
//        iv.setImageResource(R.drawable.cloudy);
//
//        ll.addView(tv);
//        ll.addView(iv);
