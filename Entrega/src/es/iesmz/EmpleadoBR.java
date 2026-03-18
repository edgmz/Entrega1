package es.iesmz;

public class EmpleadoBR {
    public enum Tipoempleado {
        veneder, encarregat;
    }

    public float calculaSalarioBruto(Tipoempleado tipus, float ventaMes, float horasExtra) {
        if (tipus == null || ventaMes < 0 || horasExtra < 0) {
            return -1;
        }

        float salarioBruto = switch (tipus) {
            case veneder -> 1000;
            case encarregat -> 1500;
        };

        if (ventaMes >= 1500) {
            salarioBruto += 200;
        } else if (ventaMes >= 1000) {
            salarioBruto += 100;
        }

        salarioBruto += horasExtra * 20;

        return salarioBruto;
    }

    public float calculaSalarioNeto(double salarioBruto) {
        if (salarioBruto < 0) return -1;

        double retencio = 0;
        if (salarioBruto >= 1000 && salarioBruto < 1500) retencio = 16;
        else if (salarioBruto >= 1500) retencio = 18;

        return (float)(salarioBruto * (1-(retencio/100)));
    }
}
