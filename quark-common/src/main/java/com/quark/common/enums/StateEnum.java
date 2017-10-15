package com.quark.common.enums;

public enum StateEnum {

    /**
     * 成功
     */
    SUCCESS(200),
    /**
     * 警告
     */
    WARN(400),
    /**
     * 错误
     */
    ERROR(500);

    private int state;

    StateEnum(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
}
