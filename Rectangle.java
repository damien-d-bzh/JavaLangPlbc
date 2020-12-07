package com.DamienDebroize;

//import java.util.Scanner;

//import java.util.*;
public class Rectangle {
    public float x_1, x_2, y_1, y_2, longueur, largeur;
    //Scanner clavier=new Scanner(System.in);

    Rectangle(float x_1, float x_2, float y_1, float y_2){
        this.x_1=x_1;
        this.x_2=x_2;
        this.y_1=y_1;
        this.y_2=y_2;
    }

    private float setLongueurRectangle(float x_1, float x_2){
        return x_2-x_1;
    }

    private float setLargeurRectangle(float y_1, float y_2){
         return y_2-y_1;
    }

    public float getLongueurRectangle(){
        return setLongueurRectangle(x_1, x_2);
    }

    public float getLargeurRectangle(){
        return setLargeurRectangle(y_1, y_2);
    }

    private float setPerimetre(float x_1, float x_2, float y_1, float y_2){
        return (2*(x_2-x_1))+(2*(y_2-y_1));
    }

    public float getPerimetre(){
        return setPerimetre(x_1, x_2, y_1, y_2);
    }

    private float setAire(float x_1, float x_2, float y_1, float y_2){
        return ((x_2-x_1)*(y_2-y_1));
    }

    public float getAire(){
        return setAire(x_1, x_2, y_1, y_2);
    }
}
