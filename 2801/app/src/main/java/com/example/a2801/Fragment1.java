package com.example.a2801;

import android.os.Bundle;
import android.view.*;
import android.widget.*;

import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1, container, false);

        EditText editA = view.findViewById(R.id.editA);
        Button btn = view.findViewById(R.id.btnCalc);
        TextView result = view.findViewById(R.id.result);

        btn.setOnClickListener(v -> {
            double a = Double.parseDouble(editA.getText().toString());
            double S = a * a;
            result.setText("S = " + S);
        });

        return view;
    }
}