package taller_OCP.ejercicio3;

public class MainMensajero {
    public static void main(String[] args) {
        Mensajero mensajeroEmail = new MensajeroEmail();
        mensajeroEmail.enviar("Hola, este es un mensaje por email.");

        Mensajero mensajeroSMS = new MensajeroSMS();
        mensajeroSMS.enviar("Hola, este es un mensaje por SMS.");
    }
}