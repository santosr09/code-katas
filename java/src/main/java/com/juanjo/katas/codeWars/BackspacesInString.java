package com.juanjo.katas.codeWars;

public class BackspacesInString {
  
    public String cleanString(String str) {
      if(null == str || str.trim().isEmpty()) return "";
      
      int i = 0, indexOfPrevious = -1;
      StringBuilder result = new StringBuilder("");
      for (char ch : str.trim().toCharArray()){
        if(ch == '#'){
          if(indexOfPrevious >= 0){
            result.deleteCharAt(indexOfPrevious);
            indexOfPrevious--;
          }
        } else {
          result.append(ch);
          indexOfPrevious++;
        }
      }
      return result.toString();
    }
  
  //Clever solution from other users
    public String cleanStringClever(String s) {
      
      while (s.matches(".*[^#]#.*")) s = s.replaceAll("[^#]#", "");
      return s.replaceAll("#","");
    }
  
  }