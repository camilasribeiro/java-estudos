public class BateriaMain {
    public static void main(String[] args) {
        Bateria nivelBateria = new Bateria();
        nivelBateria.setNivel(85);

        System.out.println("Status: " + nivelBateria.exibirStatus());
    }
}
