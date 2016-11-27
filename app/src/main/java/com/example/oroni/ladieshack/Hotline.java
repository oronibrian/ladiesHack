package com.example.oroni.ladieshack;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class Hotline extends Fragment {

    ListView lv;

    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;


    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;


    // Listview Data
    String [] hotlines_list;



    public Hotline() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        /** My Code starts over here **/
        hotlines_list=getResources().getStringArray(R.array.national_hotlines);
        View myview=inflater.inflate(R.layout.fragment_hotline, container, false);

            lv = (ListView) myview.findViewById(R.id.list_view);
            inputSearch = (EditText) myview.findViewById(R.id.inputSearch);

            // Adding items to listview
            // do this later, for multiple row listview http://www.technotalkative.com/android-listview-3-custom-listview/
            adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item, R.id.product_name, hotlines_list);
            lv.setAdapter(adapter);

            /**
             * Enabling Search Filter
             * */
            inputSearch.addTextChangedListener(new TextWatcher() {

                @Override
                public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                    // When user changed the Text
                    Hotline.this.adapter.getFilter().filter(cs);
                }

                @Override
                public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                              int arg3) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void afterTextChanged(Editable arg0) {
                    // TODO Auto-generated method stub
                }
            });
        return myview;
        }


    }


