package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WeatherAndForecastFragmentOne#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WeatherAndForecastFragmentThree extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String TAG = "WeatherUSTH";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WeatherAndForecastFragmentThree() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WeatherAndForecastFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WeatherAndForecastFragmentOne newInstance(String param1, String param2) {
        WeatherAndForecastFragmentOne fragment = new WeatherAndForecastFragmentOne();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_weather_and_forecast_three, container, false);

        ImageButton sb = view.findViewById(R.id.setting_button_three);
        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Setting!");
            }
        });

        ImageButton rb = view.findViewById(R.id.refresh_button_three);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Refresh!");
            }
        });

        return view;
    }

}