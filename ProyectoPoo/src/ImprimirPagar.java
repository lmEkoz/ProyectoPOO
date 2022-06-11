import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class ImprimirPagar extends Main{
    static class Boleto {

        public static double RandomMinuto(int minuto){
            return Math.random() * (59 - minuto + 1) + minuto;
        }
        int tarjeton;
        String placa;
        int numeroEstacionamiento;
        int anio, mes, dia, hora, minuto;

        public int getAnio() {
            return anio;
        }

        public int getMes() {
            return mes;
        }

        public int getDia() {
            return dia;
        }

        public int getHora() {
            return hora;
        }

        public int getMinuto() {
            return minuto;
        }

        public String getPlaca() {
            return placa;
        }

        public int getTarjeton() {
            return tarjeton;
        }

        public int getNumeroEstacionamiento() {
            return numeroEstacionamiento;
        }

        boolean setAnio(int anio) {
            if (anio >= 2022 && anio <= 2023) {
                this.anio = anio;
                return true;
            } else {
                return false;
            }
        }

        boolean setMes(int mes) {
            if (mes >= 1 && mes <= 12) {
                this.mes = mes;
                return true;
            } else {
                return false;
            }
        }

        boolean setDia(int dia) {
            if (dia >= 1 && dia <= 31) {
                this.dia = dia;
                return true;
            } else {
                return false;
            }
        }

        boolean setHora(int hora) {
            if (hora >= 0 && hora <= 23) {
                if (hora >= 1 && hora <= 23) {
                    this.hora = hora - 1;
                    return true;
                }
                this.hora = hora;
                return true;
            } else {
                return false;
            }
        }

        boolean setMinuto(int minuto) {
            if (minuto >= 0 && minuto <= 59) {
                this.minuto = (int)RandomMinuto(minuto);
                return true;
            } else {
                return false;
            }
        }

        boolean setPlaca(String placa) {
            if (placa.length() == 6) {
                this.placa = placa;
                return true;
            } else {
                return false;
            }
        }

        boolean setTarjeton(int tarjeton) {
            if (tarjeton >= 1 && tarjeton <= 99999) {
                this.tarjeton = tarjeton;
                return true;
            } else {
                return false;
            }
        }

        boolean setNumeroEstacionamiento(int numeroEstacionamiento) {
            if (numeroEstacionamiento >= 1 && numeroEstacionamiento <= 99999) {
                this.numeroEstacionamiento = numeroEstacionamiento;
                return true;
            } else {
                return false;
            }
        }

        public Boleto(LocalDateTime now, String placa, int tarjeton, int numeroEstacionamiento) {
            setAnio(now.getYear());
            setMes(now.getMonthValue());
            setDia(now.getDayOfMonth());
            setHora(now.getHour());
            setMinuto(now.getMinute());
            setPlaca(placa);
            setTarjeton(tarjeton);
            setNumeroEstacionamiento(numeroEstacionamiento);
        }
    }

    static class BoletoSalida {
        public static double RandomMinuto(int minuto){
            return Math.random() * (59 - minuto + 1) + minuto;
        }
        int anioSalida, mesSalida, diaSalida,horaSalida, minutoSalida;
        String placa;
        int tarjeton, numeroEstacionamiento;
        boolean pagado;

        public BoletoSalida(LocalDateTime now, String placa, int tarjeton, int numeroEstacionamiento, boolean pago) {
            setAnioSalida(now.getYear());
            setMesSalida(now.getMonthValue());
            setDiaSalida(now.getDayOfMonth());
            setHoraSalida(now.getHour());
            setMinutoSalida(now.getMinute());
            setPlaca(placa);
            setTarjeton(tarjeton);
            setNumeroEstacionamiento(numeroEstacionamiento);
            setPago(pago);
        }

        public int getAnioSalida() {
            return anioSalida;
        }

        public int getMesSalida() {
            return mesSalida;
        }

        public int getDiaSalida() {
            return diaSalida;
        }

        public int getHoraSalida() {
            return horaSalida;
        }

        public int getMinutoSalida() {
            return minutoSalida;
        }

        public String getPago(boolean pagado){
            if(pagado){
              return "Pagado";
            }else{
                return "No pagado";
            }
        }

        boolean setAnioSalida(int anioSalida) {
            if (anioSalida >= 2022 && anioSalida <= 2023) {
                this.anioSalida = anioSalida;
                return true;
            } else {
                return false;
            }
        }

        boolean setMesSalida(int mesSalida) {
            if (mesSalida >= 1 && mesSalida <= 12) {
                this.mesSalida = mesSalida;
                return true;
            } else {
                return false;
            }
        }

        boolean setDiaSalida(int diaSalida) {
            if (diaSalida >= 1 && diaSalida <= 31) {
                this.diaSalida = diaSalida;
                return true;
            } else {
                return false;
            }
        }

        boolean setHoraSalida(int horaSalida) {
            if (horaSalida >= 0 && horaSalida <= 23) {
                this.horaSalida = horaSalida;
                if (this.horaSalida > 23)
                    this.horaSalida -= 24;
                return true;
            } else {
                return false;
            }
        }

        boolean setMinutoSalida(int minutoSalida) {
            if (minutoSalida >= 0 && minutoSalida <= 59) {
                this.minutoSalida = minutoSalida;
                return true;
            } else {
                return false;
            }
        }

        boolean setPlaca(String placa) {
            if (placa.length() == 6) {
                this.placa = placa;
                return true;
            } else {
                return false;
            }
        }

        boolean setTarjeton(int tarjeton) {
            if (tarjeton >= 1 && tarjeton <= 99999) {
                this.tarjeton = tarjeton;
                return true;
            } else {
                return false;
            }
        }

        boolean setNumeroEstacionamiento(int numeroEstacionamiento) {
            if (numeroEstacionamiento >= 1 && numeroEstacionamiento <= 99999) {
                this.numeroEstacionamiento = numeroEstacionamiento;
                return true;
            } else {
                return false;
            }
        }

        boolean setPago(boolean pago){
            pagado = pago;
            return pago;
        }
    }
}
