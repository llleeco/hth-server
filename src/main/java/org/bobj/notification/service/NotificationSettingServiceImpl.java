package org.bobj.notification.service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class NotificationSettingServiceImpl extends EgovAbstractServiceImpl implements NotificationSettingService {

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
