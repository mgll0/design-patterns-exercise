package oop.inheritance.tpv;

import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.tpv.ingenico.IngenicoDeviceFactory;
import oop.inheritance.tpv.verifone240.Verifone240mDeviceFactory;

import javax.annotation.processing.SupportedOptions;

public abstract class TpvDeviceFactory {
    public TpvDeviceFactory getFactory(SupportedTerminal supportedTerminal){
        if (supportedTerminal == SupportedTerminal.INGENICO){
            return new IngenicoDeviceFactory();
        }else {
            return new Verifone240mDeviceFactory();
        }
    }
    public abstract Display getDisplay();
    public abstract Keyboard getKeyboard();


}
