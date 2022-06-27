package com.demo.interface_mcq.q5;
interface Engine{
    default void calculateHP() {
        System.out.println("Calculating");
    }    
}
interface TwoStrokeEngine extends Engine{
    int numberOfStrokes=2;
    default void calculateHP() {
        System.out.println("Calculating HP Of Two Stroke Engine");
    }    
}
public class RepairCentre implements Engine,TwoStrokeEngine {
    public static void main(String[] args) {
        RepairCentre obj = new RepairCentre();
        obj.calculateHP();
    }
}