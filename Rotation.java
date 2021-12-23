package monkrotation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Rotation {
	public static void main(String args[]) throws Exception {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter line");
        int firstLine = Integer.parseInt(scan.nextLine());
        for (int i=0; i < firstLine; i++) {
        	System.out.println("Next line");
            String[] secondLine = scan.nextLine().split(" ");
            int numElementsN = Integer.parseInt(secondLine[0]);
            int numRotationsK = Integer.parseInt(secondLine[1]);
            int[] arrayA = new int[numElementsN];
            System.out.println("Next line");
            String[] givenArray = scan.nextLine().split(" ");
            for (int j=0; j < numElementsN; j++) {
                arrayA[j] = Integer.parseInt(givenArray[j]);
            }

            int[] finalArray = arrayA.clone();
            for (int k=0; k < numRotationsK; k++) {
                int lastElement = finalArray[finalArray.length-1];
                int[] newArray = new int[numElementsN];
                newArray[0] = lastElement;
                for (int n = 1; n < newArray.length; n++) {
                    newArray[n] = finalArray[n-1];
                }
                finalArray = newArray.clone();
            }
        
            
            String result = Arrays.stream(finalArray)
                                .mapToObj(x -> String.valueOf(x))
                                .collect(Collectors.joining(" "));

            System.out.println(result);

        }

    }
}
