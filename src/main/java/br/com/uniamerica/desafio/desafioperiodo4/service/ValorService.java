package br.com.uniamerica.desafio.desafioperiodo4.service;

import br.com.uniamerica.desafio.desafioperiodo4.dto.ValorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ValorService {


    public ValorDto mostrarDatos(List<Double> valores) {
        return new ValorDto(valores);
    }

    public ValorDto obtenerDatos(List<Double> valores) {
        return new ValorDto(valores);
    }

    public double calcularMedia(List<Double> valores){
        double sum = 0;
        for (Double valor : valores) {
            sum = sum + valor;
        }
        return sum / valores.size();
    }
    public void cadastrarValor(ValorDto valorDto){

    }

    public void atualizarValor(ValorDto valorDto){

    }

}
