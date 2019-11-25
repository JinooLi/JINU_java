package jinu_java;

public class Main {
	public static void main(String[] args) {
		double[][] m1={{3,2,3,2},{1,2,4,5},{7,1,6,4},{2,3,4,5}},m2= {{2,3,4,5},{4,3,5,4},{2,5,3,1},{2,6,4,7}};
		Matrix a = new Matrix(m1);
		Matrix b = new Matrix(m2);
		a.add(b);
		a.matrixPrint();
	}
	
}
