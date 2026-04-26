package com.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public void login(String userName) {
        // INFO cho các mốc quan trọng
        logger.info("Người dùng {} đang đăng nhập hệ thống.", userName);

        try {
            // Logic xử lý...
        } catch (Exception e) {
            // ERROR cho ngoại lệ, truyền kèm object e để in StackTrace
            logger.error("Lỗi xảy ra khi đăng nhập cho user {}: {}", userName, e.getMessage(), e);
        }
    }
}
