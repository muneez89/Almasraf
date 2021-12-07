package org.company;

public class CompanyInfo {

	
	private void companyName(int id) {
	System.out.println("Company Id:" +id);

	}
	private void sysout() {
		// TODO Auto-generated method stub
		System.out.println("Mani edit");
	}
	private void companyName(String name,String location,int strength) {
		
		System.out.println("Company Name" +name);
		System.out.println("Company location" +location);
		System.out.println("Company Strength" +strength);

	}
	
	private void companyName(long comCode,int branches) {
		System.out.println("Company code" +comCode);
		System.out.println("Company code" +branches);
	

	}
	
	public static void main(String[] args) {
		
		CompanyInfo c = new CompanyInfo();
		c.companyName(45685);
		c.companyName("HCL","Chennai",1500);
		c.companyName(982411111412252l,12);
	}
}
