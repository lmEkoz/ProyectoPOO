import java.time.LocalDateTime;

public class Main {
    public static double RandomNumber() {
        return Math.random() * 99999;
    }
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int noBoleto = (int) RandomNumber();

        ImprimirPagar.Boleto boleto = new ImprimirPagar.Boleto(now, "3904B4", noBoleto, 4);
        System.out.println("Boleto creado\n");
        System.out.println( "Boleto #" + boleto.tarjeton + "\t" +
                            "Estacionamiento #" + boleto.numeroEstacionamiento + "\n" +
                            "Placas: " + boleto.placa + "\n" +
                            "Entrada: " +   boleto.anio + "/" +
                                            boleto.mes + "/" +
                                            boleto.dia + "\t" +
                                            boleto.hora + ":" +
                                            boleto.minuto + "\n");

        ImprimirPagar.BoletoSalida boletoSalida = new ImprimirPagar.BoletoSalida(now, "3904B4", noBoleto, 4, true);
        System.out.println( "Boleto #" + boletoSalida.tarjeton + "\t" +
                            "Estacionamiento #" + boletoSalida.numeroEstacionamiento + "\t" +
                            boletoSalida.getPago(boletoSalida.setPago(boletoSalida.pagado))+ "\n" +
                            "Placas: " + boleto.placa + "\n" +
                            "Salida: " +    boletoSalida.anioSalida + "/" +
                                            boletoSalida.mesSalida + "/" +
                                            boletoSalida.diaSalida + "\t" +
                                            boletoSalida.horaSalida + ":" +
                                            boletoSalida.minutoSalida);
    }
}
