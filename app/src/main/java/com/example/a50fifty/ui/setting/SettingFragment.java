package com.example.a50fifty.ui.setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.a50fifty.R;

public class SettingFragment extends Fragment {

    private SettingViewModel settingViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }
//        settingViewModel =
//                ViewModelProviders.of(this).get(SettingViewModel.class);
//
////        View root = inflater.inflate(R.layout.fragment_settings, container, false);
//        //final TextView textView = root.findViewById(R.id.text_home);
//        //settingViewModel.getText().observe(this, new Observer<String>() {
//          //  @Override
//            //public void onChanged(@Nullable String s) {
//              //  textView.setText(s);
//            //}
//        //});
//        return root;
//    }
}