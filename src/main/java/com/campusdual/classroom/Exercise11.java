package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {


        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");

        //Encender la TV
        redRemote.turnOn();
        blackRemote.turnOn();

        //Subir un canal
        redRemote.channelUp();
        blackRemote.channelUp();

        //Bajar un canal
        redRemote.channelDown();
        blackRemote.channelDown();

        //Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
        redRemote.channel = 0; //establecer el canal a 0
        redRemote.channelDown(); //intentar bajar un canal en 0
        System.out.println("Canal después de intentar bajar: " + redRemote.channel); //deberia seguir en 0

        //Subir el volumen
        redRemote.volumeUp();
        blackRemote.volumeUp();

        //Bajar el volume
        redRemote.volumeDown();
        blackRemote.volumeDown();

        //Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
        redRemote.volume = 0;
        redRemote.volumeDown();
        System.out.println("Volumen después de intentar bajar: " + redRemote.volume);

        //Obtener el color del mando a distancia y mostrarlo por pantalla
        System.out.println("Color del control remoto rojo: " + redRemote.getColor());
        System.out.println("Color del control remoto negro: " + blackRemote.getColor());

        //Apagar la TV
        redRemote.turnOff();
        blackRemote.turnOff();

    }


}