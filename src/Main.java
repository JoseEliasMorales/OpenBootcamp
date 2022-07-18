public class Main {
    public static void main(String[] args) {
        var numeroIf = -9;
        var numeroWhile = 0;
        var numeroFor = 0;
        var estacion= "Verano";

        if (numeroIf > 0){
            System.out.println("El numero es positivo");
        }
        else if (numeroIf<0){
            System.out.println("El numero es negativo");
        }      
        else{
            System.out.println("El numero es 0");
        }

        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile= numeroWhile + 1;
        }

        do{
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile +1;
        } while (numeroWhile<3);

        for(;numeroFor <=3;numeroFor = numeroFor+1){
            System.out.println(numeroFor);
        }

        switch(estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es una estacion");
                break;
        }
    }
}