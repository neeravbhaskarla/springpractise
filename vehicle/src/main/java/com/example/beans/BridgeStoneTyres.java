package com.example.beans;

public class BridgeStoneTyres implements Tyres {

    @Override
    public String rotate() {
        return "Rotating BridgeStone Tyres";
    }

    @Override
    public String applyBrakes() {
        return "applying Brakes for BridgeStone Tyres";
    }
}
