package org.git;

public class JavaGit2025 {
	
	
	public static String name = "Anu";
	
	private void method1() {
	System.out.println("Name");

	}
	private void method2() {
	System.out.println("Curran");

	}
	
	private void method3() {
	System.out.println("Sam curran");
	}
	
	public static void main(String[] args) {
		
		JavaGit2025 j = new JavaGit2025();
		j.method1();
		j.method2();
	
		int a = 10;
		System.out.println(a);
		String S = "Smart Skills";
		System.out.println(S);
		
		String s = "12345";
		String r1 = s.replaceAll("[1-5]", "*");
		System.out.println(r1);
			
		String r2 = s.replace("12345", "abcd");
		System.out.println(r2);
		
		System.out.println(name);
	}
}