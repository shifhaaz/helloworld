package ch6;

public class MethodDemo3 {

	public static void main(String[] args) {
		Hall hall = new Hall();
		MarriageHall mh=new MarriageHall();
		hall.feast();
		mh.feast();
	}
}
	class Hall {
		public void feast()
		{
			System.out.println("Royal Feast.......");
		}
	}
	class MarriageHall extends Hall{
		public void feast()
		{
			System.out.println("Bengal Feast.....");
			super.feast();
		}
	}
	class BirthdayHall{
		
	}


