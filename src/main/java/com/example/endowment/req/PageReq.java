package com.example.endowment.req;


public class PageReq {
    private int page;

    private int limit;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "PageReq{" +
                "page=" + page +
                ", limit=" + limit +
                '}';
    }
}
