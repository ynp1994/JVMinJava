package com.huawei.cmd.operation;

/**
 * @author yunaipeng
 * @date 2022-02-24 23:17
 */
public interface Operation {
    /**
     * do the operation
     *
     * @param args args
     */
    void apply(String[] args);

    /**
     * the operation name
     * @return the operation name
     */
    String[] name();
}
