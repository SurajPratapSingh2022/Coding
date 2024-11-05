//2d Array is also consider as Object in Java
public class Main
{
	public static void main(String[] args) {
		byte [][]b=new byte [3][4];
		short s[][]=new short [3][4];
		int i[][]=new int[3][4];
		long l[][]=new long[3][4];
		float f[][]=new float[3][4];
		double d[][]=new double[3][4];
		char c[][]=new char[3][4];
		boolean bo[][]=new boolean[3][4];
		String st[][]=new String[3][4];
		System.out.println(b.getClass());
		System.out.println(s.getClass());
		System.out.println(i.getClass());
		System.out.println(l.getClass());
		System.out.println(f.getClass());
		System.out.println(d.getClass());
		System.out.println(c.getClass());
		System.out.println(bo.getClass());
		System.out.println(st.getClass());
	}
}
