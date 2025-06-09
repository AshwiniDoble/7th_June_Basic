public class DemoStringBuffer {
     public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("navin");

        System.out.println(sb.capacity());
        System.out.println(sb.length()); // length of string
        
        sb.append(" reddy"); // add /concat the string which we add
        sb.deleteCharAt(2); // delete the character at that index number
        sb.setLength(30); // we can set the lenght of the string
        System.out.println(sb);

    }
}
