public class palindrom {
    public boolean isPalindrome(String s) {
        String converted = s.toLowerCase().replaceAll("[ \\t,--\\`./@\\[#\\]$%^&{_}*;:!?'\\\\\"\\\"]","");
        StringBuffer sb = new StringBuffer(converted);
        sb.reverse();
        System.out.println(converted);
        System.out.println(sb);
        if(sb.toString().equals(converted.toString())) 
            return true;
        return false;
    }

    public static void main(String[] args) {
        palindrom p = new palindrom();
        System.out.println(p.isPalindrome("\"Marge, let's \\\"[went].\\\" I await {news} telegram.\""));
    }
}
