package com.example.layeredarchitecture.DAO;

public class Sample {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.print(12,11,23,44,33,22,55,66,77,88);
    }

    public  void print(int...a){
        for (int i : a) {
            System.out.println(i);
        }
    }
}
