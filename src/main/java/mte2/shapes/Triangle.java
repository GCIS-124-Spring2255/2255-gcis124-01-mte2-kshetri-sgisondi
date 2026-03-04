// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Triangle.java

package mte2.shapes;

// public class Triangle {
public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA,double sideB,double sideC) { this.sideA = sideA; this.sideB = sideB; this.sideC = sideC; }

    @Override

    @Override
    public double area() {    double p = perimeter()  / 2;    }

    // Same as rectangle and circle use the formulas and override them
    // use a+b+c to calculate perimeter
    //use sqaure root of s(s-a)(s-b)(s-c) to find area

    // I can see in my head what to do just cant rememeber how write it for these
    public static void main(String[] args) {
        
        // ...

    }
}