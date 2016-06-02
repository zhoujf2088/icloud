package com.cloud.cases.util;


import org.apache.log4j.Logger;

/**
 * Created by tang64 on 2015/10/28.
 */
public class LogUtil {
    //私有化构造器
    private LogUtil(){
    }

    //获取SpaceManagerInfoLogger
    public static Logger getInfoLogger(){
        return Logger.getLogger("SpaceManagerInfoLogger");
    }

    public static Logger getDebugLogger(){
        return Logger.getLogger("SpaceManagerDebugLogger");
    }

    public static Logger getWarnLogger(){
        return Logger.getLogger("SpaceManagerWarnLogger");
    }

    public static Logger getErrorLogger(){
        return Logger.getLogger("SpaceManagerErrorLogger");
    }

    public static Logger getFatalLogger(){
        return Logger.getLogger("SpaceManagerFatalLogger");
    }

    /**
     * error log
     *
     * @param message
     */
    public static void error(String message) {
        getErrorLogger().error(message);
    }

    /**
     * error log
     *
     * @param throwable
     */
    public static void error(Throwable throwable) {
        getErrorLogger().error("", throwable);
    }

    /**
     * error log
     *
     * @param throwable
     */
    public static void error(String message, Throwable throwable) {
        getErrorLogger().error(message, throwable);
    }

    /**
     * debug log
     *
     * @param throwable
     */
    public static void debug(Throwable throwable) {
        getDebugLogger().debug("", throwable);
    }

    /**
     * debug log
     *
     * @param message
     */
    public static void debug(String message) {
        getDebugLogger().debug(message);
    }

    /**
     * debug log
     *
     * @param message
     * @param throwable
     */
    public static void debug(String message, Throwable throwable) {
        getDebugLogger().debug(message, throwable);
    }

    /**
     * info log
     *
     * @param throwable
     */
    public static void info(Throwable throwable) {
        getInfoLogger().info("", throwable);
    }

    /**
     * info log
     *
     * @param message
     */
    public static void info(String message) {
        getInfoLogger().info(message);
    }

    /**
     * info log
     *
     * @param message
     * @param throwable
     */
    public static void info(String message, Throwable throwable) {
        getInfoLogger().info(message, throwable);
    }

    /**
     * fatal log
     *
     * @param message
     */
    public static void fatal(String message) {
        getFatalLogger().fatal(message);
    }

    /**
     * fatal log
     *
     * @param throwable
     */
    public static void fatal(Throwable throwable) {
        getFatalLogger().fatal("", throwable);
    }

    /**
     * fatal log
     *
     * @param message
     * @param throwable
     */
    public static void fatal(String message, Throwable throwable) {
        getFatalLogger().fatal(message, throwable);
    }

    /**
     * warn log
     *
     * @param message
     */
    public static void warn(String message) {
        getWarnLogger().warn(message);
    }

    /**
     * warn log
     *
     * @param throwable
     */
    public static void warn(Throwable throwable) {
        getWarnLogger().warn(null, throwable);
    }

    /**
     * warn log
     *
     * @param message
     * @param throwable
     */
    public static void warn(String message, Throwable throwable) {
        getWarnLogger().warn(message, throwable);
    }

    public static boolean isDebugEnabled() {
        return Logger.getRootLogger().isDebugEnabled();
    }

    public static boolean isTraceEnabled() {
        return Logger.getRootLogger().isTraceEnabled();
    }

    public static boolean isInfoEnabled() {
        return Logger.getRootLogger().isInfoEnabled();
    }
}
