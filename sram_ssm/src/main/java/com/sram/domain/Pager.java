package com.sram.domain;

import java.util.List;

public class Pager<Menu> {
    /*
      总共多少条
    * */
    private int totalRecord;

    /*
    * 每页显示所少条
    * */
    private int pageSize;

    /*
    总共多少页
    * */

    private int totalPage;

    /*
    第几页
    * */
    private int pageIndex;

    /*
    放置具体数据列表
    * */
    private List<Menu> datas;

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public List<Menu> getDatas() {
        return datas;
    }

    public void setDatas(List<Menu> datas) {
        this.datas = datas;
    }

    public Pager(int totalRecord, int pageSize, int totalPage, int pageIndex, List<Menu> datas) {
        this.totalRecord = totalRecord;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
        this.pageIndex = pageIndex;
        this.datas = datas;
    }

    public Pager() {
    }


}
