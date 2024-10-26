class RaizNegativaException extends Exception{
    public RaizNegativaException(String mensaje){
        super(mensaje);
    }
}

class OperacionMatematica{
    public double raizCuadrada(double numero) throws RaizNegativaException{
        if (numero<0){
            throw new RaizNegativaException("No se puede calcular una raiz menor a 0");
        }
        return Math.sqrt(numero);
    }
}


public class Ejercicio1{
    public static void main(String[] args){
        OperacionMatematica operacion = new OperacionMatematica();

        try{
            double resultado = operacion.raizCuadrada(-9);
            System.out.println("Resultado = " + resultado);
        }catch (RaizNegativaException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}