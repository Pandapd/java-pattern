package com.pandapd.chpt6_prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MessageBox extends Product {
    private char mChar;
    @Override
    public void use(String str) {
        int length = str.length();
        printSide(length);
        System.out.println("\n"+mChar+" "+str+" "+mChar);
        printSide(length);
    }

    /**
     * 打印边长
     */
    private void printSide(int length) {
        for (int i = 0; i < length+4; i++){
            System.out.print(mChar);
        }
    }

}
