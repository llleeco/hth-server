package org.bobj.notification.service;

public interface NotificationSettingService {
    void updateNotificationSetting(Long userId, boolean enabled);
    boolean getNotificationSetting(Long userId);
}
