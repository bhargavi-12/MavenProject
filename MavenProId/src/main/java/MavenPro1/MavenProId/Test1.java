package MavenPro1.MavenProId;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Test1 {
	@Test
	public void testIn() {
		int n=0;
		int w;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of sweets:");
		n=s.nextInt();
		sweets[] origin=new sweets[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the weight of sweet"+(i+1));
			w=s.nextInt();
			origin[i]=new sweets(w);
		}
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=origin[i].getWeight();
		}
		
		Arrays.sort(arr);
		System.out.println("Sweets in sorted order:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]==origin[j].getWeight()) {
					System.out.println("sweet"+(j=1));
				}
			}
		}
	}

}
