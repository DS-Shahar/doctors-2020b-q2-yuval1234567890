class Main {
  public static void main(String[] args) {
    
  }
  public static void doctorRating(Doctor[] doctors) {
		
		double sum = 0;
		double counter = 0;
		
		for(int i = 0; i < doctors.length; i++) {
			double studentRate = r.nextDouble();
			while(studentRate != -1) {
				sum += studentRate;
				counter++;
				studentRate = r.nextDouble();
			}
			doctors[i].setRate(sum/counter);
		}
		
		
	}
}
