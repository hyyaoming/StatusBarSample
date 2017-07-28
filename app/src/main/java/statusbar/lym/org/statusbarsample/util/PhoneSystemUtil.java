package statusbar.lym.org.statusbarsample.util;

import android.os.Build;

/**
 * 获取当前手机厂商
 *
 * @author yaoming.li
 * @since 2017-07-28 09:53
 */
public class PhoneSystemUtil {
    private static final String XIAO_MI = "XiaoMi"; //小米
    private static final String HUA_WEI = "HuaWei";  //华为
    private static final String SAMSUNG = "samsung"; //三星
    private static final String MEI_ZU = "MeiZu";   //魅族

    /**
     * 获取当前手机厂商
     * @return  手机厂商
     */
    public static String getDeviceBrand() {
        return Build.BRAND;
    }

    /**
     * 当前手机厂商是否为华为
     *
     * @return boolean
     */
    public static boolean isHuaWei() {
        return getDeviceBrand().equalsIgnoreCase(HUA_WEI);
    }

    /***
     * 当前手机厂商是否为小米
     *
     * @return boolean
     */
    public static boolean isXiaoMi() {
        return getDeviceBrand().equalsIgnoreCase(XIAO_MI);
    }

    /**
     * 当前手机厂商是否为魅族
     *
     * @return boolean
     */
    public static boolean isMeiZu() {
        return getDeviceBrand().equalsIgnoreCase(MEI_ZU);
    }

    /**
     * 当前手机厂商是否为三星
     *
     * @return boolean
     */
    public static boolean isSAMSUNG() {
        return getDeviceBrand().equalsIgnoreCase(SAMSUNG);
    }

    /**
     * 获取手机当前系统版本号
     * @return  手机系统版本号
     */
    public static String getSystemVersionCode(){
        return Build.VERSION.RELEASE;
    }

}
