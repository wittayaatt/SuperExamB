package com.example;

import java.util.Arrays;

class TwoBallBilliards {
    public static void main(String[] args) {
    	int tableMts = 5;
    	
    	int[] firstBilliardPos = {0,0};
    	int firstvelocityMtsPerSec = 5;
    	int firstangleFromY = 45;
    	
    	int[] secondBilliardPos = {2,0};
    	int secondvelocityMtsPerSec = 5;
    	int secondangleFromY = 45;

    	int timeInSec = 10;
    	
        for(int i=0;i<timeInSec;i++) {
        	//first billiard
        	double distanceToSecond = vectorDistance(firstBilliardPos,secondBilliardPos);
        	double distanceToTable= vectorDistance(firstBilliardPos, new int[]{5,5});
        	
        	if (distanceToTable < tableMts) {
        		
        	}
        }
    }
    
    public static int[] vectorMinus(int[] first,int[] second){
    	int[] temp  = new int[second.length];
    	for (int i = 0; i < second.length; i++)
    		temp[i] = first[i] - second[i];
        return Arrays.copyOf(temp, temp.length);
    }
    
    public static double vectorDot(int[] first,int[] second){
    	double sum = 0.0;
    	for (int i = 0; i < second.length; i++)
    		sum = sum + (first[i] * second[i]);
        return sum;
    }
    
    public static double vectorMagnitude(int[] own) {
        return Math.sqrt(vectorDot(own,own));
    }
    
    public static int[] vectorTimes(int[] own, double alpha) {
    	int[] temp  = new int[own.length];
    	for (int i = 0; i < own.length; i++)
    		temp[i] = (new Double(alpha * own[i]).intValue());
        return Arrays.copyOf(temp, temp.length);
    }
    
    public static double vectorDistance(int[] first,int[] second) {
        return vectorMagnitude(vectorMinus(first,second));
    }
    
    public int[] direction(int[] own) {
        return vectorTimes(own, 1.0 / vectorMagnitude(own));
    }
}
