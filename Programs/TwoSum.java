import java.util.*;
public class TwoSum{
	public static void main(String args[]){
	int nums[]={6,3,4}; //Declaring an array beforehand
	int target=9;
	int i,j;
	for(i=0;i<nums.length;i++){
		for(j=i+1;j<nums.length;j++){
			if(nums[i]+nums[j]==target){
				System.out.println("["+nums[i]+","+nums[j]+"]");
				return;
			}
		}
	}
	System.out.println("No solution is there");
				return; //Exit 
}
}


