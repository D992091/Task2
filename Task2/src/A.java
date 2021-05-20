import java.awt.*;

public class A {
	private int[] arr;
	private int[] arr1;
	private boolean minMaxNear = false;
	private String message = "";
	A(int... args) {
		arr = new int[args.length];
		for(int i=0; i<args.length;i++){
			arr[i] = args[i];
		}
	
	}
	
	public String toString() {
		
		if(minMaxNear){
			message = "Максимальный и минимальный элемент расположены рядом";
		} else {
			if (arr1 != null) {
				message = "";
				for (int i = 0; i < arr1.length; i++) {
					message += Integer.toString(arr1[i]);
					message += " ";
				}
			} else {
				message = "";
				for (int i = 0; i < arr.length; i++) {
					message += Integer.toString(arr[i]);
					message += " ";
				}
			}
		}
		
		return message;
	}
	
	public void sortArr(){
		arr1 = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			arr1[i] = arr[i];
		}
		int max = arr1[0];
		int min = arr1[0];
		int indexMax = 0;
		int indexMin = 0;
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]>max){
				max = arr1[i];
				indexMax = i;
			}
			if(arr1[i]<min){
				min = arr1[i];
				indexMin = i;
			}
		}
		
		if(Math.abs(indexMax - indexMin) != 1){
			int diff = max - min;
			if (indexMax > indexMin){
				for(int i=indexMin+1; i<indexMax-1;i++){
					arr1[i] = diff;
				}
				
			} else {
				for(int i=indexMax+1; i<indexMin-1;i++){
					arr1[i] = diff;
				}
			}
			
		} else {
			minMaxNear = true;
		}
	}
	
	public String printFirstArr(){
		message = "";
		for (int i = 0; i < arr.length; i++) {
			message += Integer.toString(arr[i]);
			message += " ";
		}
		return message;
	}
}
