package classandobjects;

		public class Accountholderobject {
				public static void main(String[] args) {
	  
					Accountholder tom = new Accountholder();
					Accountholder henry = new Accountholder();
					Accountholder sarah = new Accountholder();
					
					
					
					
					
					tom.firstName = "Tom";
					tom.lastName = "Smith";
					tom.age = 21;
					tom.accountbalance = 10000;
					tom.testEligiblityForCreditCard();
					System.out.println("is tom is eligible for CC = "+tom.eligibleForCreditCard);
						
						
						
						
						
}
}
