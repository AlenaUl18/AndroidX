package com.example.myapplicationnew;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BlankFragment1 extends Fragment {

    public BlankFragment1() {
        super(R.layout.fragment_blank1);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("key", "Из фрагмента 1");
                Navigation.findNavController(view).navigate(R.id.action_blankFragment1_to_blankFragment2,bundle);
            }
        });
        Button button2 = view.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("key", "Из фрагмента 1");
                Navigation.findNavController(view).navigate(R.id.action_blankFragment1_to_blankFragment3,bundle);
            }
        });
    }
}