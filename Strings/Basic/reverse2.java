package Strings.Basic;

public class reverse2 {
    public static void main(String args[]){
        String str = "tejas";
        System.out.println("Original String : "+str);
        int right = str.length()-1;
        char []strArray = str.toCharArray();
        char temp;
        
        for (int i = 0; i < str.length()/2; i++) {
            temp = strArray[i];
            strArray[i] = strArray[right];
            strArray[right] = temp;
            right--;
        }

        String revString = new String(strArray);
        System.out.println("Reversed String : "+revString);
    }
}
