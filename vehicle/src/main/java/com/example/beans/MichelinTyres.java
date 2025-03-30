package com.example.beans;

public class MichelinTyres implements Tyres {
    @Override
    public String rotate() {
        return "Rotating Michelin Tyres";
    }

    @Override
    public String applyBrakes() {
        return "applyBrakes for Michelin Tyres";
    }
}