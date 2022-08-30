package com.corn.decorator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("apikey=(.+)&");
		Matcher matcher = pattern.matcher("apikey=ddd&");


		if (matcher.find()) {
			System.out.println("찾음");
			System.out.println(matcher.group(1));
		}
	}
}

