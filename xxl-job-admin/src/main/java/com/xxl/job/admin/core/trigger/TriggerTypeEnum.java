package com.xxl.job.admin.core.trigger;

import com.xxl.job.admin.core.util.I18nUtil;

/**
 * trigger type enum

 *
 *  任务调度类型
 * @author xuxueli 2018-09-16 04:56:41
 */
public enum TriggerTypeEnum {

    MANUAL(I18nUtil.getString("jobconf_trigger_type_manual")), // 手动执行
    CRON(I18nUtil.getString("jobconf_trigger_type_cron")),  // cron 表达式执行
    RETRY(I18nUtil.getString("jobconf_trigger_type_retry")),  // 重试
    PARENT(I18nUtil.getString("jobconf_trigger_type_parent")),  // 子任务
    API(I18nUtil.getString("jobconf_trigger_type_api"));  // api 调度执行

    private TriggerTypeEnum(String title){
        this.title = title;
    }
    private String title;
    public String getTitle() {
        return title;
    }

}
