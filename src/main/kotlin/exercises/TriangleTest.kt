package exercises

import org.junit.Assert
import org.junit.Test

class TriangleTest {

    @Test fun triangleType(){
        Assert.assertEquals("Equilátero", triangleType(10, 10, 10))
        Assert.assertEquals("Isósceles", triangleType(10, 15, 10))
        Assert.assertEquals("Escaleno", triangleType(9, 12, 15))
        Assert.assertEquals("Não é um triângulo", triangleType(5, 10, 2))
    }

}