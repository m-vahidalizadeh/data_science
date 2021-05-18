package com.gloriousoft;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class DataFormatting {

    public static void main(String[] args) {
        // Univariate array
        String[] names = {"Mohammad Alizadeh", "Ali Alizadeh", "Mahnaz Heidarzadeh"};
        Integer[] ids = {123, 321, 334};
        Boolean[] likesPizza = {false, true, true};
        // Multivariate arrays
        Integer[] person1 = {123, 0, 1993, 4, 3};
        Integer[] person2 = {124, 1, 1993, 5, 2};
        Integer[] person3 = {153, 1, 1993, 6, 3};
        // Matrices
        double[][] peopleData = {
                {123, 0, 1993, 4, 3},
                {124, 1, 1993, 5, 2},
                {153, 1, 1993, 6, 3}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(peopleData);
    }

}
