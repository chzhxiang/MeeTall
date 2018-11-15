package com.example.meetallseckillproducer.pojo;

public class Quartz {

    private String jobName;
    private String jonGroup;
    private String cron;
    private String triggerName;
    private String triggerGroup;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJonGroup() {
        return jonGroup;
    }

    public void setJonGroup(String jonGroup) {
        this.jonGroup = jonGroup;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }
}
