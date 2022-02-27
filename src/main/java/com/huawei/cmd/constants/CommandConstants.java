package com.huawei.cmd.constants;

import com.huawei.cmd.operation.Operation;
import com.huawei.cmd.operation.impl.HelpOperation;
import com.huawei.cmd.operation.impl.VersionOperation;

import java.util.Arrays;

/**
 * @author yunaipeng
 * @date 2022-02-24 23:20
 */
public interface CommandConstants {
    /**
     * the version number
     */
    String VERSION = "0.0.1";
    /**
     * print the help doc operation
     */
    Operation HELP_OPERATION = HelpOperation.getInstance();

    /**
     * print the version info operation
     */
    Operation VERSION_OPERATION = VersionOperation.getInstance();

    /**
     * the name of help operation
     */
    String[] HELP_NAME = new String[] {"?", "h", "help"};

    String[] VERSION_NAME = new String[] {"version"};

}
