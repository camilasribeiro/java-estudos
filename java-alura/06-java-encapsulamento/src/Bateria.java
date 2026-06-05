public class Bateria {
    private int nivelBateria;

    public void setNivel(int nivelBateria) {
        if (nivelBateria >= 0 && nivelBateria <= 100) {
            this.nivelBateria = nivelBateria;
        }
    }

    public String exibirStatus() {
        if (nivelBateria <= 20) {
            return "Bateria fraca.";
        } else if (nivelBateria > 20 && nivelBateria < 80) {
            return "Bateria ok.";
        } else {
            return "Bateria cheia.";
        }
    }
}
