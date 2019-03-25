package com.guang.learning.springboot.chapter7.listeners;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * 用于监听servletContext、HttpSession和servletRequest等域对象的创建和销毁事件。
 */
@WebListener
@Slf4j
public class Customlister implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        log.info("监听器：销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        log.info("监听器：初始化");
    }
}
