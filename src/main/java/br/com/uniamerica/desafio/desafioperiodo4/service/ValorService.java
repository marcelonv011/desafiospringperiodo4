package br.com.uniamerica.desafio.desafioperiodo4.service;

import br.com.uniamerica.desafio.desafioperiodo4.dto.ValorDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ValorService {


    public ValorDto mostrarDatos(List<Double> valores) {
        return new ValorDto(valores);
    }

    public ValorDto obtenerDatos(List<Double> valores) {
        return new ValorDto(valores);
    }

    public double calcularSuma(List<Double> valores) {
        double suma = 0;
        for (Double valor : valores) {
            suma += valor;
        }
        return suma;
    }

    public double obtenerValorMaximo(List<Double> valores) {
        if (valores.isEmpty()) {
            throw new IllegalArgumentException("La lista de valores está vacía");
        }
        double maximo = valores.get(0);
        for (Double valor : valores) {
            if (valor > maximo) {
                maximo = valor;
            }
        }
        return maximo;
    }

    public double obtenerValorMinimo(List<Double> valores) {
        if (valores.isEmpty()) {
            throw new IllegalArgumentException("La lista de valores está vacía");
        }
        double minimo = valores.get(0);
        for (Double valor : valores) {
            if (valor < minimo) {
                minimo = valor;
            }
        }
        return minimo;
    }

    public double calcularMedia(List<Double> valores) {
        double suma = calcularSuma(valores);
        return suma / valores.size();
    }

    public double calcularDesviacionEstandar(List<Double> valores) {
        double media = calcularMedia(valores);
        double sumaCuadrados = 0;
        for (Double valor : valores) {
            sumaCuadrados += Math.pow(valor - media, 2);
        }
        double varianza = sumaCuadrados / valores.size();
        return Math.sqrt(varianza);
    }

    public double calcularMediana(List<Double> valores) {
        if (valores.isEmpty()) {
            throw new IllegalArgumentException("La lista de valores está vacía");
        }
        List<Double> valoresOrdenados = new ArrayList<>(valores);
        Collections.sort(valoresOrdenados);
        int tamaño = valoresOrdenados.size();
        if (tamaño % 2 == 0) {
            int indice1 = tamaño / 2 - 1;
            int indice2 = tamaño / 2;
            return (valoresOrdenados.get(indice1) + valoresOrdenados.get(indice2)) / 2.0;
        } else {
            int indice = tamaño / 2;
            return valoresOrdenados.get(indice);
        }
    }


    public void cadastrarValor(ValorDto valorDto){

    }

    public void atualizarValor(ValorDto valorDto){

    }
    public int obtenerCantidadDatos(List<Double> valores) {
        return valores.size();
    }

    public double calcularSoma(List<Double> valores) {
        return 0;
    }

    public double maxValue(List<Double> valores) {
        return 0;
    }

    public double minValue(List<Double> valores) {
        return 0;
    }

    public double media(List<Double> valores) {
        return 0;
    }

    public double desvioPadrao(List<Double> valores) {
        return 0;
    }

    public double mediana(List<Double> valores) {
        return 0;
    }
}
