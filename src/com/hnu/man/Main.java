package com.hnu.man;

import java.util.*;
import java.io.*;

class Hotel{
 private int hotelID;
  public int getHotelID(){
  return this.hotelID;
  }
  public void setHotelID(int hotelID){
  this.hotelID = hotelID;
  }
  public Hotel(int hotelID){
  	this.hotelID = hotelID;
  }
}

public class Main {
  public static void main(String[] args){
    for(Hotel h:getRandomHotel(50))
  		System.out.print(h.getHotelID()+" ");
  }
  
  public static List<Hotel> getRandomHotel(int count){
    List<Hotel> list = new ArrayList<Hotel>();
  	int n=1000;
    Random rand = new Random();
    boolean[] bool = new boolean[n];
    int randInt = 0;
    for(int i=0;i<count;i++){
      do{
        randInt = rand.nextInt(n);
      }while(bool[randInt]);
      bool[randInt]=true;
      
      list.add(new Hotel(randInt));
    }
    return list;
  }
}