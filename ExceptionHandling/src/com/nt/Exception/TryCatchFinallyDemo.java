package com.nt.Exception;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		
		//Case:1
		try {}
		catch(Exception e) {}
		finally {}
		
		//Case:2
		try {}
		finally {}
		
		//Case:3
		try {}
		finally {}
		//catch(Exception ee) {} //We can not write catch after finally
		
		//Case:4
		try {} //try without catch Exception
		
		//case:5
		catch(Exception e) {}  // catch without try Exception
		
		//Case:6
		finally {} // finally without try Exception
		
		//Case:7
		try {}
		//int a = 10;
		catch(Exception e) {}  //we can not please statement in b/w try, catch, finally
		//int b = 20;
		finally {};
	}
}
