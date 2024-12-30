package com.pandapd.chpt8_abstrct_factory.item.impl;

import com.pandapd.chpt8_abstrct_factory.item.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html lang=\"html\"><head>\n");
        sb.append("<h1>").append(this.title).append("</h1>\n");
        sb.append("<title>").append(this.title).append("</title>\n");
        sb.append("<body>\n");
        sb.append("<ul>\n");
        //*挂载子节点*
        this.contentList.forEach(item -> {
            sb.append(item.makeHTML());
        });
        sb.append("</ul>\n");
        sb.append("<hr><address>").append(this.author).append("</address>\n");
        sb.append("</body></html>\n");
        return sb.toString();
    }
}
