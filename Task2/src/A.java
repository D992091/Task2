import java.awt.*;

public class A {
	private int[] arr;
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
			message = "";
			for (int i = 0; i < arr.length; i++) {
				message += Integer.toString(arr[i]);
				message += " ";
			}
		}
		
		return message;
	}
	
	public void sortArr(){
		int max = arr[0];
		int min = arr[0];
		int indexMax = 0;
		int indexMin = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
				indexMax = i;
			}
			if(arr[i]<min){
				min = arr[i];
				indexMin = i;
			}
		}
		
		if(Math.abs(indexMax - indexMin) != 1){
			int diff = max - min;
			if (indexMax > indexMin){
				for(int i=indexMin+1; i<indexMax-1;i++){
					arr[i] = diff;
				}
				
			} else {
				for(int i=indexMax+1; i<indexMin-1;i++){
					arr[i] = diff;
				}
			}
			
		} else {
			minMaxNear = true;
		}
	}
}
