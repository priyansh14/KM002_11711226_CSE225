package com.example.a11711226cse225;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SquareFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SquareFragment extends Fragment implements View.OnClickListener{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";





EditText et2 ,et3;
EditText et;
Button b;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SquareFragment() {
        // Required empty public constructor
    }


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SquareFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SquareFragment newInstance(String param1, String param2) {
        SquareFragment fragment = new SquareFragment();
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

        View v = inflater.inflate(R.layout.fragment_square, container, false);
        et = (EditText) v.findViewById(R.id.ETNUMBER);
        et2 = (EditText) v.findViewById(R.id.ETSQUARED1);
        et3 = (EditText)v.findViewById(R.id.ETSQUARED2);
        b = (Button)v.findViewById(R.id.calc);
        MainActivity m2 = new MainActivity();
        String num = m2.getN();


        et2.setText(num);
        int sq = Integer.parseInt(num);
        sq = sq*sq;
        String numsq = Integer.toString(sq);
        et3.setText(numsq);




        return v;
    }
    @Override
    public void onResume()
    {
            super.onResume();
        MainActivity m2 = new MainActivity();
        String num = m2.getN();


        et2.setText(num);
        int sq = Integer.parseInt(num);
        sq = sq*sq;
        String numsq = Integer.toString(sq);
        et3.setText(numsq);


    }


    @Override
    public void onClick(View v) {

    }




}
