package com.example.navigationpanel_android;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {
    Button answerButton;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        answerButton = view.findViewById(R.id.answerButton);
        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

                String[] items = {"1", "2", "3"};
                builder.setTitle("Вопрос")
                        .setItems(items, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // 'which' is the index of the selected item (0-based)
                                String selectedItem = items[which];
                                if (selectedItem == "3") {
                                    Toast.makeText(getActivity(), "Вы выбрали правильный ответ!", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(getActivity(), "Вы ошиблись!", Toast.LENGTH_SHORT).show();
                                }

                            }
                        })
                        .show();
            }
        });

        return view;
    }
}