package com.example.navigationpanel_android;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {
    Button sendButton;
    EditText FIOTextView, emailTextView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        FIOTextView = view.findViewById(R.id.FIOTextView);
        emailTextView = view.findViewById(R.id.emailTextView);

        sendButton = view.findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String FIO = FIOTextView.getText().toString();
                String email = emailTextView.getText().toString();

                FIOTextView.setText(null);
                emailTextView.setText(null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Обратная связь")
                        .setMessage(FIO + ", Ваша заявка отправлена. Статус будет выслан на указанную почту: " + email)
                        .setPositiveButton("Ok", null)
                        .show();
            }
        });

        return view;
    }
}