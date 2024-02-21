package assignment1;

public class TypeConverstion {
	public static void main(String[] args) {
        
        float a= 10.5f;
        double b = 20.75;
        int c = 100;
        
        int intNum = (int) a;  
        float floatNumber= (float) b;
        short shortNum = (short) c;

        // Print the converted values
        System.out.println("Float to Int: " + intNum);
        System.out.println("Double to Float: " + floatNumber);
        System.out.println("Int to short: " + shortNum);

}}
