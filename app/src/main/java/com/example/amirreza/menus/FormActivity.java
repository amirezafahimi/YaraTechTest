package com.example.amirreza.menus;

import android.app.Fragment;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity implements NameFragment.name, FamilyFragment.family, SubmitFragment.buttonPressed {

    String name, family;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Context context;
        NameFragment nameFragment = new NameFragment();
        FamilyFragment familyFragment = new FamilyFragment();
        SubmitFragment submitFragment = new SubmitFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.name, nameFragment);
        transaction.replace(R.id.family, familyFragment);
        transaction.replace(R.id.submit, submitFragment);
/*
        transaction.addToBackStack(null);
*/
        transaction.commit();
    }

    @Override
    public void submit() {
        Toast.makeText(getApplicationContext(),name+" "+family, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void getName(String name) {
        this.name=name;
    }

    @Override
    public void getFamily(String family) {
        this.family=family;
    }
}
