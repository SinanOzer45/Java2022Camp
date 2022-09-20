public class Main {

    public static void main(String[] args) {
	    int number = -2;
	    int remainder = number % 2;
	    System.out.println(remainder);
	    boolean isprime = true;

		if (number==1){
			System.out.println("Sayı asal değildir");
			return;
		}

	    if (number<1){
	    	System.out.println("Geçersiz sayı");
		}

	    for(int i=2; i<number;i++){
	    	if(number % i == 0){
	    		isprime = false;
			}
		}
	    if(isprime){
	    	System.out.println("Sayı Asaldır.");
		}else{
	    	System.out.println("Sayı Asal Değildir.");
		}
    }

}
