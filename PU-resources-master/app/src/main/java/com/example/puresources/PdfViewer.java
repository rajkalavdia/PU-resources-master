package com.example.puresources;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.pdf.PdfDocument;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewer extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        pdfView = findViewById(R.id.pdfView);

        String getItem = getIntent().getStringExtra("pdf file");
        if (getItem.equals("Basic Electrical Engineering")){
            pdfView.fromAsset("BasicElectricalEngineering.pdf").load();
        }


    }
}