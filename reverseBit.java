/*
Reverse bits of an 32 bit unsigned integer

Example 1:

x = 0,

          00000000000000000000000000000000  
=>        00000000000000000000000000000000
return 0

Example 2:

x = 3,

          00000000000000000000000000000011 
=>        11000000000000000000000000000000
return 3221225472

Since java does not have unsigned int, use long
*/

public class ReverseBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(8));

	}
	public static long reverse(long A) {
	    
        long rev = 0;
	    
	    for (int i = 0; i < 32; i++) {
	        rev <<= 1;
	        if ((A & (1 << i)) != 0)
	            rev |= 1;
	    }
	    
	    return rev;
	    
	}


}