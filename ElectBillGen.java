class ElectBillGen
{
	public static void main (String[] args)
	{
		//declaring 'b' as a variable here
		ElectBill b=new ElectBill();
		//next we have to give the input by calling inputdata from another class
		b.inputdata();
		/*based on their connections,we should calculate the units from the 
		  calculate bill method */
		b.calculatebill();
		//finally, we should give the bill calling the display method
		b.display();
	}
}

	
