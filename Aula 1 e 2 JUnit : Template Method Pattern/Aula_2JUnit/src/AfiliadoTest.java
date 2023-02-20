import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfiliadoTest {
    @BeforeEach
    void doBefore(){
        Vendedor func1 = new Funcionario ( "Pedrinho", 10, 5, 2);
        Vendedor func2 = new Funcionario ( "Mariazinha", 11, 5, 5);
        Vendedor func3 = new Afiliado (Renato,  10, 5, 2);
        Vendedor func4 = new Afiliado ( "Pedrinho", 10, 5, 2);
        Vendedor func5 = new Afiliado ( "Pedrinho", 10, 5, 2);


    }

    @Test
    void mostraCategoria(){
        func1.mostraCategoria();
    }


}