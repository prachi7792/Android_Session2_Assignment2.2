package com.acadgild.javaassignment2_2.core;

public class Xpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p,q;
		for(p = 1; p <= 5; p++){
			for(q = 1; q <= 5; q++){
				if(q == p || q == 5-p+1){
				System.out.print("*");}
				
				else if(q < 5-p+1){
					System.out.print("_");
					}
				
				else if(q < p){
					System.out.print("_");
				}
			}
			System.out.println();
	       
		}
		
		}
		
	}
		