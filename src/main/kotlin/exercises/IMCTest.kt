package exercises

import org.junit.Assert
import org.junit.Test

class IMCTest {

    @Test fun calculateIMC(){
        Assert.assertEquals("Magreza", imcCalculate(55f,1.80f))
        Assert.assertEquals("Normal", imcCalculate(68.8f,1.72f))
        Assert.assertEquals("Sobrepeso", imcCalculate(80f,1.70f))
        Assert.assertEquals("Obesidade", imcCalculate(120f,1.83f))
    }

}