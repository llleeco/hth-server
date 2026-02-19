package org.bobj.notification.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class NotificationSettingServiceImpl implements NotificationSettingService {

    private final Map<Long, Boolean> settingStore = new HashMap<>();

    @Override
    public void updateNotificationSetting(Long userId, boolean enabled) {
        settingStore.put(userId, enabled);
    }

    @Override
    public boolean getNotificationSetting(Long userId) {
        return settingStore.getOrDefault(userId, true);
    }
}
