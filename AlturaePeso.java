/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João Vitor
 */
public class AlturaePeso {

    public static void main(String[] args) {
        // TODO code application logic here
        int idade, maisN, maisV, counter;
        double peso, altura, alturaM, pesoM;
        altura = 0;
        peso = 0;
        maisN = 999;
        maisV = 0;
        counter = 0;
        alturaM = 0;
        pesoM = 0;
        idade = 0;
        while (counter < 3) {
            counter++;
            altura = Input.readDouble("Informe a altura ");
            idade = Input.readInt("Informe a idade ");
            if (idade > maisV) {
                maisV = idade;

            }
            if (idade < maisN) {
                maisN = idade;
            }

            peso = Input.readDouble("Informe o peso ");

            alturaM = altura + alturaM;
            pesoM = peso + pesoM;
        }
        System.out.println("A pessoa mais velha é: " + maisV);
        System.out.println("A pesoa mais nova é: " + maisN);
        System.out.println("A média de altura é: " + alturaM / 3);
        System.out.println("A média de peso é de: " + pesoM / 3);

    }
}
