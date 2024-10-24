package com.shubham.Basics;

public class Multithreading implements Runnable{
    public static void main(String[] args) {
        new Thread(new Multithreading("Wall")).start();
        new Thread(new Multithreading("sole")).start();
    }
    private String name;
    public Multithreading(String name){
        this.name = name;
    }
    public void run(){
        message(1);
        message(2);
    }
    private synchronized void message(int n){
        System.out.println(name + "-" + n + " ");
    }
}
