package zero;

import cn.hutool.core.util.StrUtil;

import java.awt.*;
import java.io.File;

/**
 * @author miller
 * @email miller(a)gmail.com
 */

public class GeneratorMain {
    public static void main(String[] args) throws Exception {
        if (args == null || args.length < 1) {
            System.err.println("请指定配置文件参数。java zero.GeneratorMain conf/zero.properties");
            System.exit(0);
        }
        PropertiesProvider.initProperties(args[0]);
        Generator g = new Generator();
        g.clean();
        String[] tables = PropertiesProvider.getProperty("table.names").split(",");
        for (String table : tables) {
            g.generateTable(table);
        }

        Desktop.getDesktop().open(new File(getPath(true)));
//		g.generateAllTable();
    }


    private static String getPath() {
        return getPath(true);
    }

    private static String getPath(boolean isShort) {
        String path;
        if (isShort) {
            path = StrUtil.format("{}", get("outRoot"));
            return path;
        }
        path = StrUtil.format("{}/java/{}/{}", get("outRoot"), get("basepackage").replaceAll("\\.", "/"), get("subpackage")).replaceAll("\\.", "/");
        return path;
    }

    private static String get(String param) {
        return PropertiesProvider.getProperty(param);
    }
}
