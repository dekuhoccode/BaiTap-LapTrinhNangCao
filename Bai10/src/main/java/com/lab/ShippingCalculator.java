package com.lab;

public class ShippingCalculator {

    public double calculate(double weight, String type) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }

        // Đưa "EXPRESS" và "STANDARD" ra trước dấu chấm
        if ("EXPRESS".equals(type)) return (weight * 5000) + 20000;
        if ("STANDARD".equals(type)) return weight * 3000;

        // Nếu type là null hoặc không đúng định dạng, ném ngoại lệ
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}