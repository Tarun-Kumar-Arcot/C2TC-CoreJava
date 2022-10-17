package com.cg.Assignment;

import java.util.Iterator;

public class StringInbuiltFunctions {

	public static void main(String[] args) {
		
		// substring()
		String string = "Hardik Pandya";
		System.out.println(string.substring(7));
		System.out.println(string.substring(0, 7));
		
		// replace()
		String string2 = "Negative thoughts";
		String replaceString = string2.replace('e', 'a');
		System.out.println(replaceString);
		
		String replaceString2 = string2.replace("Negative", "Positive");
		System.out.println(replaceString2);
		
		// contains()
		String string3 = "what do you know about me.";
		System.out.println(string3.contains("do you know about me"));
		System.out.println(string3.contains("about"));
		System.out.println(string3.contains("hello"));
		
		// equalsIgnoreCase()
		String string4 = "The Walking dead";
		String string5 = "The Walking dead";
		String string6 = "THE WALKING DEAD";
		String string7 = "The WEST WEED";
		System.out.println(string4.equalsIgnoreCase(string5));
		System.out.println(string4.equalsIgnoreCase(string6));
		System.out.println(string4.equalsIgnoreCase(string7));
		
		// IndexOf()
		String string8 = "This is the world";
		int index4 = string8.indexOf('s');
        System.out.println(index4);
        int index1 = string8.indexOf("is");
        int index2 = string8.indexOf("world");
        System.out.println(index1);
        System.out.println(index2);
        int index3 = string8.indexOf("is",4);
        System.out.println(index3);
        
        // LastIndexOf()
        int index5 = string8.lastIndexOf('s');
        System.out.println(index5);
        
        // length()
        String string9 = "Programming";
        System.out.println(string9.length());
        String string10 = "Let's continue";
        System.out.println(string10.length());
        
        // charAt()
        String string11 = "Java";
        char ch = string11.charAt(2);
        System.out.println(ch);
        
        // toUpperCase()
        String string12 = "Java is best programming language";
        System.out.println(string12.toUpperCase());
        
        // toLowerCase()
        System.out.println(string12.toLowerCase());
        
        // concat()
        String string13  = "Nice ";
        String string14 = "Day";
        System.out.println(string13.concat(string14));
        
        // + operator
        String string15 = "Are ", string16 = "you ", string17 = "ready";
        System.out.println(string15 + string16 + string17);
        
        // trim()
        String string18  = " Games of ";
        System.out.println(string18 + "thrones");
        System.out.println(string18.trim() + "thrones");
        
        // toCharArray()
        String string19 = "TWILIGHT SAGA";
        char[] ch2 = string19.toCharArray();
        for(int i = 0; i < ch2.length; i++) {
        	System.out.println(ch2[i]);
        }
        
        // startsWith()
        String string20 = "You must be the change you wish to see in the world";
        System.out.println(string20.startsWith("y"));
        System.out.println(string20.startsWith("You must"));
        System.out.println(string20.startsWith("a"));
        System.out.println(string20.startsWith("o",1));
        
        
        // endsWith()
        String string21 = "Beauty is in the eye of the beholder";
        System.out.println(string21.endsWith("r"));
        System.out.println(string21.endsWith("holder"));
        System.out.println(string21.endsWith("holder"));
        System.out.println(string21.endsWith("eye"));
        
        // format()
        String string22 = "CSK";
        String sf1 = String.format("%s",string22);
        String sf2 = String.format("%f", 32.33434);
        System.out.println(sf1);
        System.out.println(sf2);
        
        // isEmpty()
        String string23 = "";
        String string24 = "java";
        System.out.println(string23.isEmpty());
        System.out.println(string24.isEmpty());
        
        // join()
        String joinString25 = String.join("","welcome", "to", "jurassic", "world");
        System.out.println(joinString25);
        System.out.println(joinString25);
        
        // valueOf()
        int value = 30;
        String string26 = String.valueOf(value);
        System.out.println(value + 10);
        System.out.println(string26 + 10);
        
        
	}

}
