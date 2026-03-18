package es.iesmz;

public class EmpleadoBR {
    public enum Tipoempleado {
        veneder, encarregat;
    }

    public float calculaSalarioBruto(Tipoempleado tipus, float ventaMes, float horasExtra) {
        // Si tipus és null, o ventasMes o horasExtra prenen valors negatius el mètode retorna -1
        if (tipus == null || ventaMes < 0 || horasExtra < 0) {
            return -1;
        }

        // El salari base serà 1000 euros si l'empleat és de tipus TipoEmpleado.venedor,
        // i de 1500 euros si és de tipus TipoVendedor.encarregat.
        int salarioBruto = (
                switch (tipus) {
                    case Tipoempleado.veneder -> 1000;
                    case Tipoempleado.encarregat -> 1500;
                }
        );

        // A aquesta quantitat se li
        // una prima de 100 euros si ventasMes és major o igual que 1000 euros, i de
        // 200 euros si fora almenys de 1500 euros
        if (ventaMes >= 1000) {
            salarioBruto+=100;
        } else if (ventaMes >= 1500) {
            salarioBruto+=200;
        }

        // Finalment, cada hora extra es pagarà a 20 euros
        salarioBruto+=(horasExtra*20);

        return salarioBruto;
    }

    public float calculaSalarioNeto(float salarioBruto) {
        int retencio = 0;

        if (salarioBruto >= 1000 && salarioBruto < 1500) {
            retencio = 16;
        }

        if (salarioBruto > 1500) {
            retencio = 18;
        }

        return retencio == 0 ? salarioBruto * (1-(retencio/100)) : -1;
    }
}
