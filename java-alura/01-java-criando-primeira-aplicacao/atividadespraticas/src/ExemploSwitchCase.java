public class ExemploSwitchCase {
    public static void main(String[] args) {
        int dia = 3;
        String nomeDia = switch (dia) {
            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terça";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            case 7 -> "sabádo";
            default -> "Dia inválido!";
        };

        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
