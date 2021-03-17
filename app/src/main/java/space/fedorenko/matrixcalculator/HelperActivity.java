package space.fedorenko.matrixcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.transition.Visibility;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class HelperActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helper);

        Button one = findViewById(R.id.aboutOperations);
        one.setOnClickListener(this);
        Button two = findViewById(R.id.aboutDet);
        two.setOnClickListener(this);
        Button three = findViewById(R.id.aboutInverse);
        three.setOnClickListener(this);
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        LinearLayout layout = null;
        switch (v.getId()) {
            case R.id.aboutOperations:
                layout = findViewById(R.id.helperOper);
                break;
            case R.id.aboutDet:
                layout = findViewById(R.id.helperDet);
                break;
            case R.id.aboutInverse:
                layout = findViewById(R.id.helperInverse);
                break;
            default:
                break;
        }

        try {
            assert layout != null;
            if(layout.getVisibility() == View.GONE)
                layout.setVisibility(View.VISIBLE);
            else
                layout.setVisibility(View.GONE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}