/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7_3;

/**
 *
 * @author A455LF-WIN10
 */
public class Commission extends Hourly{
	private double totalSales;
	private double commissionRate;
	
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commisionRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = commisionRate;
	}
	
	public void addSales(double totalSales){
		this.totalSales = totalSales;
	}
	
	public double pay(){
		double payment = super.pay() + totalSales*(1.0+commissionRate);
		
		totalSales = 0;
		
		return payment;
	}
	
	public String toString()
	{
		String result = super.toString();
		
		result += "\nTotal Sales: " + totalSales;
		
		return result;
	}
}
