package edu.ucsmgy.ucsmgy_guideline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.Objects;

public class PDFViewActivity extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview);

        String pdfName = Objects.requireNonNull(getIntent().getExtras()).getString("pdfName");
        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset(pdfName).load();
    }
}
