package com.pandapd.chpt15_facade;

import java.io.IOException;
import java.io.Writer;

/**
 * 用于生成欢迎网页
 */
public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    private void title(String title) throws IOException {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>").append('\n')
                .append("<head>").append('\n')
                .append("<title>").append(title).append("</title>")
                .append("</head>").append('\n')
                .append("<body>").append('\n')
                .append("<h1>").append(title).append("</h1>").append('\n');

        writer.write(sb.toString());
    }

    /**
     * 段落
     */
    private void paragraph(String pMessage) throws IOException {
        writer.write("<p>" + pMessage + "</p>\n");
    }

    /**
     * 链接
     */
    private void link(String href, String text) throws IOException {
        paragraph("<a href=" + href + ">" + text + "</a>");
    }

    /**
     * 发送邮件
     */
    private void mailTo(String mailAddr, String username)  throws  IOException{
        link("mailto: " + mailAddr, username);
    }

    /**
     * 结束标签
     */
    private void close() throws IOException {
        StringBuffer sb = new StringBuffer();
        sb.append("</body>").append('\n')
          .append("</html>").append('\n');
        writer.write(sb.toString());
        writer.close();
    }

    /**
     * 生成模板
     */
    public final void makeHTML(String title,
                               String[] pMessageList,
                               String href, String text,
                               String mailAddr, String username) throws IOException {
        title(title);
        for (String str: pMessageList) {
            paragraph(str);
        }
        mailTo(mailAddr, username);
        close();
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
}
