import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        System.out.println("Informe o tipo de combustível abastecido:");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Fim");
        
        int codigo = teclado.nextInt();
        
        while (codigo != 4) {
            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    System.out.println("Código inválido. Por favor, informe um código válido (1 a 4).");
                    break;
            }
            
            System.out.println("Informe o próximo tipo de combustível abastecido:");
            System.out.println("1. Álcool");
            System.out.println("2. Gasolina");
            System.out.println("3. Diesel");
            System.out.println("4. Fim");
            
            codigo = teclado.nextInt();
        }
        
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        teclado.close();
    }
}