package AssignmentQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraySplit {
    public static Integer sum(List<Integer> list) {
        int s=0;
        for(int i=0;i<list.size();i++) {
            s+=list.get(i);
        }
        return s;
    }
    public static void sortMyArray(Integer[] input) {
        List<Integer> list=Arrays.asList(input);
        List<Integer> selectedlist1=new ArrayList<>();
        List<Integer> selectedlist2=new ArrayList<>();
        for(Integer i:list) {
            if(sum(selectedlist1)<sum(selectedlist2) && selectedlist1.size()<=list.size()/2) {
                selectedlist1.add(i);
            }else {
                selectedlist2.add(i);
            }
        }
        List<Integer> list1=new ArrayList<>();
        list1.addAll(selectedlist1);
        list1.addAll(selectedlist2);
        System.out.println(list1);

        System.out.println("difference between to half lists is: "+Math.abs(sum(selectedlist1)-sum(selectedlist2)));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the list");
        int n=sc.nextInt();
        Integer[] arr=new Integer[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr,Collections.reverseOrder());
        sortMyArray(arr);
    }
}
