class Example18{
	public static void main(String[]args){
	int amount=150;
	int note=10;
	int student=0;

	while (note <= amount) {
    System.out.println(note);
    amount = amount - note;
    note = note + 10;
    student++;

	}
      
  }
  
}
