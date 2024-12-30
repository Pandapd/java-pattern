package com.pandapd.chpt6_prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class UnderlinePen extends Product {
    private char uChar;
    @Override
    public void use(String str) {
        System.out.println(str);
        printLine(str.length());
    }

    private void printLine(int length) {
        for (int i = 0; i < length;i++){
            System.out.print(uChar);
        }
        System.out.println();
    }



}
