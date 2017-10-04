package appkeplerteste;

import javax.swing.JButton;

/**
 * @author klauder
 */
public class Arduino {

    private ControlePorta arduino;

    /**
     * Construtor da classe Arduino
     */
    public Arduino() {
        arduino = new ControlePorta("COM7", 9600);//Windows - porta e taxa de transmissão
        //arduino = new ControlePorta("/dev/ttyUSB0",9600);//Linux - porta e taxa de transmissão
    }

    /**
     * Envia o comando para a porta serial
     *
     * @param comando - Botão que é clicado na interface Java
     */
    public void comunicacaoArduino(String comando) {
        System.out.println(comando);
        switch (comando) {
            case "0":
                System.out.println("porta 0");
                //arduino.enviaDados(0);
                break;
            case "1":
                System.out.println("porta 1");
                //arduino.enviaDados(1);
                break;
            case "2":
                System.out.println("porta 2");
                //arduino.enviaDados(2);
                break;
            case "3":
                System.out.println("porta 3");
                //arduino.enviaDados(3);
                break;
            case "4":
                System.out.println("porta 4");
                //arduino.enviaDados(4);
                break;
            case "5":
                System.out.println("porta 5");
                //arduino.enviaDados(5);
                break;
            case "6":
                System.out.println("porta 6");
                //arduino.enviaDados(6);
                break;
            case "7":
                System.out.println("porta 7");
                //arduino.enviaDados(7);
                break;
            case "8":
                System.out.println("porta 8");
                //arduino.enviaDados(8);
                break;
            case "9":
                System.out.println("porta 9");
                //arduino.enviaDados(9);
                break;
            case "10":
                System.out.println("porta 10");
                //arduino.enviaDados(10);
                break;
            case "11":
                System.out.println("porta 11");
                //arduino.enviaDados(11);
                break;
            case "12":
                System.out.println("porta 12");
                //arduino.enviaDados(12);
                break;
            case "13":
                System.out.println("porta 13");
                //arduino.enviaDados(13);
                break;
            case "LIGAR MOTOR ESQUERDO":
                System.out.println("Motor esquerdo");
                //arduino.enviaDados(15);
                break;
            case "LIGAR MOTOR DIREITO":
                System.out.println("Motor direito");
                //arduino.enviaDados(16);
                break;
            case "TESTAR SENSOR SEGUIDOR DE LINHA":
                System.out.println("teste sensor");
                //arduino.enviaDados(17);
                break;
            case "VALIDAR CARGA":
                System.out.println("validar carga");
                //arduino.enviaDados(18);
                break;

        }
     }
}
