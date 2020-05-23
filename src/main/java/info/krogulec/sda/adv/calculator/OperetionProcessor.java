package info.krogulec.sda.adv.calculator;

import java.util.OptionalInt;

interface OperetionProcessor {
    double process(int a, int b);
    Operetion getOperetion();
}
