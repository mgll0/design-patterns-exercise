package oop.inheritance;

import oop.inheritance.data.SupportedTerminal;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class MainTest {

    @Test
    public void testRun(){
        // Given
        Application application = mock(Application.class);

        //When
        Main.run(application);

        //Then
    }


    @Test
    public void when1IsTyped_thenDoSaleIsCalled(){
        Application application = mock(Application.class);
        when(application.readKey()).thenReturn("1");

        Main.run(application);

        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).doSale();

        verifyNoMoreInteractions((application));
    }

    @Test
    public void when2IsTyped_thendoRefundIsCalled(){
        Application application = mock(Application.class);
        when(application.readKey()).thenReturn("2");

        Main.run(application);

        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).doRefund();

        verifyNoMoreInteractions((application));
    }

    @Test
    public void when3IsTyped_thenPrintReportIsCalled(){
        Application application = mock(Application.class);
        when(application.readKey()).thenReturn("3");

        Main.run(application);

        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).printReport();

        verifyNoMoreInteractions((application));

    }

    @Test
    public void when4IsTyped_thenShowConfiguratioIsCalled(){
        Application application = mock(Application.class);
        ArgumentCaptor<String> param = ArgumentCaptor.forClass(String.class);

        when(application.readKey()).thenReturn("4");

        Main.run(application);

        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).showConfiguration();

        verifyNoMoreInteractions((application));
    }

}
