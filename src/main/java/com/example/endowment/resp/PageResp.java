package com.example.endowment.resp;

import java.util.List;

public class PageResp<T> {
    private long total;

    private List<T> items;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "PageResp{" +
                "total=" + total +
                ", items=" + items +
                '}';
    }
}
