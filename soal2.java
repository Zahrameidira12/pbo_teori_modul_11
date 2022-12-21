/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */    
public abstract class soal2 {
private String nama;
Shape(String aNama) {
nama=aNama;
}
public String getName() {
return nama;
}
public abstract float getArea();
}
class Circle extends Shape {
private int jari2;
Circle(String aNama) {
super(aNama);
jari2= 3;
}
public float getArea() {
float area;
area = (float) (3.14 * jari2 * jari2);
return area;
}
}
class Square extends Shape {
private int sisi;
Square(String aNama) {
super(aNama);
sisi = 3;
}
public float getArea() {
int area;
area = sisi * sisi;
return area;
}
}