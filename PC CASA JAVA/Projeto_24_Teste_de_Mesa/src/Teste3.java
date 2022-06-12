public class Teste3 {
    public static void main(String[] args) {
        int controle = 1;
        long acumulador = 100;
        boolean condicao;
        System.out.println("Numero da iteracao\tCondição\tControle\tAcumulador");
        do{
            acumulador -= controle;
            condicao = controle <=10;
            System.out.println("Iteracao "+ controle+ "\t\t\t"+ condicao + "\t\t\t" + controle + "\t\t\t" + acumulador);
            controle++;
        } while(controle <=10);
    }
}
