package Day2_120521;

public class Forloop_with_Array {

    public static void main(String[] args) {

        //iterate through all boroughs defined by dynamic array using for loop
        String[] boroughs = new String[6];
        boroughs[0] = "Brookyln";
        boroughs[1] = "Queens";
        boroughs[2] = "Manhatten";
        boroughs[3] = "Bronx";
        boroughs[4] = "Staten";
        boroughs[5] = "LI";


        for (int i = 0; i < boroughs.length; i++) {
            //Printstatement
            System.out.println("My current borough is " + boroughs[i]);
        }//end of for loop


    }//end of main
}//end of java class






