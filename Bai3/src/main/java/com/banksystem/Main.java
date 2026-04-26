package com.banksystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("=== HE THONG NGAN HANG DANG KHOI DONG ===");

        BankService bankService = new BankService();

        System.out.println("Thuc hien rut 500.0...");
        bankService.withdraw(500.0);

        System.out.println("Thuc hien rut 1000.0...");
        bankService.withdraw(1000.0);

        logger.info("=== CHUONG TRINH KET THUC ===");
    }
}