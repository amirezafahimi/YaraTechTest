package com.example.amirreza.menus;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.text.ParcelableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import org.parceler.Parcels;

import java.net.URI;
import java.net.URISyntaxException;


public class RegisterFragment extends Fragment {
    EditText userName, password, email;
    Button enter, cancel;
    ImageView logo;
    public RegisterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_register, container, false);
        userName = view.findViewById(R.id.username);
        password = view.findViewById(R.id.password);
        email = view.findViewById(R.id.email);
        enter = view.findViewById(R.id.enter);
        cancel = view.findViewById(R.id.cancel);
        logo = view.findViewById(R.id.yaraIcon);
        Glide.with(view).load("http://yaramobile.com/templates/sj_hexagon/images/styling/blue/logo.png").into(logo);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User(userName.getText().toString(), password.getText().toString(), email.getText().toString());

                Intent intent = new Intent(getContext(), InfoActivity.class);
                intent.putExtra("gggg",Parcels.wrap(user));
                startActivity(intent);

            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}
