package challenge;

import java.util.Arrays;
import java.util.List;

public class CriptografiaCesariana implements Criptografia {

    int numPosicoes = 3;
    String encriptado = "";

    private void validar(String texto) {
        if (texto.isEmpty()) throw new IllegalArgumentException();

        if (texto==null) throw  new NullPointerException();
    }

    @Override
    public String criptografar(String texto) {
            this.validar(texto);

        for (int i = 0; i < texto.length(); i++) {
            int caracterePosicao = texto.toLowerCase().charAt(i);
            char caractereEncriptado;

            if (caracterePosicao >= 97 & caracterePosicao <= 119) {
                caractereEncriptado = (char) (caracterePosicao + numPosicoes);
            } else if (caracterePosicao >= 119 && caracterePosicao <= 122) {
                caracterePosicao = caracterePosicao - 122;
                caractereEncriptado = (char) (96 + (numPosicoes - caracterePosicao));
            } else {
                caractereEncriptado = (char) caracterePosicao;
            }
            encriptado = encriptado + caractereEncriptado;
        }
        return encriptado;

    }

    @Override
    public String descriptografar(String textoCifrado) {
        this.validar(textoCifrado);
        for (int i = 0; i < textoCifrado.length(); i++) {
            int charPosition = textoCifrado.toLowerCase().charAt(i);
            char charEncripted;

            if (charPosition >= 100 && charPosition <= 122) {
                charEncripted = (char) (charPosition - numPosicoes);
            } else if (charPosition >= 97 && charPosition <= 99) {
                charPosition = charPosition - 97;
                charEncripted = (char) (96 - (numPosicoes - charPosition));
            } else {
                charEncripted = (char) (charPosition);
            }
            encriptado = encriptado + charEncripted;
        }

        return encriptado;

    }

}