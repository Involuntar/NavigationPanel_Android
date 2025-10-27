package com.example.navigationpanel_android;

import android.app.NotificationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Objects;

public class ThirdFragment extends Fragment {
    ImageButton pushButton;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        MyPushNotification myPushNotification = new MyPushNotification(getActivity(),
                requireActivity().getSystemService(NotificationManager.class));

        pushButton = view.findViewById(R.id.PushButton);
        pushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myPushNotification.sendNotify("Информация о студенте","ФИО: Неволин Илья Александрович\nГруппа: Т-423901-НТ ИСиТ");
            }
        });

        return view;
    }
}