package com.example.a50fifty.ui.ridehistory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.a50fifty.R;

public class RideHistoryFragment extends Fragment {

    private RideHistoryViewModel rideHistoryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ride_histroy, container, false);
    }
//        rideHistoryViewModel =
//                ViewModelProviders.of(this).get(RideHistoryViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_ride_histroy, container, false);
//        final TextView textView = root.findViewById(R.id.text_slideshow);
//        rideHistoryViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
//    }
}