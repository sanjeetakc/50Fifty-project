package com.example.a50fifty.ui.notification;

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

public class NotificationFragment extends Fragment {

    private NotificationViewModel notificationViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notification, container, false);
//        notificationViewModel =
//                ViewModelProviders.of(this).get(NotificationViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_notification, container, false);
//        final TextView textView = root.findViewById(R.id.text_send);
//        notificationViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
    }
}