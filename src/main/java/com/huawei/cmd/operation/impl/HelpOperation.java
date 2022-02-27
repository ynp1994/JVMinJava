package com.huawei.cmd.operation.impl;

import com.huawei.cmd.constants.CommandConstants;
import com.huawei.cmd.operation.Operation;

/**
 * @author yunaipeng
 * @date 2022-02-24 23:17
 */
public class HelpOperation implements Operation {
    private static final HelpOperation INSTANCE = new HelpOperation();

    private static final String HELP_CONTENT =
        "用法：java [options] <主类> [args...]\n" + "           （执行类）\n" + "   或  java [options] -jar <jar 文件> [args...]\n"
            + "           （执行 jar 文件）\n" + "   或  java [options] -m <模块>[/<主类>] [args...]\n"
            + "       java [options] --module <模块>[/<主类>] [args...]\n" + "           （执行模块中的主类）\n"
            + "   或  java [options] <源文件> [args]\n" + "           （执行单个源文件程序）\n" + "\n"
            + " 将主类、源文件、-jar <jar 文件>、-m 或\n" + " --module <模块>/<主类> 后的参数作为参数\n" + " 传递到主类。\n" + "\n" + " 其中，选项包括：\n"
            + "\n" + "    -cp <目录和 zip/jar 文件的类搜索路径>\n" + "    -classpath <目录和 zip/jar 文件的类搜索路径>\n"
            + "    --class-path <目录和 zip/jar 文件的类搜索路径>\n" + "                  使用 : 分隔的, 用于搜索类文件的目录, JAR 档案\n"
            + "                  和 ZIP 档案列表。\n" + "    -p <模块路径>\n" + "    --module-path <模块路径>...\n"
            + "                  用 : 分隔的目录列表, 每个目录\n" + "                  都是一个包含模块的目录。\n"
            + "    --upgrade-module-path <模块路径>...\n" + "                  用 : 分隔的目录列表, 每个目录\n"
            + "                  都是一个包含模块的目录, 这些模块\n" + "                  用于替换运行时映像中的可升级模块\n"
            + "    --add-modules <模块名称>[,<模块名称>...]\n" + "                  除了初始模块之外要解析的根模块。\n"
            + "                  <模块名称> 还可以为 ALL-DEFAULT, ALL-SYSTEM,\n" + "                  ALL-MODULE-PATH.\n"
            + "    --list-modules\n" + "                  列出可观察模块并退出\n" + "    -d <module name>\n"
            + "    --describe-module <模块名称>\n" + "                  描述模块并退出\n"
            + "    --dry-run     创建 VM 并加载主类, 但不执行 main 方法。\n" + "                  此 --dry-run 选项对于验证诸如\n"
            + "                  模块系统配置这样的命令行选项可能非常有用。\n" + "    --validate-modules\n" + "                  验证所有模块并退出\n"
            + "                  --validate-modules 选项对于查找\n" + "                  模块路径中模块的冲突及其他错误可能非常有用。\n"
            + "    -D<名称>=<值>\n" + "                  设置系统属性\n" + "    -verbose:[class|module|gc|jni]\n"
            + "                  为给定子系统启用详细输出\n" + "    -version      将产品版本输出到错误流并退出\n"
            + "    --version     将产品版本输出到输出流并退出\n" + "    -showversion  将产品版本输出到错误流并继续\n" + "    --show-version\n"
            + "                  将产品版本输出到输出流并继续\n" + "    --show-module-resolution\n"
            + "                  在启动过程中显示模块解析输出\n" + "    -? -h -help\n" + "                  将此帮助消息输出到错误流\n"
            + "    --help        将此帮助消息输出到输出流\n" + "    -X            将额外选项的帮助输出到错误流\n"
            + "    --help-extra  将额外选项的帮助输出到输出流\n" + "    -ea[:<程序包名称>...|:<类名>]\n"
            + "    -enableassertions[:<程序包名称>...|:<类名>]\n" + "                  按指定的粒度启用断言\n"
            + "    -da[:<程序包名称>...|:<类名>]\n" + "    -disableassertions[:<程序包名称>...|:<类名>]\n"
            + "                  按指定的粒度禁用断言\n" + "    -esa | -enablesystemassertions\n" + "                  启用系统断言\n"
            + "    -dsa | -disablesystemassertions\n" + "                  禁用系统断言\n" + "    -agentlib:<库名>[=<选项>]\n"
            + "                  加载本机代理库 <库名>, 例如 -agentlib:jdwp\n" + "                  另请参阅 -agentlib:jdwp=help\n"
            + "    -agentpath:<路径名>[=<选项>]\n" + "                  按完整路径名加载本机代理库\n" + "    -javaagent:<jar 路径>[=<选项>]\n"
            + "                  加载 Java 编程语言代理, 请参阅 java.lang.instrument\n" + "    -splash:<图像路径>\n"
            + "                  使用指定的图像显示启动屏幕\n" + "                  自动支持和使用 HiDPI 缩放图像\n"
            + "                  (如果可用)。应始终将未缩放的图像文件名 (例如, image.ext)\n" + "                  作为参数传递给 -splash 选项。\n"
            + "                  将自动选取提供的最合适的缩放\n" + "                  图像。\n"
            + "                  有关详细信息, 请参阅 SplashScreen API 文档\n" + "    @argument 文件\n"
            + "                  一个或多个包含选项的参数文件\n" + "    -disable-@files\n" + "                  阻止进一步扩展参数文件\n"
            + "    --enable-preview\n" + "                  允许类依赖于此发行版的预览功能\n" + "要为长选项指定参数, 可以使用 --<名称>=<值> 或\n"
            + "--<名称> <值>。\n" + "\n" + "yunaipeng@yunaipengdeMacBook-Pro ~ % java -help\n"
            + "用法：java [options] <主类> [args...]\n" + "           （执行类）\n"
            + "   或  java [options] -jar <jar 文件> [args...]\n" + "           （执行 jar 文件）\n"
            + "   或  java [options] -m <模块>[/<主类>] [args...]\n"
            + "       java [options] --module <模块>[/<主类>] [args...]\n" + "           （执行模块中的主类）\n"
            + "   或  java [options] <源文件> [args]\n" + "           （执行单个源文件程序）\n" + "\n"
            + " 将主类、源文件、-jar <jar 文件>、-m 或\n" + " --module <模块>/<主类> 后的参数作为参数\n" + " 传递到主类。\n" + "\n" + " 其中，选项包括：\n"
            + "\n" + "    -cp <目录和 zip/jar 文件的类搜索路径>\n" + "    -classpath <目录和 zip/jar 文件的类搜索路径>\n"
            + "    --class-path <目录和 zip/jar 文件的类搜索路径>\n" + "                  使用 : 分隔的, 用于搜索类文件的目录, JAR 档案\n"
            + "                  和 ZIP 档案列表。\n" + "    -p <模块路径>\n" + "    --module-path <模块路径>...\n"
            + "                  用 : 分隔的目录列表, 每个目录\n" + "                  都是一个包含模块的目录。\n"
            + "    --upgrade-module-path <模块路径>...\n" + "                  用 : 分隔的目录列表, 每个目录\n"
            + "                  都是一个包含模块的目录, 这些模块\n" + "                  用于替换运行时映像中的可升级模块\n"
            + "    --add-modules <模块名称>[,<模块名称>...]\n" + "                  除了初始模块之外要解析的根模块。\n"
            + "                  <模块名称> 还可以为 ALL-DEFAULT, ALL-SYSTEM,\n" + "                  ALL-MODULE-PATH.\n"
            + "    --list-modules\n" + "                  列出可观察模块并退出\n" + "    -d <module name>\n"
            + "    --describe-module <模块名称>\n" + "                  描述模块并退出\n"
            + "    --dry-run     创建 VM 并加载主类, 但不执行 main 方法。\n" + "                  此 --dry-run 选项对于验证诸如\n"
            + "                  模块系统配置这样的命令行选项可能非常有用。\n" + "    --validate-modules\n" + "                  验证所有模块并退出\n"
            + "                  --validate-modules 选项对于查找\n" + "                  模块路径中模块的冲突及其他错误可能非常有用。\n"
            + "    -D<名称>=<值>\n" + "                  设置系统属性\n" + "    -verbose:[class|module|gc|jni]\n"
            + "                  为给定子系统启用详细输出\n" + "    -version      将产品版本输出到错误流并退出\n"
            + "    --version     将产品版本输出到输出流并退出\n" + "    -showversion  将产品版本输出到错误流并继续\n" + "    --show-version\n"
            + "                  将产品版本输出到输出流并继续\n" + "    --show-module-resolution\n"
            + "                  在启动过程中显示模块解析输出\n" + "    -? -h -help\n" + "                  将此帮助消息输出到错误流\n"
            + "    --help        将此帮助消息输出到输出流\n" + "    -X            将额外选项的帮助输出到错误流\n"
            + "    --help-extra  将额外选项的帮助输出到输出流\n" + "    -ea[:<程序包名称>...|:<类名>]\n"
            + "    -enableassertions[:<程序包名称>...|:<类名>]\n" + "                  按指定的粒度启用断言\n"
            + "    -da[:<程序包名称>...|:<类名>]\n" + "    -disableassertions[:<程序包名称>...|:<类名>]\n"
            + "                  按指定的粒度禁用断言\n" + "    -esa | -enablesystemassertions\n" + "                  启用系统断言\n"
            + "    -dsa | -disablesystemassertions\n" + "                  禁用系统断言\n" + "    -agentlib:<库名>[=<选项>]\n"
            + "                  加载本机代理库 <库名>, 例如 -agentlib:jdwp\n" + "                  另请参阅 -agentlib:jdwp=help\n"
            + "    -agentpath:<路径名>[=<选项>]\n" + "                  按完整路径名加载本机代理库\n" + "    -javaagent:<jar 路径>[=<选项>]\n"
            + "                  加载 Java 编程语言代理, 请参阅 java.lang.instrument\n" + "    -splash:<图像路径>\n"
            + "                  使用指定的图像显示启动屏幕\n" + "                  自动支持和使用 HiDPI 缩放图像\n"
            + "                  (如果可用)。应始终将未缩放的图像文件名 (例如, image.ext)\n" + "                  作为参数传递给 -splash 选项。\n"
            + "                  将自动选取提供的最合适的缩放\n" + "                  图像。\n"
            + "                  有关详细信息, 请参阅 SplashScreen API 文档\n" + "    @argument 文件\n"
            + "                  一个或多个包含选项的参数文件\n" + "    -disable-@files\n" + "                  阻止进一步扩展参数文件\n"
            + "    --enable-preview\n" + "                  允许类依赖于此发行版的预览功能\n" + "要为长选项指定参数, 可以使用 --<名称>=<值> 或\n"
            + "--<名称> <值>";

    private HelpOperation() {

    }

    public static HelpOperation getInstance() {
        return INSTANCE;
    }
    @Override
    public void apply(String[] args) {
        System.out.println(HELP_CONTENT);
    }

    @Override
    public String[] name() {
        return CommandConstants.HELP_NAME;
    }
}
