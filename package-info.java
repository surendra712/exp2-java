import java.util.Scanner;
class ElectBill
{
	//declaring the required variables for billing
	int consumerNumber;
	String consumerName;
	int prevReading;
	int currReading;
	int billedUnits;
	int ebConn;
	double bill;
	void inputdata()
	{
		Scanner sc = new Scanner(System.in);
		//1.collecting the consumer number and storing in the 'consumerNumber'
		System.out.println("\n Enter Consumer Number: ");
		consumerNumber = sc.nextInt();
		//2.collecting the consumer name and storing in the 'consumerName'
		System.out.println("\n Enter Consumer Name: ");
		consumerName = sc.next();
		//3.Entering the previous units from data stored from last billing
		System.out.println("\n Enter Previous Units: ");
		prevReading = sc.nextInt();
		//4.Entering the current units from the meter
		System.out.println("Enter Current Units consumed:");
		currReading = sc.nextInt();
		//5.Choosing the type of connection the consumer had and storing it in 'ebconn'
		System.out.println("Enter the types of EB Connection(1.domestic or 2.commercial)");
		ebConn = sc.nextInt();
		//6.For charging the amount , we have to subtract the readings
		billedUnits=currReading-prevReading;
	}
	double calculatebill()
	{
		/*based on the connection provided, the amounts will differ 
		 and the programmed case will come into focus for that connection.*/
		switch(ebConn)
		{
			case 1:
				if(billedUnits>=0 && billedUnits<=100)
					bill=billedUnits*1;
				else if(billedUnits>100 && billedUnits <= 200)
					bill=(100*1)+((billedUnits-100)*2.50);
				else if(billedUnits>200 && billedUnits <= 500)
					bill=(100*1)+(100*2.50)+((billedUnits-200)*4);
				else if(billedUnits>500)
					bill=(100*1)+(100*2.50)+(300*4)+((billedUnits-500)*6);
				break;
			case 2:
				if(billedUnits>=0 && billedUnits<=100)
					bill=billedUnits*2;
				else if(billedUnits>100 && billedUnits <= 200)
					bill=(100*2)+((billedUnits-100)*4.50);
				else if(billedUnits>200 && billedUnits <= 500)
					bill=(100*2)+(100*4.50)+((billedUnits-200)*6);
				else if(billedUnits>500)
					bill=(100*2)+(100*4.50)+(300*6)+((billedUnits-500)*7);
				break;
		}
		//after calculation the result will be passed for finalization
		return bill;
	}
	void display()
		{
			//displaying the details from the information provided and calculated
			System.out.println("----------------------------------");
			System.out.println("       ELCTRICITY BILL");
			System.out.println("----------------------------------");
			System.out.println("Consumer Number: "+consumerNumber);
			System.out.println("Consumer Name: "+consumerName);
			System.out.println("Consumer Previous Units: "+prevReading);
			System.out.println("Consumer Current Units: "+currReading);
			//billedUnits is the amount of units the customer used from the last billing to present date
			System.out.println("Billed units: "+billedUnits);
			System.out.println("Type of EBConnection: "+ebConn);
			System.out.println("----------------------------------");
			System.out.println("Total Amount(Rs.): "+bill);
			System.out.println("Please pay the bill in the time !Thank YOu");
		}
}

		
