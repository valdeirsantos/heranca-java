package control;

import model.CarroVoador;
import model.Moto;

public class Programa {

    public static void main(String[] args) {
        //Carro carro = new Carro(); classe abstrata
       CarroVoador carroVoador = new CarroVoador(); 
        Moto moto = new Moto();
        //Veiculo veiculo = new Veiculo(); classe abstrata
         
        System.out.println(carroVoador.acelerar());
        System.out.println(moto.acelerar());
        //System.out.println(veiculo.acelerar());
             
    }

}
