package com.example.amirreza.menus;

import android.content.DialogInterface;
import android.icu.text.IDNA;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.parceler.Parcels;

public class InfoActivity extends AppCompatActivity {

    private static final String TAG = InfoActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView userName, password, email;
        userName = findViewById(R.id.username);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);

        User user1 = Parcels.unwrap(getIntent().getParcelableExtra("gggg"));

        userName.setText(user1.getUserName());
        password.setText(user1.getPassword());
        email.setText(user1.getEmail());

        /*AlertDialog.Builder builder = new AlertDialog.Builder(InfoActivity.this);
        builder.setTitle("Tile");
        builder.setMessage(user1.getUserName());
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(InfoActivity.this, "ok clicked", Toast.LENGTH_SHORT).show();
                dialogInterface.dismiss();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(InfoActivity.this, "cancel clicked", Toast.LENGTH_SHORT).show();
                dialogInterface.dismiss();
            }
        });
        builder.show();*/


        /*Test test = (Test) getIntent().getExtras().getSerializable("name");
        Log.d(TAG, "onCreate: " + test.name);*/

    }
}
