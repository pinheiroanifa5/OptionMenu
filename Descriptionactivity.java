package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import com.example.optionm.R;

public class DescriptionActivity extends AppCompatActivity {
    TextView titleDescriptionTextView;

    TextView statusDescriptionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        ListElement element = (ListElement) getIntent().getSerializableExtra("ListElement");
        titleDescriptionTextView=findViewById(R.id.titleDescriptionTextView);
        statusDescriptionText=findViewById(R.id.StatusDescriptionTextView);

        assert element != null;
        titleDescriptionTextView.setText(element.getName());
        titleDescriptionTextView.setTextColor(Color.parseColor(element.getColor()));


        statusDescriptionText.setText(element.getStatus());
        statusDescriptionText.setTextColor(Color.GRAY);

    }
}