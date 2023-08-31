package br.com.uniamerica.desafio.desafioperiodo4;

import br.com.uniamerica.desafio.desafioperiodo4.service.ValorService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class ValorTest {
    private ValorService valorService;
    private List<Double> valores;
    private double delta = 0.001;

    @BeforeEach
    void setup(){
        valorService = new ValorService();
        valores = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0,
                11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0, 20.0);
    }

    @Test
    public void testSomaDosValores(){
        double result = 210.0;
        double actual = valorService.calcularSoma(valores);
        Assert.assertEquals(result, actual, delta);
    }

    @Test
    public void testMaxValue(){
        double result = 20.0;
        double actual = valorService.maxValue(valores);
        Assert.assertEquals(result, actual, delta);
    }

    @Test
    public void testMinValue(){
        double result = 1.0;
        double actual = valorService.minValue(valores);
        Assert.assertEquals(result, actual, delta);
    }

    @Test
    public void testMedia(){
        double result = 10.5;
        double actual = valorService.media(valores);
        Assert.assertEquals(result, actual, delta);
    }

    @Test
    public void testDesvioPadrao(){
        double result = 5.77;
        double actual = valorService.desvioPadrao(valores);
        Assert.assertEquals(result, actual, delta);
    }

    @Test
    public void testMediana(){
        double result = 10.5;
        double actual = valorService.mediana(valores);
        Assert.assertEquals(result, actual, delta);
    }
}
