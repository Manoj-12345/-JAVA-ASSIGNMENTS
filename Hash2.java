package Assignment5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hash2 {
		public static final <T> void swap (T[] a, int i, int j) {
			T t = a[i];
			a[i] = a[j];
			a[j] = t;
			}
			private static void test() {
				Scanner sc = new Scanner(System.in);
				String a[] = {"Hello","Goodbye"};
				swap(a, 0, 1);
				System.out.println("a:"+Arrays.toString(a));
				
			}
			public static void main1(String...args)
			{
			test();
			}

			}

	
