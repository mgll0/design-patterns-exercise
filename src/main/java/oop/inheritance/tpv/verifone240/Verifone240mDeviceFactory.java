package oop.inheritance.tpv.verifone240;

import oop.inheritance.tpv.Display;
import oop.inheritance.tpv.Keyboard;
import oop.inheritance.tpv.TpvDeviceFactory;

public class Verifone240mDeviceFactory extends TpvDeviceFactory {

    @Override
    public Display getDisplay() {
        return new Verifone240mDisplayAdapter();
    }

    @Override
    public Keyboard getKeyboard() {
        return new Verifone240mKeyboardAdapter();
    }
}
