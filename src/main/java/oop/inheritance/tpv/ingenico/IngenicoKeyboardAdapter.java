package oop.inheritance.tpv.ingenico;

import oop.inheritance.tpv.Keyboard;
import oop.library.ingenico.services.IngenicoKeyboard;

public class IngenicoKeyboardAdapter implements Keyboard {
    private IngenicoKeyboard keyboard = new IngenicoKeyboard();
    public String getChar(){
        return keyboard.getChar();
    }
}
