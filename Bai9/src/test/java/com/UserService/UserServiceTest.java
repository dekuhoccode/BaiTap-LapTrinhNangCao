package com.UserService;

import org.junit.jupiter.api.Test;

public class UserServiceTest {
    @Test
    public void testLogging() {
        UserService service = new UserService();
        // Test mức INFO
        service.login("HuyHoang");

        // Test mức ERROR (giả lập lỗi)
        // Bạn có thể chỉnh sửa hàm login để ném Exception nếu muốn thấy log lỗi rõ hơn
    }
}