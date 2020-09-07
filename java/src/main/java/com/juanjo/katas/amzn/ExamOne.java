package com.juanjo.katas.amzn;

import java.util.*;
import java.util.stream.Collectors;

public class ExamOne {
	
	public static ArrayList<String> popularNFeatures(int numFeatures,
																						int topFeatures,
																						List<String> possibleFeatures,
																						int numFeatureRequests,
																						List<String> featureRequests) {
		TreeMap<String, Integer> rank = new TreeMap<String, Integer>();
			for (String feature : possibleFeatures) {
				String currentFeature = feature.toLowerCase();
				for(String item : featureRequests) {
					List<String> quotes = featureRequests.stream()
																	 .map(String::toLowerCase)
																	 .collect(Collectors.toList());
					for (String words : quotes){
						if (Arrays.asList(words.split("\\s+")).contains(feature)) {
							rank.put(feature ,
									(rank.get(feature)!= null) ? rank.get(feature)+1: 1);
						}
						
					}
				}
	}
//		rank.values().stream().fo
		return (ArrayList<String>) rank.keySet();
	}
	
	
	public static void main(String[] args) {
		String[] possibleArr = {"anacell", "betacellular", "cetracular", "deltacellular", "eurocell"};
		ArrayList<String> possibleFeatures = new ArrayList<String>();
		
		for(String item : possibleArr){
			possibleFeatures.add(item);
		}

		String[] inputFeaturesRequestOne = {"Best Services provide by anacell",
				"betacellular has great services",
				"anacell provides much better services than all other"};
		
		ArrayList<String> requestsOne = new ArrayList<String>();
		
		for(String item : inputFeaturesRequestOne){
			requestsOne.add(item);
		}
		
		
		String[] inputFeaturesRequestTwo = {"I love anacell best servi provi by anacell in the town",
				"betacellular has gret service",
				"deltacellular provides much better serv than betacellular",
				"cetracular is worse than eurocell",
				"betacellular is better than deltacellular"};
		
		ArrayList<String> requestsTwo = new ArrayList<String>();
		
		for(String item : inputFeaturesRequestTwo){
			requestsTwo.add(item);
		}
		
		popularNFeatures(5, 2, possibleFeatures, 3, requestsOne);
	
	}
}
