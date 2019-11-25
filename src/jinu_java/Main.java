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

//Annotation

class Matrix {
	
	public Matrix(double[][] mat) {
		this.mat = mat;
		row = mat.length;
		column = mat[0].length;
	}
	
	double[][] mat;
	public int row, column;

	public Matrix add(Matrix b) {
		for (int y = 0; y < mat.length; y++) {
			for (int x = 0; x < mat[y].length; x++) {
				mat[y][x] += b.mat[y][x];
			}
		}
		return this;
	}

	public void matrixPrint() {
		for (int y = 0; y < mat.length; y++) {
			for (int x = 0; x < mat[y].length; x++) {
				System.out.print(this.mat[y][x] + "  ");
			}
			System.out.println("");
		}
	}
}