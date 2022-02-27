package com.huawei.cmd.operation.impl;

import com.huawei.cmd.constants.CommandConstants;
import com.huawei.cmd.operation.Operation;

/**
 * @author yunaipeng
 * @date 2022-02-24 23:17
 */
public class VersionOperation implements Operation {
    private static final VersionOperation INSTANCE = new VersionOperation();

    private VersionOperation() {

    }

    public static VersionOperation getInstance() {
        return INSTANCE;
    }
    @Override
    public void apply(String[] args) {
        System.out.println(CommandConstants.VERSION);
    }

    @Override
    public String[] name() {
        return new String[0];
    }
}
