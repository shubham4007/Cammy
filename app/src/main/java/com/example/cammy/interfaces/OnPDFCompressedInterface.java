package com.example.cammy.interfaces;

public interface OnPDFCompressedInterface {
    void pdfCompressionStarted();
    void pdfCompressionEnded(String path, Boolean success);
}
