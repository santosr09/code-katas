package com.juanjo.katas.amzn;

import java.util.ArrayList;
import java.util.List;

public class DemoOne {
	
	private static List<Integer> cellCompete(int[] states, int days) {
		int[] newStates = new int[8];
		do {
			int[] dailyStates = new int[8];
			int index = 0;
			for(int state: states){
				int newState = 0;
				if (index == 0) {
					newState = (states[index+1]==0) ? 0 : 1;
				}else if (index < states.length - 1){
					newState = (states[index-1] != states[index+1]) ? 1 : 0;
				}
				else if (index == states.length - 1){
					newState = (states[index-1] == 0 ) ? 0:1 ;
				}
				dailyStates[index++] = newState;
			}
			newStates = dailyStates;
			states = newStates;
		}while( --days > 0);
		System.out.println("");
		for(int item: newStates){
			System.out.print(item + ",");
		}
		ArrayList<Integer> listStates = new ArrayList<Integer>();
		for (int item: newStates){
			listStates.add(item);
		}
		return listStates;
	}
	
	public static void main(String[] args) {
		int[] states = {1,0,0,0,0,1,0,0};
		int[] statesB = {1,1,1,0,1,1,1,1};
		
	//cellCompete(states, 1);
		cellCompete(statesB, 2);
	}
}
