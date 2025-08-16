public class reverse {
    public static void main(String[] args) {
        String str = "tejas";
        System.out.println("Before: "+str);
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println("After (reverse using StringBuffer) : "+sb);
    }
}
