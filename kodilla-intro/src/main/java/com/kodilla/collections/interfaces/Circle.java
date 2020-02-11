package com.kodilla.collections.interfaces;

public class Circle {

        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getPole(){
            return Math.PI*radius*radius;
        }
        public double getObowd(){
            return  2*Math.PI*radius;
        }
}

