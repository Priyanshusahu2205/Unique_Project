package com.lmsInterview4;

public class HillStations {
	
	public void location() {
		System.out.println("There is a Beautiful Hill station.");
	}
	
	public void famousFor() {
		System.out.println("Famous for the natural beauty of mountains and rivers.");
	}

}
public class Manali extends HillStations {
	
	public void location() {
		System.out.println("Manali is located in Himachal Pradesh.");
	}
	
	public void famousFor() {
		System.out.println("Manali is famous for the beautiful snow mountains, rivers and adventure sports.");
	}

}
public class Gulmarg extends HillStations {
	
	public void location() {
		System.out.println("Gulmarg is located in Jammu and Kashmir.");
	}
	
	public void famousFor() {
		System.out.println("Gulmarg is famous for the skiing in natural beauty of snow mountains.");
	}

}
public class Mussoorie extends HillStations {
	
	public void location() {
		System.out.println("Mussoorie is located in Uttarakhand.");
	}
	
	public void famousFor() {
		System.out.println("Mussoorie is famous for scenic hills and beauty of nature.");
	}

}
public class MainHillS {
	
	public static void main(String[] args) {
		
		HillStations h1 = new Manali();
		h1.location();
		h1.famousFor();
		
		System.out.println();
		
		HillStations h2 = new Mussoorie();
		h2.location();
		h2.famousFor();
		
		System.out.println();
		
		HillStations h3 = new Gulmarg();
		h3.location();
		h3.famousFor();
		
		System.out.println();
	}

}

