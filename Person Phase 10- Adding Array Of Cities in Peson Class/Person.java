/**
 * Represents A Person Object with name age and minwage
 * and the cities person lived in
 * @author KVAHABZ1
 *
 */
/**
 * Phase 10 - Added array of cities
 * @author benwiersma
 * CMSC203
 */
public class Person {
	
	private String name;
	private int age;
	private double minWage;
	private String [] citiesLivedIn;
	private int numOfCities;
	private int DEFAULT_SIZE=  5;

	
	/**
	 * no-arg initializes String array
	 */
	public Person()
	{
		name = "noname";
		age = 1;
		minWage = 10.0;
		citiesLivedIn = new String[DEFAULT_SIZE];
	}
	 
	
	public Person(String name)
	{
		this.name = name;
		age = 1;
		minWage = 10.0;
		citiesLivedIn = new String[DEFAULT_SIZE];
	}
 
	
	public Person(String name, int age, double minWage)
	{
		this.name = name;
		this.age = age;
		this.minWage = minWage;
		citiesLivedIn = new String[DEFAULT_SIZE];
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setWage(double minWage)
	{
		this.minWage = minWage;
	}
	public double getWage()
	{
		return minWage;
	}
	
	public int getDefaultSize()
	{
		return DEFAULT_SIZE;
	}
	
	/**
	 * New - returns String array of cities
	 * @return
	 */
	public String[] getcitiesLivedIn()
	{
	 	return citiesLivedIn;   
		/*
		 * Another option would be to return the copy of 
		 * the array to avoid another class to change the 
		 * content of the citiesLivedIn array
		 * 
		 * A.K.A. Deep copy
		 */
	 	
		 /*
		 String [] tempCities = new String[citiesLivedIn.length];   //create a another array that has the same size of the original array
		 for ( int i = 0; i<citiesLivedIn.length; i++ )  //copy the content to this array
			  
		 {
			 tempCities[i] = citiesLivedIn[i];
		 }
		 return 	tempCities;
		 */
	  
	}
	
	/**
	 * Adds city to array, increments counter
	 * @param city
	 */
	public void addCity(String city)
	{
		citiesLivedIn[numOfCities] = city;
		numOfCities++;
	}
	
	
	public void SayName() {
		System.out.println("My name is " + name + " and my age "
							+ "is " + age);
	}
	
	public void HaveBirthday() {
		age++;
	}
	
	public void increaseWage(double perc) {
		minWage = (minWage * perc)/100 + minWage;
	}
	
	
	public String toString()
	{
		return "The person's name is " + 
				name + " and their age is " + age;
	}
	
	/**
	 * Returns String of cities lived in
	 * @return all cities lived in
	 */
	public String citiesLivedIn()
	{
		String temp = "";
		for ( int i=0; i< numOfCities; i++)
			temp +=citiesLivedIn[i] + " ";
		return temp;
	}
}
