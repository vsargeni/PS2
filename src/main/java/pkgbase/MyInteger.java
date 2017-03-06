package pkgbase;

public class MyInteger {
	
	
	private int iValue; //create iValue
	
	public MyInteger(int iValue){ //set ivalue
		this.iValue= iValue;
	}

	public int getiValue() { //getter
		return iValue;
	}
	
	public boolean isEven(){ // is it even?
		boolean bool = false;
		if ((this.iValue % 2)==0){ // if it divides evenly by 2, yes
			bool= true;
		}
		return bool;
	}
	
	public boolean isOdd(){ // is it odd?
		boolean bool = false;
		if ((this.iValue % 2)!=0){ // if it doesn't divide evenly by 2 then yes
			bool= true;
		}
		return bool;
		
	}
	
	public boolean isPrime(){ // is it prime?
		int x = 2;
		boolean bool=false;
		while (x<=(this.iValue/2)){ //divdes by numbers, prime numbers can only be diveded by one
			if ((this.iValue % x)!=0){
				bool=true;			
			}
			x++;
		}
		return bool;
	}
	
	public static boolean isEven(MyInteger ME){ //checks if parameter is even
		boolean bool = false;
		if ((ME.getiValue() % 2)==0){
			bool= true;
		}
		return bool;
	}

	public static boolean isOdd(MyInteger ME){ // checks if parameter is odd
		boolean bool = false;
		if ((ME.getiValue() % 2)!=0){
			bool= true;
		}
		return bool;
	}
	
	public static boolean isPrime(MyInteger ME){ // checks if parameter is prime
		int x = 2;
		boolean bool=false;
		while (x<=(ME.getiValue()/2)){
			if ((ME.getiValue() % x)!=0){
				bool=true;			
			}
			x++;
		}
		return bool;
	}
	
	public static boolean isEven(int val){ //checks if parameter is even
		boolean bool = false;
		if ((val % 2)==0){
			bool= true;
		}
		return bool;
	}

	public static boolean isOdd(int val){ // checks if parameter is odd
		boolean bool = false;
		if ((val % 2)!=0){
			bool= true;
		}
		return bool;
	}
	
	public static boolean isPrime(int val){ // checks if parameter is prime
		int x = 2;
		boolean bool=false;
		while (x<=(val/2)){
			if ((val % x)!=0){
				bool=true;			
			}
			x++;
		}
		return bool;
	}
	
	public boolean equals(int eq){ // checks if parameter = iValue
		boolean bool =false;
		if (eq==this.iValue){
			bool=true;
		}
		return bool;
	}
	
	public boolean equals (MyInteger MI){ // checks the ivalue of 2 MyInteger Objs
		boolean bool = false;
		if (MI.getiValue()== this.iValue){
			bool = true;
		}
		return bool;
	}
	
	
	
	
}
