package com.pandapd.chpt15_facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {}

    public static void makeWelcomePage(String mailAddr, String htmlFileName) {
        Properties data = Database.getData("src/com/xh/chpt15_facade/db1.txt");
        String username = data.getProperty(mailAddr);
        try {
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(htmlFileName));
            htmlWriter.makeHTML("Welcome To "+username + "'s page!",
                    new String[]{"欢迎来到" + username + "的主页", "等待你的邮件！"},
                    mailAddr, username, mailAddr, username);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
