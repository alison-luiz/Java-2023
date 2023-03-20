import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        double x = 10.15687;
        String nome = "Alison";

        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);

        System.out.printf("Resultado:" + " %.2f%n", x);
        System.out.printf("Nome:" + " %s%n", nome);

    }
}