package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program Kalkulator
 * */
public class Main {

    public static void main(String[] args) {
	    Kalkulator calc = new Kalkulator();

	    calc.setValue1(7);
	    calc.setValue2(5);

	    double value1 = calc.getValue1();
        double value2 = calc.getValue2();

        System.out.println("VALUE 1 = "+value1);
        System.out.println("VALUE 2 = "+value2);

        calc.setNameProject();
        calc.setNoteProject("This project shown you how to manage method in java");

        System.out.println("Result Add is = "+calc.add(value1,value2));
        System.out.println("Result Minus is = "+calc.minus(value1,value2));
        System.out.println("Result Multiplication is = "+calc.multiplication(value1,value2));
        System.out.println("Result Division is = "+calc.division(value1,value2));
    }
}
