package com.huawei.cmd;

import com.huawei.cmd.operation.Operation;
import com.huawei.cmd.operation.OperationScanner;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.huawei.cmd.constants.CommandConstants.HELP_OPERATION;
import static com.huawei.cmd.constants.CommandConstants.VERSION_OPERATION;

/**
 * @author yunaipeng
 * @date 2022-02-22 23:25
 */
public class Command {

    private static final Map<String, Operation> OPERATION_MAP;

    static {
        List<Operation> operationList = OperationScanner.scan("com.huawei.cmd.operation.impl");
        OPERATION_MAP = Collections.unmodifiableMap(tempMap);
    }

    public static void main(String[] args) {
        Operation operation = parseOperation(args);
        operation.apply(args);
    }

    private static Operation parseOperation(String[] args) {
        if (args.length == 0) {
            return HELP_OPERATION;
        }
        String options = args[0];
        return VERSION_OPERATION;
    }
}
