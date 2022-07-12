package com.ntsybj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;


/**
 * 启用 Spring 的异步方法执行功能
 * @author Alan
 * @create 2022-07-01-15:40
 */
@EnableAsync
@Configuration
public class YbjExecutorConfig {

    /**
     * 核心线程数量，默认1
     */
    private int corePoolSize = 3;

    /**
     * 最大线程数量，默认Integer.MAX_VALUE;
     */
    private int maxPoolSize = 5;

    /**
     * 空闲线程存活时间
     */
    private int keepAliveSeconds = 60;

    /**
     * 线程阻塞队列容量,默认Integer.MAX_VALUE
     */
    private int queueCapacity = 1;

    /**
     * 是否允许核心线程超时
     */
    private boolean allowCoreThreadTimeOut = false;



    @Bean("YbjAsyncExecutor")
    public Executor asyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 配置核心线程数量
        executor.setCorePoolSize(corePoolSize);
        // 配置最大线程数
        executor.setMaxPoolSize(maxPoolSize);
        // 配置队列容量
        executor.setQueueCapacity(queueCapacity);
        // 配置空闲线程存活时间
        executor.setKeepAliveSeconds(keepAliveSeconds);

        executor.setAllowCoreThreadTimeOut(allowCoreThreadTimeOut);

        // 设置拒绝策略，直接在execute方法的调用线程中运行被拒绝的任务
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());

        // 执行初始化
        executor.initialize();
        return executor;
    }

}
