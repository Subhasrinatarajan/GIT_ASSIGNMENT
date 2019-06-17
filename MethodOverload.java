class MethodOverload
{
	void Ticket_Booking(String Booking_type,String name,int age,String Ending_point,String Starting_point,int Ticket_amount)
	{
		System.out.println("Booking_Type"+Booking_Type);
		System.out.println("Name"+name);
		System.out,println("Age"+age);
		System.out.println("Ending_point"+Ending_point);
		System.out.println("Strating_point"+Strating_point);
		if(age<60)
		{
			System.out.println("Ticket_amount"+Ticket_amount);
		}else	
		{
			Ticket_amount=Ticket_amount/2;
			System.otu.println("Ticket_amount"+Ticket_amount):
		}
        }
	void Ticket_Booking(String Booking_Type,String name,int age,String Movie_name,int Ticket_amount)
	{
		
		System.out.println("Boking_type"+Bookking_Type);
                System.out.println("Name"+name);
		System.out.println("Age"+age);
		System.out.println("Movie_name"+Movie_name);

		if(age<4)
		{
			System.out.println("Ticket free");
		}
		if(age<12)
		{
			Ticket_amount=Ticket_amount/2;
			System.out.println("Ticket_amount"+Ticket_amount);
		}else	
                  {
			  System.out.println("Ticket_amount"+Ticket_amount):
		   }		  
         }
	
	public static void main(String []args)
	{
		MethodOverload ref=new MethodOverload();
		ref.Ticket_Booking("Train_Booking","subha","22","Chennai","Hyderabad",2000);
		ref.Ticket_Booking("Movie_Booking","subha","22","Avenger endgame",500);
	}	 


