package com.huawei.cmd.operation;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yunaipeng
 * @date 2022-02-25 00:08
 */
public class OperationScanner {

    public static List<Operation> scan(String[] basePackages) {
        ArrayList<Operation> operations = new ArrayList<>();
        for (String basePackage : basePackages) {
            operations.addAll(scan(basePackage));
        }
        return operations;
    }

    public static List<Operation> scan(String basePackage) {
        URL url = OperationScanner.class.getResource("");
        return new ArrayList<>();
    }
}
