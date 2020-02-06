package edu.ucsmgy.ucsmgy_guideline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button firstBtn, secondBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstBtn = findViewById(R.id.firstBtn);
        secondBtn = findViewById(R.id.secondBtn);

        firstBtn.setOnClickListener(this);
        secondBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(getApplicationContext(),PDFViewActivity.class);
        switch (id){
            case R.id.firstBtn:
                intent.putExtra("pdfName","first20192020.pdf");
                startActivity(intent);
                break;
            case R.id.secondBtn:
                intent.putExtra("pdfName","second20192020.pdf");
                startActivity(intent);
                break;
                default:
                    Toast.makeText(getApplicationContext(),"Thanks",Toast.LENGTH_SHORT).show();
        }
    }
}
