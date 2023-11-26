import java.io.IOException;

public class TestThrows{
	static void func1() throws IOException{
		throw new IOException("Error 1");
	}
	
	static void func2() throws Exception{
		try{
			func1();
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception");
		}
		catch(IOException e){
			System.out.println("IO exception");
			throw new ArithmeticException("Error 2");
		}
		
	}
	
	static void func3() throws Exception{
		try{
			func2();
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic");
		}
		finally{
			System.out.println("Finally block executed");
		}
	}
	
	public static void main(String args[]) throws Exception{
		func3();
	}
}
