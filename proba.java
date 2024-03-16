public class proba {
    public static void main(String[] args) {
        
int num = 255;
String nu="FF";
Integer num2 = Integer.parseInt(nu, 16);
System.out.println(num2);

String hex = Integer.toHexString(num);
System.out.println(hex.toUpperCase());

String cadea = Double.toString(num);
System.out.println(cadea);
    }
}
