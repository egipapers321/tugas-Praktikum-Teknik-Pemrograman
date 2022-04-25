package Praktikum7_3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author A455LF-WIN10
 */
//************************************************************
//Staff.java      Author: Lewis/Loftus
//
//Represents the personel staff of a particular business.
//************************************************************

public class Staff 
{
	StaffMember[] staffList;

	//--------------------------------------------------------
	//  Sets up the list of staff members.
	//--------------------------------------------------------
	public Staff()
	{
		staffList = new StaffMember[8];
	
		staffList[0] = new Executive ("Sam", "123 Main Line",
			"555-0456", "123-45-6789", 2423.07);
	
		staffList[1] = new Employee ("Carla", "467 Off Line",
			"555-0101", "987-65-4321", 1246.15);
		staffList[2] = new Employee ("Woody", "789 Off Rocker",
			"555-0000", "010-20-3040", 1169.23);
	
		staffList[3] = new Hourly ("Diane", "678 Fifth Ave.",
			"555-0690", "958-47-3625", 10.05);
	
		staffList[4] = new Volunteer ("Egi", "987 Cimahi",
			"555-8374");
		staffList[5] = new Volunteer ("Cliff", "321 Duds Lane",
			"555-7282");
	
		staffList[6] = new Commission ("faul", "123 Bandung",
			"555-1234", "111-22-3333", 6.25, .2);
		staffList[7] = new Commission ("Ferdy", "456 Garut",
			"555-4321", "444-55-6666", 9.75, .15);
	
		((Executive)staffList[0]).awardBonus (500.00);
	
		((Hourly)staffList[3]).addHours (40);
	
		((Commission)staffList[6]).addHours (45); 
		((Commission)staffList[6]).addSales (400);
	
		((Commission)staffList[7]).addHours (40); 
		((Commission)staffList[7]).addSales (950);
	
	}

	//--------------------------------------------------------
	//  Pays all staff members.
	//--------------------------------------------------------
	public void payday()
	{
		double amount;
	
		for (int count=0; count < staffList.length; count++)
		{
			System.out.println(staffList[count]);
		
			amount = staffList[count].pay();  // polymorphic
		
			if (amount == 0.0)
				System.out.println("Thanks!");
			else
				System.out.println("Paid: " + amount);
		
			System.out.println("--------------------------------------");
		}
	}
}