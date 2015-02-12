package com.standard.example.chapter6;

public class TvTest {
	public static void start() {
		Tv tv = new Tv();
		
		tv.channel = 7;
		tv.channelDown();
		
		System.out.println("현재 채널은 " + tv.channel + " 입니다.");
	}
	
	public static class Tv {
		String color;
		boolean power;
		int channel;
		
		void power() {
			power = !power;
		}
		
		void channelUp() {
			++channel;
		}
		
		void channelDown() {
			--channel;
		}
	}
}
