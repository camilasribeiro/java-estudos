public class ConversaoDolarReal {
    public static void main(String[] args) {
        double valorEmDolar = 999;
        double taxaConversao = 4.94;

        double valorEmReais = taxaConversao * valorEmDolar;

        System.out.printf("O valor de $%.2f convertido para real é R$%.2f.", valorEmDolar, valorEmReais);
    }
}
