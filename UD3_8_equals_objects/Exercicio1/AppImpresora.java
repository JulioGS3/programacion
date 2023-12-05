package UD3_8_equals_objects.Exercicio1;
public class AppImpresora {
public static void main(String[] args) {

    Impresora impre1 = new Impresora(20, "dos", 20);
    Impresora impre2 = new Impresora(31, "uno", 20);


System.out.println(impre1.equals(impre2));
System.out.println(impre1.equals(impre1));

System.out.println(impre1.hashCode());
    }
}